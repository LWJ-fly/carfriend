package online.wenmeng.service;

import online.wenmeng.dao.DrivervieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 司机抢单的控制类
 */
@Service
public class DriverVieService {

    @Autowired
    private DrivervieMapper drivervieMapper;


    public Map<String, Object> applyPull(HttpSession session, Integer poolingcarid) {
        return null;
    }

    public Map<String, Object> quitPull(HttpSession session, Integer vieid) {
        return null;
    }
}
