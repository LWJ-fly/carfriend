package online.wenmeng.controller;

import online.wenmeng.exception.ServerException;
import online.wenmeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2020/3/13 0:15
 * @Descrintion: 用户登录管理类
 * @version: 1.0
 */
@RestController
public class UserControler {

    @Autowired
    private UserService userService;

    /**
     * 用户登录调用
     * @param session 服务器获取
     * @param code 用户传输的QQ登录码
     * @return 返回用户登录信息(昵称，性别，头像链接)
     *              如果错误会给出错误信息
     *                  一般是code错误
     *                  也会有限制用户登录、当前用户被禁用
     */
    @RequestMapping("/login/{code}")
    public Map<String,Object> login(HttpSession session, @PathVariable("code") String code) throws ServerException {
        return userService.login(session, code);
    }

    /**
     * 获取登录基本信息，头像，昵称，性别，openID
     * @param session
     * @return
     */
    @RequestMapping(value = "getBaseLogin")
    public Map<String,Object> getLogin(HttpSession session){
        return userService.getLogin(session);
    }


    /**
     * 退出登录
     * @return
     */
    @RequestMapping("/exit")
    public Map<String,Object> exit(HttpSession session){
        return userService.exit(session);
    }

    /**
     * 发送意见邮件
     * @param title 发送的标题
     * @param content 发送的内容
     * @return 返回发送状态
     */
    @RequestMapping("sendEmail/{title:.*}/{content:.*}")
    public Map<String,Object> sendEmail(HttpSession session,@PathVariable("title") String title ,@PathVariable("content") String content){
        return userService.sendEmail( session,  title , content);
    }

}
