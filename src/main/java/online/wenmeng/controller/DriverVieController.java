package online.wenmeng.controller;

import online.wenmeng.bean.Drivervie;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.service.DriverVieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 司机抢单的控制类
 */
@RestController
public class DriverVieController {
/*
需要新增
    查询所有拼车完成的订单
    申请载客，
        相应的用户应该有
            一个查看申请载客信息
            一个用户拒绝载客信息
            一个用户同意载客信息
    退出载客申请
 */
    @Autowired
    private DriverVieService driverVieService;


    /**
     * 司机申请载客的方法
     * @param session 系统自动获取
     * @param drivervie 申请载客的拼车ID，拼车的ID,司机的报价，抢单的留言，这三个，载客ID必须，另外不必
     * @return 返回申请数据
     */
    @RequestMapping("applyPull/{poolingcarid}")
    public Map<String,Object> applyPull(HttpSession session, Drivervie drivervie ) throws ParameterErrorException {
        return driverVieService.applyPull(session,drivervie);
    }

    /**
     * @param session 系统自动获取
     * @param vieid 抢单的ID，司机抢单后生成表中的ID
     * @return 返回表中的变更状态
     */
    @RequestMapping("quitPull/{vieid}")
    public Map<String,Object> quitPull(HttpSession session,Integer vieid) throws ParameterErrorException {
        return driverVieService.quitPull(session,vieid);
    }


    /**
     * 查询所有的拉取信息
     * @param session
     * @return
     */
    @RequestMapping("findAllPull")
    public Map<String,Object> findAllPull(HttpSession session) throws ParameterErrorException {
        return driverVieService.findAllPull(session);
    }

    /**
     * 当前申请的载客信息
     * @param session
     * @return
     */
    @RequestMapping("findApplyPull")
    public Map<String,Object> findApplyPull(HttpSession session) throws ParameterErrorException {
        return driverVieService.findApplyPull(session);
    }


    /**
     * 查看同意的载客信息
     * @param session
     * @return
     */
    @RequestMapping("findAgreePull")
    public Map<String,Object> findAgreePull(HttpSession session) throws ParameterErrorException {
        return driverVieService.findAgreePull(session);
    }


    /**
     * 查看不同意的载客信息
     * @param session
     * @return
     */
    @RequestMapping("findFilePull")
    public Map<String,Object> findFilePull(HttpSession session) throws ParameterErrorException {
        return driverVieService.findFilePull(session);
    }


    /**
     * 【用户使用】 查看当前拼车信息的中，司机抢单信息
     * @param session
     * @param poolingcarid 当前拼车的ID
     * @return
     */
    @RequestMapping("findPullInfo/{poolingcarid}")
    public Map<String,Object> findPullInfo(HttpSession session,Integer poolingcarid) throws ParameterErrorException {
        return driverVieService.findPullInfo(session,poolingcarid);
    }

    /**
     * 拒绝 / 同意 司机载客的信息
     * @param vieid  抢单的ID，司机抢单后生成表中的ID
     * @param reply 答复，同意或者不同意
     * @return
     */
    @RequestMapping("dealApplyPull/{vieid}/{reply}")
    public Map<String,Object> dealApplyPull(HttpSession session,Integer vieid, Boolean reply) throws ParameterErrorException {
        return driverVieService.dealApplyPull(session,vieid,reply);
    }



}
