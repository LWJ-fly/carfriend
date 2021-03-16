package online.wenmeng.service;

import online.wenmeng.bean.*;
import online.wenmeng.config.Config;
import online.wenmeng.dao.CallleaveMapper;
import online.wenmeng.dao.CarfriendMapper;
import online.wenmeng.dao.UinacarinfoMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.utils.MyUtils;
import online.wenmeng.utils.SentEmail;
import online.wenmeng.utils.TransitionUtil;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.time.chrono.IsoChronology;
import java.util.*;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/16 1:04
 * @Descrintion:
 * @version: 1.0
 */
@Service
public class CallLeaveService {

    @Autowired
    private CallleaveMapper callleaveMapper;

    @Autowired
    private CarfriendMapper carfriendMapper;

    @Autowired
    private UinacarinfoMapper uinacarinfoMapper;



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
            return MyUtils.getNewMap(Config.SUCCESS,true,null,callleaves);
        }
        return MyUtils.getNewMap(Config.SUCCESS,false,null,null);
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
        //获取拼车信息
        Carfriend carfriend = carfriendMapper.selectByPrimaryKey(carId);
        if (carfriend!=null){
            int callleaveid;
            while (true){
                callleaveid = MyUtils.getRandomNum();
                if (callleaveMapper.selectByPrimaryKey(callleaveid)==null){
                    break;
                }
            }

            //获取到所有的ID
            List<Integer> carFriendIds = new ArrayList<>();
            carFriendIds.add(carfriend.getPoolingcarid());
            String userids = carfriend.getUserids();
            if (userids!=null){
                String[] split = userids.split(Config.splitUsers);
                if (split.length<Config.MinNumberOfLeaveOther){
                    return MyUtils.getNewMap(Config.ERROR,Config.ERROR,"The number of people in the team is small, and suggest that you quit",null);
                }
                for(String id : split){
                    Integer userOpenId = TransitionUtil.transitionType(id.trim(), Integer.class);
                    UinacarinfoKey uinacarinfoKey = new UinacarinfoKey();
                    uinacarinfoKey.setUserid(userOpenId);
                    uinacarinfoKey.setPoolingcarid(carId);
                    Uinacarinfo uinacarinfo = uinacarinfoMapper.selectByPrimaryKey(uinacarinfoKey);
                    carFriendIds.add(userOpenId);
                    if(Config.callLeaveMap.containsKey(userOpenId)){
                        List<Integer> integers = Config.callLeaveMap.get((Integer) userOpenId);
                        integers.add(callleaveid);
                        Config.callLeaveMap.put(userOpenId,integers);
                    }else {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(callleaveid);
                        Config.callLeaveMap.put(userOpenId,list);
                    }
                    if (userOpenId.equals(outId)){
                        //邮件通知，通知用户登录查看
                        SentEmail.sentEmail(uinacarinfo.getEmail(),Config.letOutTallEmail ,Config.Logo);
                    }else {
                        //通知所以的用户进行提示
                        SentEmail.sentEmail(uinacarinfo.getEmail(),Config.letOutTallEmail ,Config.Logo);
                    }
                }
                //添加请出用户的信息
                Callleave callleave = new Callleave(null,openIdBySession,carId,outId,null,null,leavecause,new Date(),null,null);

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

    public Map<String, Object> getCallOut(HttpSession session,int carId) throws ParameterErrorException {
        //获取登录的用户ID
        Integer userId = MyUtils.getOpenIdBySession(session);
        //查询拼车信息
        Carfriend carfriend = carfriendMapper.selectByPrimaryKey(carId);
        if (carfriend.getPoolinguserid().equals(userId)||carfriend.getUserids().contains(userId+"")){
            //根据用户ID 与拼车ID查询发起请出订单
            CallleaveExample callleaveExample = new CallleaveExample();
            callleaveExample.createCriteria().andPollingcaridEqualTo(carId);
            return MyUtils.getNewMap(Config.SUCCESS,null,null,callleaveMapper.selectByExample(callleaveExample));
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> getCallOutDec(int callleaveid) {
        return MyUtils.getNewMap(Config.SUCCESS,null,null,callleaveMapper.selectByPrimaryKey(callleaveid));
    }

    public Map<String, Object> dealCallOut(HttpSession session, int callleaveid, Boolean deal) throws ParameterErrorException {
        //获取此人ID
        Integer userId = MyUtils.getOpenIdBySession(session);
        //获取请出他人拼车信息
        Callleave callleave = callleaveMapper.selectByPrimaryKey(callleaveid);
        if (!Config.callLeaveMap.containsKey(userId)||callleave.getCallresult()!=null){
            throw new ParameterErrorException();
        }
        //获取拼车中的信息
        Carfriend carfriend = carfriendMapper.selectByPrimaryKey(callleave.getPollingcarid());
        if (carfriend.getPoolinguserid().equals(userId)||carfriend.getUserids().contains(userId+"")){
            if (deal){
                String agreeids = callleave.getAgreeids();
                if (agreeids==null){
                    agreeids = userId+"";
                }else {
                    agreeids+=Config.splitUsers+userId;
                }
                callleave.setAgreeids(agreeids);
            }else {
                String disagreeids = callleave.getDisagreeids();
                if (disagreeids==null){
                    disagreeids = userId+"";
                }else {
                    disagreeids+=Config.splitUsers+userId;
                }
                callleave.setDisagreeids(disagreeids);
                //有人不同意，就此结束
                //遍历列表，清除所有的未读消息
                clearAllInfo(callleaveid);
                //将此设置为结束
                callleave.setCallresult(Config.callleave_instatus_fail);
            }


            //判断还没有处理的人，给出提示
            List<Integer> usersByCarfriend = MyUtils.getUsersByCarfriend(carfriend);
            List<Integer> usersByCallleave = MyUtils.getUsersByCallleave(callleave);
            for(Integer dealId:usersByCallleave){
                usersByCarfriend.remove((Integer)dealId);
            }
            if (usersByCarfriend.size()<=0){//队友都参与完成
                //将此设置为结束
                callleave.setCallresult(Config.callleave_instatus_Success);
                //结束时间
                callleave.setEndtime(new Date());
                //将此人移入历史
                moveToHistory(carfriend.getPoolingcarid(),callleave.getToleaveid());
            }

            if (callleaveMapper.updateByPrimaryKeySelective(callleave)>0){
                List<Integer> integers = Config.callLeaveMap.get(userId);
                integers.remove((Integer)callleaveid);
                if (integers.size()>0){
                    Config.callLeaveMap.put(userId,integers);
                }else {
                    Config.callLeaveMap.remove((Integer)userId);
                }


                return MyUtils.getNewMap(Config.SUCCESS,usersByCarfriend,carfriend,callleave);
            }
        }
        throw new ParameterErrorException();
    }

    /**
     * 清除列表中有关【发起请出他人的】callleaveid的消息
     * @param callleaveid 发起请出他人的ID
     */
    public void clearAllInfo(Integer callleaveid){
        //获取所有用户——>遍历所有信息，如果有就移除掉
        Set<Integer> integers = Config.callLeaveMap.keySet();
        for (Integer userId:integers){
            List<Integer> list = Config.callLeaveMap.get(userId);
            if (list.contains((Integer)callleaveid)){
                list.remove((Integer)callleaveid);
                if (list.size()>0){
                    Config.callLeaveMap.put((Integer)userId,list);
                }
            }
        }

    }

    /**
     * 将用户移入历史
     */
    public Boolean moveToHistory(Integer poolingcarid,Integer leaveUserId){
        //查找到拼车信息
        Carfriend carfriend = carfriendMapper.selectByPrimaryKey(poolingcarid);
        //获取全部用户信息
        List<Integer> carfriendIds = MyUtils.getUsersByCarfriend(carfriend);
        //判断是否存在
        if (carfriendIds.contains(leaveUserId)){
            carfriendIds.remove((Integer)leaveUserId);
            if (carfriend.getPoolinguserid().equals(leaveUserId)){//如果是拼车发起者
                Integer integer = carfriendIds.get(0);
                carfriend.setPoolinguserid(integer);
                carfriendIds.remove((Integer)integer);
            }else {
                carfriendIds.remove((Integer)carfriend.getPoolinguserid());
            }

            String userIds = null;
            for (Integer userId: carfriendIds){
                if (userIds==null){
                    userIds = userId+"";
                }else {
                    userIds += Config.splitUsers+userId;
                }
            }
            carfriend.setUserids(userIds);
            if (carfriendMapper.updateByPrimaryKey(carfriend)>0){
                return true;
            }
        }
        return false;
    }
}
