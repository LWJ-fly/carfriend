package online.wenmeng.controller;

import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.service.CallLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/16 1:03
 * @Descrintion: 发起请出其他人的类
 * @version: 1.0
 */
@RestController
public class CallLeaveController {

    @Autowired
    private CallLeaveService callLeaveService;


    /**
     * 获取用户信息，判断用户是否有队友发出请求踢出同伴信息
     * 如果有返回为sucess，需要登录调用
     */
    @RequestMapping("/getMessage")
    public Map<String,Object> getMessage(HttpSession session){
        return callLeaveService.getMessage(session);
    }

    /**
     * 发起请出队友，请出队友的ID，团队中只有两个人的话不允许请出他人
     * @param carId 此次拼车的ID
     * @param outId 被请出去人的ID
     * @return 返回
     */
    @RequestMapping("letOut/{carId}/{outId}/{leavecause}")
    public Map<String,Object> letOut(HttpSession session, @PathVariable("carId") int carId,@PathVariable("outId") int outId, @PathVariable("leavecause") String leavecause) throws ParameterErrorException {
        return callLeaveService.letOut(session,carId,outId,leavecause);
    }

    /**
     * 获取发起请出的信息
     * @param carId 拼车ID
     * @return 返回发起请出的信息
     */
    @RequestMapping("getCallOut/{carId}")
    public Map<String,Object> getCallOut(HttpSession session,@PathVariable("carId") int carId) throws ParameterErrorException {
        return callLeaveService.getCallOut(session,carId);
    }


    /**
     * 获取发起请出的所有队友决定信息，详细信息可参见查看拼车信息方法
     * @param callleaveid 发起请出他人的callleaveid，也就是此表中的ID
     * @return 返回发起请出的信息
     */
    @RequestMapping("getCallOutDec/{callleaveid}")
    public Map<String,Object> getCallOutDec(HttpSession session,@PathVariable("callleaveid") int callleaveid){
        return callLeaveService.getCallOutDec(callleaveid);
    }

    /**
     * 处理拼车信息
     *      队友同意 、 拒绝 请出其他人，两个人的话不允许请出他人，建议自己退出
     * @param callleaveid 请出他人表中的ID
     * @param deal 处理结果，true/false
     * @return
     */
    @RequestMapping("dealCallOut/{callleaveid}/{deal}")
    public Map<String,Object> dealCallOut(HttpSession session,@PathVariable("callleaveid") int callleaveid,@PathVariable("deal") Boolean deal) throws ParameterErrorException {
        return callLeaveService.dealCallOut(session,callleaveid,deal);
    }


}
