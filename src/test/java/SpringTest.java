import online.wenmeng.bean.Bills;
import online.wenmeng.dao.BillsMapper;
import online.wenmeng.service.CarFriendService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/13 14:29
 * @Descrintion: SSM 测试工具类
 * @version: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private BillsMapper billsMapper;

    @Autowired
    private CarFriendService carFriendService;

    @Test
    public void fun(){
        Map<String, Object> origin = carFriendService.findCarFriendByLikeOrigin("%"+"平"+"%");
        System.out.println(origin);
    }

    @Test
    public void fun1(){
        Map<String, Object> origin = carFriendService.findCarFriendByOrigin("平院");
        System.out.println(origin);
    }


}
