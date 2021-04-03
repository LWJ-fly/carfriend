package online.wenmeng.controller;

import online.wenmeng.bean.Carfriend;
import online.wenmeng.bean.Drivercar;
import online.wenmeng.bean.Uinfo;
import online.wenmeng.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/4/3 23:09
 * @Descrintion: 管理员方法
 *                  管理员方法使用adminXXX方法命名，进行拦截验证
 * @version: 1.0
 */
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
//==========车主信息维护============
    /**
     * 管理员查看所有司机信息
     */
    @RequestMapping("findAllDriver")
    public Map<String,Object> adminFindAllDriver(HttpSession session) throws Exception{
        return adminService.findAllDriver(session);
    }
    /**
     * 权限变更为用户
     */
    @RequestMapping("driver2user/{driverId}")
    public Map<String,Object> adminDriver2user(HttpSession session,@PathVariable("driverId") int driverId) throws Exception{
        return adminService.driver2user(session,driverId);
    }
    /**
     * 权限变更为车主
     */
    @RequestMapping("user2driver/{driverId}")
    public Map<String,Object> adminUser2driver(HttpSession session,@PathVariable("driverId") int driverId) throws Exception{
        return adminService.user2driver(session,driverId);
    }
    /**
     * 修改司机、用户 信息
     */
    @RequestMapping("updateUserInfo")
    public Map<String,Object> adminUpdateUserInfo(HttpSession session, Uinfo uinfo) throws Exception{
        return adminService.updateUserInfo(session,uinfo);
    }
    /**
     * 查看司机车辆信息
     */
    @RequestMapping("findDriverCar/{driverId}")
    public Map<String,Object> adminFindDriverCar(HttpSession session, @PathVariable("driverId") int driverId) throws Exception{
        return adminService.findDriverCar(session,driverId);
    }
    /**
     * 修改司机车辆信息
     */
    @RequestMapping("updateDriverCar")
    public Map<String,Object> adminUpdateDriverCar(HttpSession session, Drivercar drivercar) throws Exception{
        return adminService.updateDriverCar(session,drivercar);
    }
    //===============司机抢单信息====================
    /**
     * 查看司机抢单信息
     */
    @RequestMapping("findDriverVie/{driverId}")
    public Map<String,Object> adminFindDriverVie(HttpSession session, @PathVariable("driverId") int driverId) throws Exception{
        return adminService.findDriverVie(session,driverId);
    }
    /**
     * 终止司机抢单
     */
    @RequestMapping("endDriverVie/{vieid}")
    public Map<String,Object> adminEndDriverVie(HttpSession session, @PathVariable("vieid") int vieid) throws Exception{
        return adminService.endDriverVie(session,vieid);
    }
    //==============用户信息维护======================
    /**
     * 查看所有用户信息
     */
    @RequestMapping("findAllUser")
    public Map<String,Object> adminFindAllUser(HttpSession session) throws Exception{
        return adminService.findAllUser(session);
    }
    /**
     * 禁用用户
     */
    @RequestMapping("disableUser/{userid}")
    public Map<String,Object> adminDisableUser(HttpSession session,@PathVariable("userid") int userid) throws Exception{
        return adminService.disableUser(session,userid);
    }
    /**
     * 查看所有被封禁的用户
     */
    @RequestMapping("findAllDisableUser")
    public Map<String,Object> adminFindAllDisableUser(HttpSession session) throws Exception{
        return adminService.findAllDisableUser(session);
    }
    /**
     * 解封用户
     */
    @RequestMapping("ableUser/{userid}")
    public Map<String,Object> adminAbleUser(HttpSession session,@PathVariable("userid") int userid) throws Exception{
        return adminService.ableUser(session,userid);
    }
    //================拼车信息维护==========================
    /**
     * 查看拼车详细信息
     */
    @RequestMapping("carfriendInfo/{poolingcarid}")
    public Map<String,Object> adminCarfriendInfo(HttpSession session,@PathVariable("poolingcarid") int poolingcarid) throws Exception{
        return adminService.carfriendInfo(session,poolingcarid);
    }
    /**
     * 更改拼车信息
     */
    @RequestMapping("updateCarfriendInfo")
    public Map<String,Object> adminUpdateCarfriendInfo(HttpSession session, Carfriend carfriend) throws Exception{
        return adminService.updateCarfriendInfo(session,carfriend);
    }

}
