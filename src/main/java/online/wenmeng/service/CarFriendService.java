package online.wenmeng.service;

import online.wenmeng.bean.*;
import online.wenmeng.config.Config;
import online.wenmeng.dao.CarfriendMapper;
import online.wenmeng.dao.UinacarinfoMapper;
import online.wenmeng.dao.UinfoMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.exception.ServerException;
import online.wenmeng.utils.MyUtils;
import online.wenmeng.utils.SentEmail;
import online.wenmeng.utils.TransitionUtil;
import online.wenmeng.utils.VerifyUtil;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/14 1:33
 * @Descrintion:
 * @version: 1.0
 */
@Service
public class CarFriendService {

    @Autowired
    private CarfriendMapper carfriendMapper;

    @Autowired
    private UinacarinfoMapper uinacarinfoMapper;

    @Autowired
    private UinfoMapper uinfoMapper;


    public Map<String, Object> findAllCarFriend() {
        CarfriendExample carfriendExample = new CarfriendExample();
        carfriendExample.createCriteria().andPoolingstatusEqualTo(Config.carfriend_poolingstatus_ing);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carfriendMapper.selectByExample(carfriendExample));
    }

    public Map<String, Object> findCarFriendByOrigin(String origin) {
        CarfriendExample carfriendExample = new CarfriendExample();
        carfriendExample.createCriteria().andPoolingstatusEqualTo(Config.carfriend_poolingstatus_ing).andReadyplaceEqualTo(origin);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carfriendMapper.selectByExample(carfriendExample));
    }

    public Map<String, Object> findCarFriendByLikeOrigin(String origin) {
        CarfriendExample carfriendExample = new CarfriendExample();
        carfriendExample.createCriteria().andPoolingstatusEqualTo(Config.carfriend_poolingstatus_ing).andReadyplaceLike("%"+origin+"%");
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carfriendMapper.selectByExample(carfriendExample));
    }

    public Map<String, Object> findCarFriendByBourn(String bourn) {
        CarfriendExample carfriendExample = new CarfriendExample();
        carfriendExample.createCriteria().andPoolingstatusEqualTo(Config.carfriend_poolingstatus_ing).andGoplaceEqualTo(bourn);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carfriendMapper.selectByExample(carfriendExample));
    }

    public Map<String, Object> findCarFriendByLikeBourn(String bourn) {
        CarfriendExample carfriendExample = new CarfriendExample();
        carfriendExample.createCriteria().andPoolingstatusEqualTo(Config.carfriend_poolingstatus_ing).andGoplaceLike("%"+bourn+"%");
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carfriendMapper.selectByExample(carfriendExample));
    }

    public Map<String, Object> findCarFriendByTrip(String origin, String bourn) {
        CarfriendExample carfriendExample = new CarfriendExample();
        carfriendExample.createCriteria().andPoolingstatusEqualTo(Config.carfriend_poolingstatus_ing).andReadyplaceEqualTo(origin).andGoplaceEqualTo(bourn);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carfriendMapper.selectByExample(carfriendExample));
    }

    public Map<String, Object> findCarFriendByLikeTrip(String origin, String bourn) {
        CarfriendExample carfriendExample = new CarfriendExample();
        carfriendExample.createCriteria().andPoolingstatusEqualTo(Config.carfriend_poolingstatus_ing).andReadyplaceLike("%"+origin+"%").andGoplaceLike("%"+bourn+"%");
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carfriendMapper.selectByExample(carfriendExample));
    }

    /**
     * 创建拼车
     * @param session
     * @param carfriend
     * @return
     */
    public Map<String, Object> createCarFriend(HttpSession session, Carfriend carfriend) throws ServerException {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        carfriend.setPoolinguserid(openId);
        carfriend.setUserids(null);
        carfriend.setPoolingstatus(Config.carfriend_poolingstatus_ing);
        carfriend.setLeaveids(null);
        int poolingcarid;
        while (true){
            poolingcarid = MyUtils.getRandomNum();
            if (carfriendMapper.selectByPrimaryKey(poolingcarid)==null){
                carfriend.setPoolingcarid(poolingcarid);
                break;
            }
        }
        //插入数据库成功
        if (carfriendMapper.insert(carfriend)>0){
            //首先默认自己全部信息
            Uinfo uinfo = uinfoMapper.selectByPrimaryKey(openId);
            //将自己信息进行相应的更改
            Uinacarinfo uinacarinfo = new Uinacarinfo((String)userLoginInfo.get(Config.NickName),(String) userLoginInfo.get(Config.ChatHead),"男".equals(userLoginInfo.get(Config.Gender))?1:0,
                    null,new Date(),null,Config.uinacarinfo_instatus_join,16,uinfo.getQqnum(),uinfo.getWxnum(),uinfo.getPhone(),uinfo.getEmail());
            uinacarinfo.setPoolingcarid(poolingcarid);
            uinacarinfo.setUserid(openId);
            if (uinacarinfoMapper.insert(uinacarinfo)>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,carfriend);
            }
        }
        throw new ServerException();
    }

    /**
     * 加入拼车信息
     * @param session
     * @param uinacarinfo
     * @param listenerStatus
     * @return
     * @throws ParameterErrorException
     */
    public Map<String, Object> joinCarFriend(HttpSession session, Uinacarinfo uinacarinfo,Boolean listenerStatus) throws ParameterErrorException {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        Integer openId = (Integer) userLoginInfo.get(Config.Openid);
        //基本情况不能为空
        if (uinacarinfo.getPoolingcarid()!=null){
            //查询车辆是否存在
            Carfriend carfriend = carfriendMapper.selectByPrimaryKey(uinacarinfo.getPoolingcarid());
            if (carfriend!=null&&carfriend.getPoolinguserid().equals(openId)&&!carfriend.getUserids().contains(""+openId)&&carfriend.getGetnum()>0){
                int i = 0;
                if (uinacarinfo.getQqnum()!=null&& VerifyUtil.checkWXOrQQ(uinacarinfo.getQqnum())){
                    i = Config.uinacarinfo_outinfo_qqnum;
                }else {
                    uinacarinfo.setQqnum(null);
                }
                if (uinacarinfo.getWxnum()!=null&& VerifyUtil.checkWXOrQQ(uinacarinfo.getWxnum())){
                    i+=Config.uinacarinfo_outinfo_wxnum;
                }else {
                    uinacarinfo.setWxnum(null);
                }

                if (uinacarinfo.getPhone()!=null&& VerifyUtil.isChinaPhoneLegal(uinacarinfo.getPhone())){
                    i+=Config.uinacarinfo_outinfo_phone;
                }else {
                    uinacarinfo.setPhone(null);
                }

                if (uinacarinfo.getEmail()!=null&& VerifyUtil.checkEmail(uinacarinfo.getEmail())){
                    i+=Config.uinacarinfo_outinfo_email;
                }else {
                    uinacarinfo.setEmail(null);
                }

                if (listenerStatus&&uinacarinfo.getEmail()!=null){
                    i+= Config.uinacarinfo_outinfo_tallemail;
                }

                uinacarinfo.setUserid(openId);
                uinacarinfo.setNickname((String) userLoginInfo.get(Config.ChatHead));
                uinacarinfo.setGender("男".equals(userLoginInfo.get(Config.Gender))?1:0);
                uinacarinfo.setChathead((String) userLoginInfo.get(Config.ChatHead));
                uinacarinfo.setJointime(new Date());
                uinacarinfo.setInstatus(Config.uinacarinfo_instatus_join);
                uinacarinfo.setOutinfo(i);
                //插入数据成功
                if (uinacarinfoMapper.insert(uinacarinfo)>0){
                    //更新拼车信息
                    if(carfriend.getUserids()==null){
                        carfriend.setUserids(openId+"");
                    }else {
                        carfriend.setUserids(carfriend.getUserids()+Config.splitUsers+openId);
                    }
                    carfriend.setGetnum(carfriend.getGetnum()-1);
                    if (carfriend.getGetnum()<=0){
                        carfriend.setPoolingstatus(Config.carfriend_poolingstatus_end);
                        //此处调用邮件！ 逐步通知所有用户
                        tallEmail(carfriend);
                    }
                    //拼车更新完成
                    if (carfriendMapper.updateByPrimaryKeySelective(carfriend)>0){
                        return MyUtils.getNewMap(Config.SUCCESS,null,null,carfriend);
                    }
                }

            }
        }
        throw new ParameterErrorException();
    }

    /**
     * 通知所有用户，拼车完成
     */
    private void tallEmail(Carfriend carfriend){
        if (carfriend!=null){
            UinacarinfoKey uinacarinfoKey = new Uinacarinfo();
            uinacarinfoKey.setPoolingcarid(carfriend.getPoolingcarid());
            uinacarinfoKey.setUserid(carfriend.getPoolinguserid());
            Uinacarinfo uinacarinfo = uinacarinfoMapper.selectByPrimaryKey(uinacarinfoKey);
            if (MyUtils.uinacarinfoHaveOutinfo(uinacarinfo.getOutinfo(),Config.uinacarinfo_outinfo_tallemail)){
                SentEmail.sentEmail(uinacarinfo.getEmail(),Config.okTallEmail,Config.Logo);
            }
            String[] split = carfriend.getUserids().split(Config.splitUsers);
            for (int i = 0; i < split.length; i++) {
                uinacarinfoKey.setUserid(TransitionUtil.transitionType(split,Integer.class));
                uinacarinfo = uinacarinfoMapper.selectByPrimaryKey(uinacarinfoKey);
                if (MyUtils.uinacarinfoHaveOutinfo(uinacarinfo.getOutinfo(),Config.uinacarinfo_outinfo_tallemail)){
                    SentEmail.sentEmail(uinacarinfo.getEmail(),Config.okTallEmail,Config.Logo);
                }
            }
        }
    }

    /**
     * 通过主键获取用户拼车信息
     * @param carId 拼车信息的ID
     * @param userId 用户的ID
     * @return
     */
    public Uinacarinfo getUinacarinfoByCarIdAndUserId(int carId,int userId){
        UinacarinfoKey uinacarinfoKey = new Uinacarinfo();
        uinacarinfoKey.setPoolingcarid(carId);
        uinacarinfoKey.setUserid(userId);
        return uinacarinfoMapper.selectByPrimaryKey(uinacarinfoKey);
    }

    public List<Uinacarinfo> hideUinaCarInfo(List<Uinacarinfo> uinacarinfoList){
        List<Uinacarinfo> hideUinacarinfoList = new ArrayList<>();
        for (Uinacarinfo uinacarinfo:uinacarinfoList) {
            hideUinacarinfoList.add(hideProcessing(uinacarinfo));
        }
        return hideUinacarinfoList;
    }

    public Uinacarinfo hideProcessing(Uinacarinfo uinacarinfo){
        uinacarinfo.setEmail(hideStrProcessing(uinacarinfo.getEmail()));
        uinacarinfo.setPhone(hideStrProcessing(uinacarinfo.getPhone()));
        uinacarinfo.setQqnum(hideStrProcessing(uinacarinfo.getQqnum()));
        uinacarinfo.setWxnum(hideStrProcessing(uinacarinfo.getWxnum()));
        return uinacarinfo;
    }

    public String hideStrProcessing(String str){
        return str.substring(0,3)+"****"+str.substring(str.length()-3,str.length());
    }
    public Long hideStrProcessing(Long num){
        String str = num.toString();
        return TransitionUtil.transitionType(str.substring(0,3)+"0000"+str.substring(str.length()-3,str.length()),Long.class);
    }

    public Map<String, Object> findMyDetailCarFriend(HttpSession session, int carId) {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        //获取到拼车信息
        Carfriend carfriend = carfriendMapper.selectByPrimaryKey(carId);
        //获取到所有的拼车信息
        List<Uinacarinfo> uinacarinfoList = new ArrayList<>();
        //发起拼车人的信息
        uinacarinfoList.add(getUinacarinfoByCarIdAndUserId(carfriend.getPoolingcarid(),openId));
        String userids = carfriend.getUserids();
        if (userids!=null) {
            String[] userIds = userids.split(Config.splitUsers);
            for (String userId:userIds) {
                uinacarinfoList.add(getUinacarinfoByCarIdAndUserId(carfriend.getPoolinguserid(), TransitionUtil.transitionType(userId.trim(),int.class)));
            }
        }
        if (!carfriend.getPoolinguserid().equals(openId)&&!carfriend.getUserids().contains(""+openId)){//如果不是拼车内的成员,必要信息进行打码处理
            return MyUtils.getNewMap(Config.SUCCESS,null,carfriend.toString(),hideUinaCarInfo(uinacarinfoList));
        }
        return MyUtils.getNewMap(Config.SUCCESS,null,carfriend.toString(),uinacarinfoList);
    }

    public Map<String, Object> quitCarFriend(HttpSession session, int carId) throws ParameterErrorException {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        //获取到拼车信息
        Carfriend carfriend = carfriendMapper.selectByPrimaryKey(carId);
        //获取到所有的拼车Id
        List<Integer> userIdsList = new ArrayList<>();
        userIdsList.add(carfriend.getPoolinguserid());
        String userids1 = carfriend.getUserids();
        if (userids1!=null){
            String[] userIds = userids1.split(Config.splitUsers);
            for (String str:userIds) {
                userIdsList.add(TransitionUtil.transitionType(str.trim(),int.class));
            }
        }

        if (userIdsList.contains(openId)&&carfriend.getPoolingstatus().equals(Config.carfriend_poolingstatus_ing)){//加入拼车了，但是没有拼车完成
            carfriend.setGetnum(carfriend.getGetnum()+1);
            //将此人移动到历史人物
            String leavenum = carfriend.getLeaveids();
            leavenum = leavenum!=null&&leavenum.trim().length()>4?leavenum+Config.splitUsers+openId:openId+"";
            carfriend.setLeaveids(leavenum);
            if (carfriend.getPoolinguserid().equals(openId)){//如果退出拼车的是发起拼车的
                userIdsList.remove((Integer) openId);
                if (userIdsList.size()>0){
                    carfriend.setPoolinguserid(userIdsList.get(0));
                    userIdsList.remove((Integer)userIdsList.get(0));
                }else {
                    //只剩一个人，改变拼车状态，并将此人移动到历史人员，并更新自己的信息
                    carfriend.setPoolinguserid(null);
                    carfriend.setPoolingstatus(Config.carfriend_poolingstatus_cancle);
                    carfriend.setEndtime(new Date());
                }
            }else {
                //移除掉拼车发起者
                userIdsList.remove((Integer)carfriend.getPoolinguserid());
                //移除掉自己
                userIdsList.remove((Integer)openId);
            }
            String userids = null;
            for (int i = 0; i < userIdsList.size(); i++) {
                if (userids==null){
                    userids = userIdsList.get(i)+"";
                }else {
                    userids += Config.splitUsers+ userIdsList.get(i);
                }
            }
            carfriend.setUserids(userids);
            if (carfriendMapper.updateByPrimaryKeySelective(carfriend)>0){
                //更新自己的信息
                UinacarinfoKey uinacarinfoKey = new UinacarinfoKey();
                uinacarinfoKey.setPoolingcarid(carfriend.getPoolingcarid());
                uinacarinfoKey.setUserid(openId);
                Uinacarinfo uinacarinfo = uinacarinfoMapper.selectByPrimaryKey(uinacarinfoKey);
                uinacarinfo.setEndtime(new Date());
                uinacarinfo.setInstatus(Config.uinacarinfo_instatus_leave);
                if (uinacarinfoMapper.updateByPrimaryKeySelective(uinacarinfo)>0){
                    return MyUtils.getNewMap(Config.SUCCESS,null,null,carfriend);
                }
            }
        }
        throw new ParameterErrorException();
    }
}
