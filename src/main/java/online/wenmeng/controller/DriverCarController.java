package online.wenmeng.controller;

import online.wenmeng.bean.Drivercar;
import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.service.DriverCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 司机的车辆信息控制类
 */

@RestController
public class DriverCarController {

    @Autowired
    private DriverCarService driverCarService;

    /**
     * 更新司机车辆信息
     * @param session
     * @param drivercar
     * @return
     */
    @RequestMapping("upDateDriverCar")
    public Map<String,Object> upDateDriverCar(HttpSession session, Drivercar drivercar) throws ParameterErrorException {
        return driverCarService.upDateDriverCar(session,drivercar);
    }

    /**
     * 获取拼车司机的拼车信息
     * @param session
     * @return
     * @throws ParameterErrorException
     */
    @RequestMapping("getDriverCar")
    public Map<String,Object> getDriverCar(HttpSession session) throws ParameterErrorException {
        return driverCarService.getDriverCar(session);
    }
}
