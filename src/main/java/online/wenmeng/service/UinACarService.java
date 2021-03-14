package online.wenmeng.service;

import online.wenmeng.bean.Carfriend;
import online.wenmeng.bean.Uinacarinfo;
import online.wenmeng.bean.UinacarinfoExample;
import online.wenmeng.config.Config;
import online.wenmeng.dao.CarfriendMapper;
import online.wenmeng.dao.UinacarinfoMapper;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/14 1:02
 * @Descrintion: 用户在拼成中的信息
 * @version: 1.0
 */
@Service
public class UinACarService {

    @Autowired
    private UinacarinfoMapper uinacarinfoMapper;
    @Autowired
    private CarfriendMapper carfriendMapper;

    public Map<String, Object> findMyCarPooling(HttpSession session) {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        UinacarinfoExample uinacarinfoExample = new UinacarinfoExample();
        uinacarinfoExample.createCriteria().andUseridEqualTo(openId).andInstatusEqualTo(Config.uinacarinfo_instatus_join);
        List<Uinacarinfo> uinacarinfos = uinacarinfoMapper.selectByExample(uinacarinfoExample);
        //获取拼车的信息
        List<Carfriend> carpoolinginfos = new ArrayList<>();
        for (Uinacarinfo uinacarinfo :uinacarinfos) {
            carpoolinginfos.add(carfriendMapper.selectByPrimaryKey(uinacarinfo.getPoolingcarid()));
        }
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }

    public Map<String, Object> findHistoryCarPooling(HttpSession session) {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        UinacarinfoExample uinacarinfoExample = new UinacarinfoExample();
        uinacarinfoExample.createCriteria().andUseridEqualTo(openId).andInstatusBetween(Config.uinacarinfo_instatus_over,Config.uinacarinfo_instatus_fail);
        List<Uinacarinfo> uinacarinfos = uinacarinfoMapper.selectByExample(uinacarinfoExample);
        //获取拼车的信息
        List<Carfriend> carpoolinginfos = new ArrayList<>();
        for (Uinacarinfo uinacarinfo :uinacarinfos) {
            carpoolinginfos.add(carfriendMapper.selectByPrimaryKey(uinacarinfo.getPoolingcarid()));
        }
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }

    public Map<String, Object> findMyAllCarPooling(HttpSession session) {
        //获取用户的ID
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        UinacarinfoExample uinacarinfoExample = new UinacarinfoExample();
        uinacarinfoExample.createCriteria().andUseridEqualTo(openId);
        List<Uinacarinfo> uinacarinfos = uinacarinfoMapper.selectByExample(uinacarinfoExample);
        //获取拼车的信息
        List<Carfriend> carpoolinginfos = new ArrayList<>();
        for (Uinacarinfo uinacarinfo :uinacarinfos) {
            carpoolinginfos.add(carfriendMapper.selectByPrimaryKey(uinacarinfo.getPoolingcarid()));
        }
        return MyUtils.getNewMap(Config.SUCCESS,null,null,carpoolinginfos);
    }
}
