package online.wenmeng.service;

import online.wenmeng.bean.Callleave;
import online.wenmeng.bean.CallleaveExample;
import online.wenmeng.bean.Carfriend;
import online.wenmeng.config.Config;
import online.wenmeng.dao.CallleaveMapper;
import online.wenmeng.dao.CarfriendMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.utils.MyUtils;
import online.wenmeng.utils.SentEmail;
import online.wenmeng.utils.TransitionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/16 1:04
 * @Descrintion:
 * @version: 1.0
 */
@RestController
public class CallLeaveService {

    @Autowired
    private CallleaveMapper callleaveMapper;

    @Autowired
    private CarfriendMapper carfriendMapper;



    public Map<String, Object> getMessage(HttpSession session) {
        //获取用户信息
        int openIdBySession = MyUtils.getOpenIdBySession(session);
        //判断用户ID中是否存在请出的信息,
        if (Config.callLeaveMap.containsKey(openIdBySession)){//如果存在
            //获取拼车中的ID
            List<Integer> carPollingIds = Config.callLeaveMap.get(openIdBySession);
            //获取拼车信息，可能有多个，使用List返回
            List<List<Callleave>> callleaves = new ArrayList<>();
            for(Integer carPollingId : carPollingIds){
                CallleaveExample callleaveExample = new CallleaveExample();
                callleaveExample.createCriteria().andPollingcaridEqualTo(carPollingId);
                callleaves.add(callleaveMapper.selectByExample(callleaveExample));
            }
            return MyUtils.getNewMap(Config.SUCCESS,null,null,callleaves);
        }
        return MyUtils.getNewMap(Config.ERROR,null,null,null);
    }


    /**
     * 发起请出队友，请出队友的ID
     * @param carId 此次拼车的ID
     * @param outId 被请出去人的ID
     * @return 返回
     */
    public Map<String, Object> letOut(HttpSession session, int carId, int outId, String leavecause) throws ParameterErrorException {
        //获取userId
        int openIdBySession = MyUtils.getOpenIdBySession(session);
        //获取拼车ID
        Carfriend carfriend = carfriendMapper.selectByPrimaryKey(carId);
        if (carfriend!=null){
            //获取到所有的ID
            List<Integer> carFriendIds = new ArrayList<>();
            carFriendIds.add(carfriend.getPoolingcarid());
            String userids = carfriend.getUserids();
            if (userids!=null){
                String[] split = userids.split(Config.splitUsers);
                for(String id : split){
                    Integer userOpenId = TransitionUtil.transitionType(id.trim(), Integer.class);
                    carFriendIds.add(userOpenId);
                    if (userOpenId.equals(outId)){
                        //邮件通知，通知用户登录查看
                        SentEmail.sentEmail(Config.okTallEmail,Config.MSG ,Config.MSG);
                    }else {
                        //通知所以的用户进行提示
                        SentEmail.sentEmail(Config.okTallEmail,Config.MSG ,Config.MSG);
                    }
                }
                //添加请出用户的信息
                Callleave callleave = new Callleave(null,openIdBySession,carId,outId,null,null,leavecause,new Date(),null,null);
                int callleaveid;
                while (true){
                    callleaveid = MyUtils.getRandomNum();
                    if (callleaveMapper.selectByPrimaryKey(callleaveid)==null){
                        break;
                    }
                }
                //设置拼车ID
                callleave.setCallleaveid(callleaveid);

                if (callleaveMapper.insert(callleave)>0){
                    //返回状态
                    return MyUtils.getNewMap(Config.SUCCESS,null,null,callleave);
                }
            }
        }
        throw new ParameterErrorException();
    }
}
