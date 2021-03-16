package online.wenmeng.controller;

import online.wenmeng.config.Config;
import online.wenmeng.service.TestSerice;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/14 18:23
 * @Descrintion:
 * @version: 1.0
 */
@RestController
public class TestController {

    @Autowired
    private TestSerice testSerice;
    /**
     * 设置登录信息
     */
    @RequestMapping("setLogininfo/{openid}")
    private Map<String, Object> setLogininfo(HttpSession session, @PathVariable("openid") int openid){
        return testSerice.setLogininfo(session,openid);
    }
}
