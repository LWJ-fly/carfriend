package online.wenmeng.controller;

import online.wenmeng.bean.Carfriend;
import online.wenmeng.bean.Uinacarinfo;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.exception.ServerException;
import online.wenmeng.service.CarFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/14 1:37
 * @Descrintion: 拼车管理类
 * @version: 1.0
 */

@RestController
public class CarFriendController {
    @Autowired
    private CarFriendService carFriendServices;

    /**
     * 查询所有的拼车信息，只返回条数后台进行设置
     * @return
     */
    @RequestMapping("findAllCarFriend")
    public Map<String,Object> findAllCarFriend(){
        return carFriendServices.findAllCarFriend();
    }

    /**
     * 通过出发地搜索拼车信息————精确查询
     * @return
     */
    @RequestMapping("findCarFriendByOrigin/{origin}")
    public Map<String,Object> findCarFriendByOrigin(@PathVariable("origin") String origin){
        return carFriendServices.findCarFriendByOrigin(origin);
    }
    /**
     * 通过出发地搜索拼车信息————模糊查询
     * @return
     */
    @RequestMapping("findCarFriendByLikeOrigin/{origin}")
    public Map<String,Object> findCarFriendByLikeOrigin(@PathVariable("origin") String origin){
        return carFriendServices.findCarFriendByLikeOrigin(origin);
    }

    /**
     * 通过目的地搜索拼车信息————不需要登录
     *                                  【精确查询】
     * @return
     */
    @RequestMapping("findCarFriendByBourn/{bourn}")
    public Map<String,Object> findCarFriendByBourn(@PathVariable("bourn") String bourn){
        return carFriendServices.findCarFriendByBourn(bourn);
    }

    /**
     * 通过目的地搜索拼车信息————不需要登录
     *                                  【模糊查询】
     * @return
     */
    @RequestMapping("findCarFriendByLikeBourn/{bourn}")
    public Map<String,Object> findCarFriendByLikeBourn(@PathVariable("bourn") String bourn){
        return carFriendServices.findCarFriendByLikeBourn(bourn);
    }


    /**
     * 通过出发地和目的地搜索拼车信息————不需要登录
     *                                  【精确查询】
     * @return
     */
    @RequestMapping("findCarFriendByTrip/{origin}/{bourn}")
    public Map<String,Object> findCarFriendByTrip(@PathVariable("origin") String origin,@PathVariable("bourn") String bourn){
        return carFriendServices.findCarFriendByTrip(origin,bourn);
    }


    /**
     * 通过出发地和目的地搜索拼车信息————不需要登录
     *                                  【模糊查询】
     * @return
     */
    @RequestMapping("findCarFriendByLikeTrip/{origin}/{bourn}")
    public Map<String,Object> findCarFriendByLikeTrip(@PathVariable("origin") String origin,@PathVariable("bourn") String bourn){
        return carFriendServices.findCarFriendByLikeTrip(origin,bourn);
    }

    /**
     * 发起拼车 填写发起拼车信息
     * @return 返回拼车信息
     */
    @RequestMapping(value = "createCarFriend",method = RequestMethod.POST)
    public Map<String,Object> createCarFriend(HttpSession session, Carfriend carfriend) throws ParameterErrorException, ServerException {
        return carFriendServices.createCarFriend(session,carfriend);
    }

    /**
     * 加入拼车 填写加入拼车的信息
     * @return 返回拼车状态
     */
    @RequestMapping(value = "joinCarFriend",method = RequestMethod.POST)
    public Map<String,Object> joinCarFriend(HttpSession session, Uinacarinfo uinacarinfo,Boolean listenerStatus) throws ParameterErrorException {
        return carFriendServices.joinCarFriend(session,uinacarinfo,listenerStatus);
    }

    /**
     * 查看详细拼车信息
     *      ————如果没有加入拼车，相应信息会进行保密处理
     *      ————如果加入拼车，相应信息会进行展示
     * @param carId
     * @return
     */
    @RequestMapping("findDetailCarFriend/{carId}")
    public Map<String,Object> findMyDetailCarFriend(HttpSession session, @PathVariable("carId") int carId){
        return carFriendServices.findMyDetailCarFriend( session, carId);
    }

    /**
     * 退出拼车
     * @param carId
     * @return
     */
    @RequestMapping("quitCarFriend/{carId}")
    public Map<String,Object> quitCarFriend(HttpSession session,@PathVariable("carId") int carId) throws ParameterErrorException {
        return carFriendServices.quitCarFriend(session,carId);
    }

}
