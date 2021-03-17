package online.wenmeng.service;

import online.wenmeng.bean.Drivercar;
import online.wenmeng.config.Config;
import online.wenmeng.dao.DrivercarMapper;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Service
public class DriverCarService {

    @Autowired
    private DrivercarMapper drivercarMapper;

    public Map<String, Object> upDateDriverCar(HttpSession session, Drivercar drivercar) throws ParameterErrorException {
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int usable = (int) userLoginInfo.get(Config.Usable);
        if (usable!=2){
            throw new ParameterErrorException();
        }
        int openId = (int) userLoginInfo.get(Config.Openid);
        Drivercar drivercar1 = drivercarMapper.selectByPrimaryKey(openId);
        if (drivercar1==null){//第一次更新
            drivercar.setDriverid(openId);
            drivercar.setOrdernum(0);
            if (drivercarMapper.insert(drivercar)>0){
                return MyUtils.getNewMap(Config.SUCCESS,null,userLoginInfo,drivercar);
            }
            throw new ParameterErrorException();
        }
        //不是第一次更新
        int i =0 ;
        if (drivercar.getCarlicence()!=null){
            i++;
            drivercar1.setCarlicence(drivercar.getCarlicence());
        }
        if (drivercar.getCarcolor()!=null){
            i++;
            drivercar1.setCarcolor(drivercar.getCarcolor());
        }
        if (drivercar.getCarseat()>0){
            i++;
            drivercar1.setCarseat(drivercar.getCarseat());
        }

        if (i>0&&drivercarMapper.updateByPrimaryKey(drivercar1)>0){
            return MyUtils.getNewMap(Config.SUCCESS,null,userLoginInfo,drivercar1);
        }
        throw new ParameterErrorException();
    }

    public Map<String, Object> getDriverCar(HttpSession session) throws ParameterErrorException {
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int usable = (int) userLoginInfo.get(Config.Usable);
        if (usable!=2){
            throw new ParameterErrorException();
        }
        int openId = (int) userLoginInfo.get(Config.Openid);
        return MyUtils.getNewMap(Config.SUCCESS,null,userLoginInfo,drivercarMapper.selectByPrimaryKey(openId));
    }
}
