package online.wenmeng.service;

import online.wenmeng.config.Config;
import online.wenmeng.exception.LoginException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/28 13:24
 * @Descrintion: 基本的服务类，对于一般业务放在这里
 * @version: 1.0
 */
@Service
public class BaseService {

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
    public void loginCheck() throws Exception {
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
     * 定时任务，检查拼车时间是否到时间
     * 每天0点进行必要的刷新
     */
    @Scheduled(cron = "0 0 0 * * ?")
    public void permissionsTask(){
        //每日0点清空上日发送邮件的用户
        Config.sendEmailCountMap.clear();
    }
}