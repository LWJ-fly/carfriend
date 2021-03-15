package online.wenmeng.controller;

import online.wenmeng.dao.CallleaveMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.service.CallLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/16 1:03
 * @Descrintion: 发起请出其他人的类
 * @version: 1.0
 */
@Service
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
     * 发起请出队友，请出队友的ID
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
    public Map<String,Object> getCallOut(int carId){

    }


    /**
     * 获取发起请出的所有队友决定信息，详细信息可参见查看拼车信息方法
     * @param callleaveid 发起请出他人的callleaveid，也就是此表中的ID
     * @return 返回发起请出的信息
     */
    @RequestMapping("getCallOutDec/{callleaveid}")
    public Map<String,Object> getCallOutDec(int callleaveid){

    }


}
