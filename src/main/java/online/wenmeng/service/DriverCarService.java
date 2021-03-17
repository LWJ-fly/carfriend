package online.wenmeng.service;

import online.wenmeng.bean.Drivercar;
import online.wenmeng.dao.DrivercarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverCarService {

    @Autowired
    private DrivercarMapper drivercarMapper;

}
