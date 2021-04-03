package online.wenmeng.service;

import online.wenmeng.bean.Uinfo;
import online.wenmeng.bean.UinfoExample;
import online.wenmeng.bean.Ulogin;
import online.wenmeng.config.Config;
import online.wenmeng.dao.UinfoMapper;
import online.wenmeng.dao.UloginMapper;
import online.wenmeng.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/16 23:42
 * @Descrintion:
 * @version: 1.0
 */
@Service
public class TestSerice {

    @Autowired
    private UinfoMapper uinfoMapper;

    @Autowired
    private UloginMapper uloginMapper;


    public Map<String, Object> setLogininfo(HttpSession session, int openid) {
        Ulogin ulogin = uloginMapper.selectByPrimaryKey(openid);
        Uinfo uinfo = uinfoMapper.selectByPrimaryKey(openid);
        if (uinfo!=null){
            Map<String, Object> userLoginInfo = MyUtils.createUserLoginInfo(openid, uinfo.getNickname(),uinfo.getGender()==1?"男":"女", null,ulogin.getUsable());
            session.setAttribute(Config.userInfoInRun,userLoginInfo);
            return  MyUtils.getNewMap(Config.SUCCESS,Config.INDEX,uinfo,userLoginInfo);
        }
        UinfoExample uinfoExample = new UinfoExample();
        uinfoExample.createCriteria().andUseridBetween(Integer.MIN_VALUE,Integer.MAX_VALUE);
        List<Uinfo> uinfos = uinfoMapper.selectByExample(uinfoExample);
        return  MyUtils.getNewMap(Config.ERROR,null,null,uinfos);
    }
}
