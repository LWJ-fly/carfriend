package online.wenmeng.controller;

import online.wenmeng.bean.Uinfo;
import online.wenmeng.service.UInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class UInfoController {

    @Autowired
    private UInfoService uInfoService;

    /**
     * 设置用户信息
     * 没有可为 null
     *      例如：updateUserInfo/null/null/null/212***121
     */
    @RequestMapping(value = "updateUserInfo", method = RequestMethod.POST)
    public Map<String,Object> updateUserInfo(HttpSession httpSession, Uinfo uinfo){
        return uInfoService.updateUserInfo(httpSession,uinfo);
    }

    /**
     * 获取用户信息
     * @param session
     * @return
     */
    @RequestMapping(value = "getUserInfo")
    public Map<String,Object> getLoginInfo(HttpSession session){
        return uInfoService.getLoginInfo(session);
    }

}
