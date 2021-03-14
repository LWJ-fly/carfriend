package online.wenmeng.service;

import online.wenmeng.bean.Uinfo;
import online.wenmeng.config.Config;
import online.wenmeng.dao.UinfoMapper;
import online.wenmeng.utils.MyUtils;
import online.wenmeng.utils.SentEmail;
import online.wenmeng.utils.VerifyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/13 15:57
 * @Descrintion:
 * @version: 1.0
 */

@Service
public class UInfoService {

    @Autowired
    private UinfoMapper uinfoMapper;


    /**
     * 更新用户的基本信息
     * @param uinfo 用户的基本信息
     * @return 返回更新后的用户信息
     */
    public Map<String, Object> updateUserInfo(HttpSession httpSession, Uinfo uinfo) {

        System.out.println(uinfo);

        Map<String, Object> userLoginInfo = (Map<String, Object>) httpSession.getAttribute(Config.userInfoInRun);
        int openId = (int) userLoginInfo.get(Config.Openid);
        Uinfo uinfo1 = uinfoMapper.selectByPrimaryKey(openId);
        int i = 0;

        if (uinfo.getPhone()!=null&&VerifyUtil.isChinaPhoneLegal(uinfo.getPhone())){
            i++;
            uinfo1.setPhone(uinfo.getPhone());
        }
        if (uinfo.getEmail()!=null&&VerifyUtil.checkEmail(uinfo.getEmail())){
            i++;
            uinfo1.setEmail(uinfo.getEmail());
        }
        if (uinfo.getWxnum()!=null&&VerifyUtil.checkWXOrQQ(uinfo.getWxnum())){
            i++;
            uinfo1.setWxnum(uinfo.getWxnum());
        }
        if (uinfo.getQqnum()!=null&&VerifyUtil.checkWXOrQQ(uinfo.getQqnum())){
            i++;
            uinfo1.setQqnum(uinfo.getQqnum());
        }
        if (uinfo.getNickname()!=null&&VerifyUtil.checkNickName(uinfo.getNickname())){
            i++;
            uinfo1.setNickname(uinfo.getNickname());
        }

        if (uinfo.getRealname()!=null&&VerifyUtil.checkRealName(uinfo.getRealname())){
            i++;
            uinfo1.setRealname(uinfo.getRealname());
        }
        if (uinfo.getAge()!=null&&VerifyUtil.checkage(uinfo.getAge())){
            i++;
            uinfo1.setAge(uinfo.getAge());
        }

        if (i==0){
            return MyUtils.getNewMap(Config.ERROR,Config.RETRY,"No update or parameter validation failed",null);
        }
        int update = uinfoMapper.updateByPrimaryKey(uinfo1);
        if (update>0){
            return MyUtils.getNewMap(Config.SUCCESS,null,null,uinfoMapper.selectByPrimaryKey(uinfo1.getUserid()));
        }
        return MyUtils.getNewMap(Config.ERROR,Config.RETRY,"Update error, please try again",null);
    }


    public Map<String, Object> getLoginInfo(HttpSession session) {
        return MyUtils.getNewMap(Config.SUCCESS,null,null,uinfoMapper.selectByPrimaryKey(MyUtils.getOpenIdBySession(session)));
    }
}
