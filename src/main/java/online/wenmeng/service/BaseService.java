package online.wenmeng.service;

import online.wenmeng.bean.*;
import online.wenmeng.config.Config;
import online.wenmeng.dao.CarfriendMapper;
import online.wenmeng.dao.UinacarinfoMapper;
import online.wenmeng.dao.UinfoMapper;
import online.wenmeng.exception.LoginException;
import online.wenmeng.exception.NoMoneyException;
import online.wenmeng.utils.MyUtils;
import online.wenmeng.utils.SentEmail;
import online.wenmeng.utils.VerifyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/28 13:24
 * @Descrintion: 基本的服务类，对于一般业务放在这里
 * @version: 1.0
 */
@Service
public class BaseService {

    @Autowired
    private UinfoMapper uinfoMapper;

    @Autowired
    private CarfriendMapper carfriendMapper;

    @Autowired
    private UinacarinfoMapper uinacarinfoMapper;

    /**
     * 放行的方法，不进行校验
     */
    private static List releaseMethod = new ArrayList();
    static {
        String[] srr = {
                "exit",
                "login",
                "QQLogin"
        };
        for (String s:srr){
            releaseMethod.add(s);
        }
    }

    /**
     * 用户登录验证
     */
    public void loginCheck() throws LoginException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String methodName = request.getServletPath();
        methodName = methodName.split("/")[1];
        if (!releaseMethod.contains(methodName)){
            HttpSession session = request.getSession();
            Object sessionAttribute = session.getAttribute(Config.userInfoInRun);
            if (sessionAttribute==null)
                throw new LoginException();
        }
    }

    /**
     * 验证是否收款
     */
    public void joinOrCreatCheck() throws NoMoneyException {
        //是否要收费，如果要收费就进行处理
        if (Config.mastPayBeforeJoin){
            //获取session
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            HttpSession session = request.getSession();
            //获取用户ID
            Integer userId = MyUtils.getOpenIdBySession(session);
            Uinfo uinfo = uinfoMapper.selectByPrimaryKey(userId);
            if(Config.haveMoneyToJoin>uinfo.getWallet()){
                throw new NoMoneyException();
            }
        }
    }

    /**
     * 定时任务，检查拼车时间是否到时间
     * 每天0点进行必要的刷新
     */
    @Scheduled(cron = "0 0 0 * * ?")
    public void permissionsTask(){
        //每日0点清空上日发送邮件的用户
        Config.sendEmailCountMap.clear();
    }

    /**
     * 每五分钟执行一次，检查是否有拼车到时间
     */
    @Scheduled(cron = "0 0/5 * * * ? ")
    public void checkTimeOut2CarFriend(){
        //查询所有数据库，检查是否有到时间的拼车
        CarfriendExample carfriendExample = new CarfriendExample();
        Date date = new Date();
        carfriendExample.createCriteria().andGotimeBetween(date,new Date(date.getTime()+305000)).andPoolingstatusEqualTo(Config.carfriend_poolingstatus_ing);
        List<Carfriend> carfriends = carfriendMapper.selectByExample(carfriendExample);
        for (Carfriend carfriend:carfriends) {
            //获取所有的拼车用户
            sendEmail(carfriend.getPoolingcarid());
            changeStatus2CarFriend(carfriend);
        }
    }

    /**
     * 更改拼车状态，将拼车更改为超时
     */
    public void changeStatus2CarFriend(Carfriend carfriend){
        carfriend.setEndtime(new Date());
        carfriend.setPoolingstatus(Config.carfriend_poolingstatus_timeoOut);
        carfriendMapper.updateByPrimaryKeySelective(carfriend);
    }

    public void sendEmail(Integer carId){
        UinacarinfoExample uinacarinfoExample = new UinacarinfoExample();
        uinacarinfoExample.createCriteria().andPoolingcaridEqualTo(carId);
        List<Uinacarinfo> uinacarinfoList = uinacarinfoMapper.selectByExample(uinacarinfoExample);
        for(Uinacarinfo uinacarinfo:uinacarinfoList){
            //更改所有用户的状态信息
            uinacarinfo.setInstatus(Config.uinacarinfo_instatus_ok);
            uinacarinfo.setEndtime(new Date());
            uinacarinfoMapper.updateByPrimaryKey(uinacarinfo);
            if (uinacarinfo.getOutinfo()>16){
                if (VerifyUtil.checkEmail(uinacarinfo.getEmail())){
                    SentEmail.sentEmail(uinacarinfo.getEmail(),Config.TimeOutEmail,Config.LOGIN);
                }
            }
        }
    }
}