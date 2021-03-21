package online.wenmeng.controller;

import online.wenmeng.service.UinACarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/13 0:00
 * @Descrintion: 用户和拼车之间的关系
 * @version: 1.0
 */
@RestController
public class UinACarController extends BaseController {

    @Autowired
    private UinACarService uinACarService;

    /**
     * 查看我的拼车信息——未完结的，当前还在拼车的信息
     * @return
     */
    @RequestMapping("findMyCarPooling")
    public Map<String,Object> findMyCarPooling(HttpSession session){
        return uinACarService.findMyCarPooling(session);
    }

    /**
     * 查看所有历史拼车信息
     * @return
     */
    @RequestMapping("findHistoryCarPooling")
    public Map<String,Object> findHistoryCarPooling(HttpSession session){
        return uinACarService.findHistoryCarPooling(session);
    }
    /**
     * 查看我的全部的拼车信息
     * @return
     */
    @RequestMapping("findMyAllCarPooling")
    public Map<String,Object> findMyAllCarPooling(HttpSession session){
        return uinACarService.findMyAllCarPooling(session);
    }
}
