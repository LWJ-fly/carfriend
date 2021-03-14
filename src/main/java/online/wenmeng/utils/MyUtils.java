package online.wenmeng.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import online.wenmeng.bean.Carfriend;
import online.wenmeng.config.Config;
import org.apache.ibatis.annotations.Case;
import org.apache.ibatis.jdbc.Null;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Auther: 狼芒
 * @Date: 2020/12/24 21:52
 * @Descrintion: 一个工具类，项目中所使用到的但并不重要的方法放到此类
 * @version: 1.0
 */
public class MyUtils {

    public static Map<String,Object> createUserLoginInfo(int openid,String nickName,String gender,String chatHead){
        HashMap<String, Object> map = new HashMap<>();
        map.put(Config.Openid,openid);
        map.put(Config.NickName, nickName);
        map.put(Config.Gender, gender);
        map.put(Config.ChatHead, chatHead);
        return map;
    }

    /**
     * @param session 用户的登录信息
     * @return 如果用户没有登录返回map，登录了返回null
     */
    public static Map<String,Object> checkUserLogin(HttpSession session){
        Map<String, Object> map = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        if (MyUtils.checkNull(map)){//如果没有登录信息，则返回登录页面
            return MyUtils.getNewMap(Config.ERROR,Config.LOGIN,"not Login",null);
        }
        return null;
    }


    /**
     * state 状态(success)、action动作、msg消息、data数据
     * @return
     */
    public static Map<String,Object> getNewMap(String state,String action,String msg,Object data){
        HashMap<String, Object> map = new HashMap<>();
        map.put(Config.STATE,state);
        map.put(Config.ACTION,action);
        map.put(Config.MSG,msg);
        map.put(Config.DATA,data);
        return map;
    }

    /**
     * @Method: 生成int型随机数 大于5位小于10位的随机数
     * @return 返回大于5位小于10位的随机数
     */
    public static int getRandomNum(){
        int num;
        while (true){
            num = (int) (Math.random()* 1000000000);
            if (num>100000) {
                return num;
            }
        }
    }

    /**
     * @param obj 传输过来需要判断的数据
     * @return 如果为空返回true,否则返回false
     */
    public static Boolean checkNull(Object obj){
       if (obj instanceof String) {
            String s = (String) obj;
            if (s!=null&&s.trim().length()>0){
                return false;
            }
            return true;
        } else if (obj instanceof Boolean) {
            return (Boolean) obj;
        } else if (obj instanceof Arrays) {
           Arrays arrays = (Arrays)obj;
           if (arrays!=null){
               return false;
           }
           return true;
        } else if (obj instanceof List) {
           List list = (List)obj;
           if (list!=null&&list.size()>0){
               return false;
           }
           return true;
        } else if (obj instanceof Map) {
           Map map = (Map)obj;
           if (map!=null&&!map.isEmpty()){
               return false;
           }
           return true;
        } else if (obj instanceof Date) {
            Date d = (Date) obj;
            if (d!=null){
                return false;
            }
            return true;
        }else if (obj instanceof Integer||obj instanceof Double||obj instanceof Float||obj instanceof Long) {
            return false;
        }else if (obj instanceof Null||obj==null){
           return true;
       }
       return false;
    }

    /**
     * @Method: 解析浏览器地址中的参数
     * @param UrlParameter 浏览器地址中的参数
     * @return 返回Map集合，将地址栏参数封装到Map集合中
     */
    public static Map<String,String> priseUrlParameter(String UrlParameter){
        Map<String, String> map = new HashMap<String, String>();
        try {
            final String charset = "utf-8";
            UrlParameter = URLDecoder.decode(UrlParameter, charset);
            if (UrlParameter.indexOf('?') != -1) {
                final String contents = UrlParameter.substring(UrlParameter.indexOf('?') + 1);
                String[] keyValues = contents.split("&");
                for (int i = 0; i < keyValues.length; i++) {
                    String key = keyValues[i].substring(0, keyValues[i].indexOf("="));
                    String value = keyValues[i].substring(keyValues[i].indexOf("=") + 1);
                    map.put(key, value);
                }
            }else {//如果只是传过来的后缀
                String[] keyValues = UrlParameter.split("&");
                for (int i = 0; i < keyValues.length; i++) {
                    String key = keyValues[i].substring(0, keyValues[i].indexOf("="));
                    String value = keyValues[i].substring(keyValues[i].indexOf("=") + 1);
                    map.put(key, value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


    /**
     * @Method: java获取request中的参数、java解析URL问号后的参数
     * @param UrlParameter  浏览器地址中的参数
     * @param keyWord 需要解析的参数
     * @return
     */
    public static String getOneParameter(String UrlParameter,String keyWord) {
        final String charset = "utf-8";
        try {
            UrlParameter = URLDecoder.decode(UrlParameter, charset);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (UrlParameter.indexOf('?') != -1) {//标准浏览器地址解析
            final String contents = UrlParameter.substring(UrlParameter.indexOf('?') + 1);
            String[] keyValues = contents.split("&");
            String key , value;
            for (int i = 0; i < keyValues.length; i++) {
                key = keyValues[i].substring(0, keyValues[i].indexOf("="));
                value = keyValues[i].substring(keyValues[i].indexOf("=") + 1);
                if (key.equals(keyWord)) {
                    if (value != null || !"".equals(value.trim())) {
                        return value;
                    }
                }
            }
        }else {//如果只是传过来的后缀
            String[] keyValues = UrlParameter.split("&");
            String key , value;
            for (int i = 0; i < keyValues.length; i++) {
                key = keyValues[i].substring(0, keyValues[i].indexOf("="));
                value = keyValues[i].substring(keyValues[i].indexOf("=") + 1);
                if (key.equals(keyWord)) {
                    if (value != null || !"".equals(value.trim())) {
                        return value;
                    }
                }
            }
        }
        return null;
    }

    /**
     * @Method: 解析简单json串，获取相应的属性
     * @param jsonStr 需要解析的字符串
     * @param targetStr 目标属性
     * @return 需要获取目标属性的值
     */
    public static String getOneProperty(String jsonStr , String targetStr){
        //有些返回值带有（） 需要去掉
        if(jsonStr.contains("(")){
            jsonStr = jsonStr.substring(jsonStr.indexOf('(') + 1);
            if (jsonStr.contains(")")){
                jsonStr = jsonStr.substring(0,jsonStr.indexOf(')'));
            }
        }
        //将String字符转为Json对象
        JSONObject jsonObject = JSON.parseObject(jsonStr);
        return jsonObject.getString(targetStr);
    }
    /**
     * 获取用户真实IP地址，不使用request.getRemoteAddr()的原因是有可能用户使用了代理软件方式避免真实IP地址,
     * 可是，如果通过了多级反向代理的话，X-Forwarded-For的值并不止一个，而是一串IP值
     *
     * @return ip
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        System.out.println("x-forwarded-for ip: " + ip);
        if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
            // 多次反向代理后会有多个ip值，第一个ip才是真实ip
            if( ip.indexOf(",")!=-1 ){
                ip = ip.split(",")[0];
            }
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    /**
     * 根据用户的session获取用户的信息
     * @param session
     */
    public static int getOpenIdBySession(HttpSession session) {
        Map<String, Object> userLoginInfo = (Map<String, Object>) session.getAttribute(Config.userInfoInRun);
        return (int) userLoginInfo.get(Config.Openid);
    }

    public static String dateFormat(Date date, String PatternDate){
        return new SimpleDateFormat(PatternDate).format(date);
    }

    /**
     * 检测在拼车信息中是否有参数
     * @param status 拼车信息中的状态
     * @param checkStatus 检查是否有某种状态
     * @return 返回是否
     */
    public static Boolean uinacarinfoHaveOutinfo(int status,int checkStatus){
        if (status>=Config.uinacarinfo_outinfo_tallemail){
            if (Config.uinacarinfo_outinfo_tallemail==checkStatus){
                return true;
            }
            status-=Config.uinacarinfo_outinfo_tallemail;
        }

        if (status>=Config.uinacarinfo_outinfo_email){
            if (Config.uinacarinfo_outinfo_email==checkStatus){
                return true;
            }
            status-=Config.uinacarinfo_outinfo_email;
        }

        if (status>=Config.uinacarinfo_outinfo_phone){
            if (Config.uinacarinfo_outinfo_phone==checkStatus){
                return true;
            }
            status-=Config.uinacarinfo_outinfo_phone;
        }

        if (status>=Config.uinacarinfo_outinfo_wxnum){
            if (Config.uinacarinfo_outinfo_wxnum==checkStatus){
                return true;
            }
            status-=Config.uinacarinfo_outinfo_wxnum;
        }

         if (status>=Config.uinacarinfo_outinfo_qqnum){
            if (Config.uinacarinfo_outinfo_qqnum==checkStatus){
                return true;
            }
            status-=Config.uinacarinfo_outinfo_qqnum;
        }
         return false;
    }

}
