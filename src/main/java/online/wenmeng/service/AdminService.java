package online.wenmeng.service;

import com.sun.org.apache.bcel.internal.generic.IFNONNULL;
import online.wenmeng.bean.*;
import online.wenmeng.config.Config;
import online.wenmeng.dao.*;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/4/3 23:22
 * @Descrintion: 管理员方法处理类
 * @version: 1.0
 */
@Service
public class AdminService {

    @Autowired
    private UloginMapper uloginMapper;
    @Autowired
    private UinfoMapper uinfoMapper;
    @Autowired
    private CarfriendMapper carfriendMapper;
    @Autowired
    private DrivercarMapper drivercarMapper;
    @Autowired
    private DrivervieMapper drivervieMapper;
    @Autowired
    private UinacarinfoMapper uinacarinfoMapper;

    public Map<String, Object> findAllDriver(HttpSession session) {
        UloginExample uloginExample = new UloginExample();
        uloginExample.createCriteria().andUsableEqualTo(2);
        List<Ulogin> uloginList = uloginMapper.selectByExample(uloginExample);
        List<Uinfo> list = new ArrayList<>();
        for (Ulogin ulogin:uloginList){
            list.add(uinfoMapper.selectByPrimaryKey(ulogin.getUserid()));
        }
        return MyUtils.getNewMap(Config.SUCCESS,null,null,list);
    }


    public Map<String, Object> updateUserInfo(HttpSession session, Uinfo uinfo) {
        if (uinfo!=null&&uinfo.getUserid()!=null){
            int i = uinfoMapper.updateByPrimaryKey(uinfo);
            if (i>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,uinfo);
            }
        }
        return MyUtils.getNewMap(Config.ERROR,null,"Parameter error",uinfo);
    }

    public Map<String, Object> findDriverCar(HttpSession session, int driverId) {
        Drivercar drivercar = drivercarMapper.selectByPrimaryKey(driverId);
        if (drivercar!=null){
            return MyUtils.getNewMap(Config.SUCCESS,null,null,drivercar);
        }
        return MyUtils.getNewMap(Config.ERROR,null,"Parameter error",driverId);
    }

    public Map<String, Object> updateDriverCar(HttpSession session, Drivercar drivercar) {
        if (drivercar!=null&&drivercar.getDriverid()!=null){
            int i = drivercarMapper.updateByPrimaryKey(drivercar);
            if (i>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,drivercar);
            }
        }
        return MyUtils.getNewMap(Config.ERROR,null,"Parameter error",drivercar);
    }

    public Map<String, Object> findDriverVie(HttpSession session, int driverId) {
        Drivervie drivervie = drivervieMapper.selectByPrimaryKey(driverId);
        if (drivervie!=null){
            return MyUtils.getNewMap(Config.SUCCESS,null,null,drivervie);
        }
        return MyUtils.getNewMap(Config.ERROR,null,"Parameter error",drivervie);
    }

    public Map<String, Object> endDriverVie(HttpSession session, int vieid) {
        Drivervie drivervie = drivervieMapper.selectByPrimaryKey(vieid);
        if (drivervie!=null){
            drivervie.setViestatus(Config.drivervie_viestatus_false);
            int i = drivervieMapper.updateByPrimaryKey(drivervie);
            if (i>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,drivervie);
            }
            return MyUtils.getNewMap(Config.RETRY,Config.RETRY,"Parameter error",drivervie);
        }
        return MyUtils.getNewMap(Config.ERROR,null,"Parameter error",vieid);
    }

    public Map<String, Object> findAllUser(HttpSession session) {
        UloginExample uloginExample = new UloginExample();
        uloginExample.createCriteria().andUsableEqualTo(1);
        List<Ulogin> uloginList = uloginMapper.selectByExample(uloginExample);
        List<Uinfo> list = new ArrayList<>();
        for (Ulogin ulogin:uloginList){
            list.add(uinfoMapper.selectByPrimaryKey(ulogin.getUserid()));
        }
        return MyUtils.getNewMap(Config.SUCCESS,null,null,list);
    }

    public Map<String, Object> disableUser(HttpSession session, int userid) {
        Ulogin ulogin = uloginMapper.selectByPrimaryKey(userid);
        if (ulogin != null) {
            ulogin.setUsable(Config.ulogin_usable_unable);
            int i = uloginMapper.updateByPrimaryKey(ulogin);
            if (i>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,ulogin);
            }
            return MyUtils.getNewMap(Config.ERROR,Config.RETRY,null,ulogin);
        }
        return MyUtils.getNewMap(Config.ERROR,null,"Parameter error",userid);
    }

    public Map<String, Object> ableUser(HttpSession session, int userid) {
        Ulogin ulogin = uloginMapper.selectByPrimaryKey(userid);
        if (ulogin != null) {
            ulogin.setUsable(Config.ulogin_usable_user);
            int i = uloginMapper.updateByPrimaryKey(ulogin);
            if (i>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,ulogin);
            }
            return MyUtils.getNewMap(Config.ERROR,Config.RETRY,null,ulogin);
        }
        return MyUtils.getNewMap(Config.ERROR,null,"Parameter error",userid);
    }

    public Map<String, Object> carfriendInfo(HttpSession session, int poolingcarid) {
        //获取到拼车信息
        Carfriend carfriend = carfriendMapper.selectByPrimaryKey(poolingcarid);
        //获取到所有的拼车信息
        List<Uinacarinfo> uinacarinfoList = new ArrayList<>();
        //发起拼车人的信息
        List<Integer> usersId = MyUtils.getUsersByCarfriend(carfriend);
        for (Integer userId:usersId) {
            uinacarinfoList.add(getUinacarinfoByCarIdAndUserId(carfriend.getPoolingcarid(), userId));
        }
        return MyUtils.getNewMap(Config.SUCCESS,true,carfriend,uinacarinfoList);
    }
    /**
     * 通过主键获取用户拼车信息
     * @param carId 拼车信息的ID
     * @param userId 用户的ID
     * @return
     */
    public Uinacarinfo getUinacarinfoByCarIdAndUserId(int carId,int userId){
        UinacarinfoKey uinacarinfoKey = new Uinacarinfo();
        uinacarinfoKey.setPoolingcarid(carId);
        uinacarinfoKey.setUserid(userId);
        return uinacarinfoMapper.selectByPrimaryKey(uinacarinfoKey);
    }

    public Map<String, Object> updateCarfriendInfo(HttpSession session, Carfriend carfriend) {
        if (carfriend == null&&carfriend.getPoolingcarid()!=null) {
            Carfriend carfriend1 = carfriendMapper.selectByPrimaryKey(carfriend.getPoolingcarid());
            if (carfriend1 != null) {
                int i = carfriendMapper.updateByPrimaryKey(carfriend);
                if (i>0){
                    return MyUtils.getNewMap(Config.SUCCESS,null,carfriend1,carfriend);
                }
            }
        }
        return MyUtils.getNewMap(Config.ERROR,null,"Parameter error",carfriend);
    }

    public Map<String, Object> findAllDisableUser(HttpSession session) {
        UloginExample uloginExample = new UloginExample();
        uloginExample.createCriteria().andUsableEqualTo(0);
        List<Ulogin> uloginList = uloginMapper.selectByExample(uloginExample);
        List<Uinfo> list = new ArrayList<>();
        for (Ulogin ulogin:uloginList){
            list.add(uinfoMapper.selectByPrimaryKey(ulogin.getUserid()));
        }
        return MyUtils.getNewMap(Config.SUCCESS,null,null,list);
    }

    public Map<String, Object> driver2user(HttpSession session, int driverId) {
        Ulogin ulogin = uloginMapper.selectByPrimaryKey(driverId);
        if (ulogin != null) {
            ulogin.setUsable(Config.ulogin_usable_user);
            int i = uloginMapper.updateByPrimaryKey(ulogin);
            if (i>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,ulogin);
            }
        }
        return MyUtils.getNewMap(Config.ERROR,null,"Parameter error",driverId);
    }

    public Map<String, Object> user2driver(HttpSession session, int driverId) {
        Ulogin ulogin = uloginMapper.selectByPrimaryKey(driverId);
        if (ulogin != null) {
            ulogin.setUsable(Config.ulogin_usable_driver);
            int i = uloginMapper.updateByPrimaryKey(ulogin);
            if (i>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,ulogin);
            }
        }
        return MyUtils.getNewMap(Config.ERROR,null,"Parameter error",driverId);
    }
}
