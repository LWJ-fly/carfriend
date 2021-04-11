package online.wenmeng.service;

import online.wenmeng.bean.Carfriend;
import online.wenmeng.bean.Drivervie;
import online.wenmeng.bean.DrivervieExample;
import online.wenmeng.config.Config;
import online.wenmeng.dao.CarfriendMapper;
import online.wenmeng.dao.DrivervieMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 司机抢单的控制类
 */
@Service
public class DriverVieService {

    @Autowired
    private DrivervieMapper drivervieMapper;
    @Autowired
    private CarfriendMapper carfriendMapper;


    public Map<String, Object> applyPull(HttpSession session, Drivervie drivervie) throws ParameterErrorException {
        int openId = checkDriver(session);
        //验证载客信息是否存在,处于正在拼车，或者刚好拼完
        Integer poolingcarid = drivervie.getPoolingcarid();
        Carfriend carfriend = carfriendMapper.selectByPrimaryKey(poolingcarid);
        if (carfriend==null&&!(carfriend.getPoolingstatus().equals(Config.carfriend_poolingstatus_ing)||
                carfriend.getPoolingstatus().equals(Config.carfriend_poolingstatus_end))){
            throw new ParameterErrorException();
        }
        DrivervieExample drivervieExample = new DrivervieExample();
        drivervieExample.createCriteria().andDriveridEqualTo(openId).andPoolingcaridEqualTo(poolingcarid);
        List<Drivervie> drivervies = drivervieMapper.selectByExample(drivervieExample);
        if (drivervies.size()>2){
            return MyUtils.getNewMap(Config.ERROR,null,"Operation out of limit",drivervies);
        }
        for (Drivervie drivervie1:drivervies){
            if (drivervie1.getViestatus().equals(Config.drivervie_viestatus_ing)){
                return  MyUtils.getNewMap(Config.ERROR,drivervie1,"already existed",drivervies);
            }
        }
        //开始添加
        int vieid;
        while (true){
            vieid = MyUtils.getRandomNum();
            if (drivervieMapper.selectByPrimaryKey(vieid)==null){
                break;
            }
        }
        Drivervie drivervie1 = new Drivervie(vieid,openId,poolingcarid,drivervie.getTotalpay(),new Date(),
                drivervie.getViemsg(),Config.drivervie_viestatus_ing);
        if (drivervieMapper.insert(drivervie1)>0){
            return MyUtils.getNewMap(Config.SUCCESS,null,carfriend,drivervie1);
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> quitPull(HttpSession session, Integer vieid) throws ParameterErrorException {
        int openId = checkDriver(session);
        Drivervie drivervie = drivervieMapper.selectByPrimaryKey(vieid);
        if (drivervie!=null&&drivervie.getDriverid().equals(openId)){
            drivervie.setViestatus(Config.drivervie_viestatus_quit);
            if (drivervieMapper.updateByPrimaryKey(drivervie)>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,null,drivervie);
            }
        }
        throw new ParameterErrorException();
    }

    /**
     * 校验是否是司机
     * @param session
     * @return
     * @throws ParameterErrorException
     */
    public int checkDriver(HttpSession session) throws ParameterErrorException {
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int usable = (int) userLoginInfo.get(Config.Usable);
        if (usable<2){
            throw new ParameterErrorException();
        }
        return  (int) userLoginInfo.get(Config.Openid);
    }

    public Map<String, Object> findAllPull(HttpSession session) throws ParameterErrorException {
        int openId = checkDriver(session);
        DrivervieExample drivervieExample = new DrivervieExample();
        drivervieExample.createCriteria().andDriveridEqualTo(openId);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,drivervieMapper.selectByExample(drivervieExample));
    }

    public Map<String, Object> findApplyPull(HttpSession session) throws ParameterErrorException {
        int openId = checkDriver(session);
        DrivervieExample drivervieExample = new DrivervieExample();
        drivervieExample.createCriteria().andDriveridEqualTo(openId).andViestatusEqualTo(Config.drivervie_viestatus_ing);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,drivervieMapper.selectByExample(drivervieExample));
    }

    public Map<String, Object> findAgreePull(HttpSession session) throws ParameterErrorException {
        int openId = checkDriver(session);
        DrivervieExample drivervieExample = new DrivervieExample();
        drivervieExample.createCriteria().andDriveridEqualTo(openId).andViestatusEqualTo(Config.drivervie_viestatus_success);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,drivervieMapper.selectByExample(drivervieExample));
    }

    public Map<String, Object> findFilePull(HttpSession session) throws ParameterErrorException {
        int openId = checkDriver(session);
        DrivervieExample drivervieExample = new DrivervieExample();
        drivervieExample.createCriteria().andDriveridEqualTo(openId).andViestatusEqualTo(Config.drivervie_viestatus_false);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,drivervieMapper.selectByExample(drivervieExample));
    }

    public Map<String, Object> findPullInfo(HttpSession session, Integer poolingcarid) throws ParameterErrorException {
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId =  (int) userLoginInfo.get(Config.Openid);
        Carfriend carfriend = carfriendMapper.selectByPrimaryKey(poolingcarid);
        List<Integer> userIds = MyUtils.getUsersByCarfriend(carfriend);
        if (!userIds.contains(openId)){
            throw new ParameterErrorException();
        }
        DrivervieExample drivervieExample = new DrivervieExample();
        drivervieExample.createCriteria().andPoolingcaridEqualTo(poolingcarid);
        return MyUtils.getNewMap(Config.SUCCESS,null,null,drivervieMapper.selectByExample(drivervieExample));
    }

    /**
     * 用户操作
     * @param session
     * @param vieid
     * @param reply
     * @return
     */
    public Map<String, Object> dealApplyPull(HttpSession session, Integer vieid, Boolean reply) throws ParameterErrorException {

        Drivervie drivervie = drivervieMapper.selectByPrimaryKey(vieid);
        if (drivervie==null){
            throw new ParameterErrorException();
        }
        if (!drivervie.getViestatus().equals(Config.drivervie_viestatus_ing)){
            return MyUtils.getNewMap(Config.ERROR,null,"Have to deal with",drivervie);
        }
        Integer poolingcarid = drivervie.getPoolingcarid();

        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId =  (int) userLoginInfo.get(Config.Openid);
        Carfriend carfriend = carfriendMapper.selectByPrimaryKey(poolingcarid);
        List<Integer> userIds = MyUtils.getUsersByCarfriend(carfriend);
        if (!userIds.contains(openId)){
            throw new ParameterErrorException();
        }
        if (reply){
            drivervie.setViestatus(Config.drivervie_viestatus_success);
            //其他全部失效
            List<Drivervie> allDrivervie = getAllDrivervie(drivervie.getPoolingcarid());
            allDrivervie.remove(drivervie);
            setAllDerverVieFalse(allDrivervie);
            carfriend.setPoolingstatus(Config.carfriend_poolingstatus_over);
            carfriendMapper.updateByPrimaryKey(carfriend);
            return MyUtils.getNewMap(Config.SUCCESS,null,carfriend,drivervie);
        }else {
            drivervie.setViestatus(Config.drivervie_viestatus_false);
            drivervieMapper.updateByPrimaryKeySelective(drivervie);
            return MyUtils.getNewMap(Config.SUCCESS,null,carfriend,drivervie);
        }
    }

    /**
     * 获取全部载客信息
     */
    public List<Drivervie> getAllDrivervie(Integer poolingcarid){
        DrivervieExample drivervieExample = new DrivervieExample();
        drivervieExample.createCriteria().andPoolingcaridEqualTo(poolingcarid);
        return drivervieMapper.selectByExample(drivervieExample);
    }

    public void setAllDerverVieFalse(List<Drivervie> allDrivervie){
        for (Drivervie drivervie: allDrivervie){
            drivervie.setViestatus(Config.drivervie_viestatus_false);
            drivervieMapper.updateByPrimaryKeySelective(drivervie);
        }
    }
}
