package online.wenmeng.config;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/14 23:09
 * @Descrintion: static静态资源
 * @version: 1.0
 */
public class Config {

    //存储用户信息消息,
    public static Map<Integer,Object> manInfo = new HashMap<>();
    /**
     * 定义是否收费
     * 定义收费金额
     */

    //接收意见反馈的邮箱
    public static String ReceiveMailNum = "15518064076@163.com";
    //保存服务信息
    public static Map<Integer,Integer> sendEmailCountMap = new HashMap<>();
    //控制每个用户提交意见的次数
    public static int numberOfFeedback = 3;
    /**
     * 数据库使用
     */
    public static String splitUsers = ",";
/*
uinacarinfo
    instatus:
        join    0 加入拼车
        ok      1 拼车完成
        over    2 订单完成
        error   3 订单异常（用户申述）
        leave   4 退出拼车
        out     5 被请出拼车
        fail   6 拼车失败
 */
    public static int uinacarinfo_instatus_join = 0;
    public static int uinacarinfo_instatus_ok = 1;
    public static int uinacarinfo_instatus_over = 2;
    public static int uinacarinfo_instatus_error = 3;
    public static int uinacarinfo_instatus_leave = 4;
    public static int uinacarinfo_instatus_out = 5;
    public static int uinacarinfo_instatus_fail = 6;
/*
    outinfo:
        1 qqnum
        2 wxnum
        4 phone
        8 email
        16 tallemail(邮件通知)
*/
    public static int uinacarinfo_outinfo_qqnum = 1;
    public static int uinacarinfo_outinfo_wxnum = 2;
    public static int uinacarinfo_outinfo_phone = 4;
    public static int uinacarinfo_outinfo_email = 8;
    public static int uinacarinfo_outinfo_tallemail = 16;
/*
拼车成功留言
 */
    public static String okTallEmail = "拼车完成，请尽快联系车友，详情查看：https://wenmeng.online/carfriend";
    public static String Logo = "闻梦家园";
/*
ulogin
    usable：
        unable  0 示不可用
        user    1 普通用户
        driver  2 司机
        admin   3 管理员
        root    4 超级管理员
 */
    public static int ulogin_usable_unable = 0;
    public static int ulogin_usable_user = 1;
    public static int ulogin_usable_driver = 2;
    public static int ulogin_usable_admin = 3;
    public static int ulogin_usable_root = 4;
/*
carfriend
    poolingstatus:
        ing     1 拼车中
        end     2 拼车完成
        timeOut 3 拼车超时但有人
        over    4 拼车完结
        error   5 拼车纠纷
        cancle  6 拼车取消
        errorOver   7 纠纷完成
    poolinglimit:
         no     0 无限制
        boy     -1 只限男生
        gril    -2 只限女生
        credibility >0 限制信誉度大小
 */
    public static int carfriend_poolingstatus_ing =1 ;
    public static int carfriend_poolingstatus_end = 2;
    public static int carfriend_poolingstatus_timeoOut = 3;
    public static int carfriend_poolingstatus_over = 4;
    public static int carfriend_poolingstatus_error = 5;
    public static int carfriend_poolingstatus_cancle = 6;
    public static int carfriend_poolingstatus_errorOver = 7;
    public static int carfriend_poolinglimit_no = 0;
    public static int carfriend_poolinglimit_boy = -1;
    public static int carfriend_poolinglimit_gril = -2;



    public static Integer credibility = 10;
    public static int nickNameMinLengtg = 1;
    public static int nickNameMaxLengtg = 10;


    //出现错误，很有可能是未知错误
    public static String ERROR = "error";
    //请求数据成功
    public static String SUCCESS = "success";
    //重试
    public static String RETRY = "retry";
    //用户的登录页面
    public static String LOGIN = "login";
    //跳转到主页
    public static String INDEX = "index";


    /**
     * 返回参数定义
     */
    public static String STATE = "state";//请求的状态    success error
    public static String ACTION = "action";//后台希望的的响应动作 null index login
    public static String MSG = "msg";//附加的消息 null
    public static String DATA = "data";//数据内容 null


    /**
     * 后台使用参数
     */
    //用户保存在session中的openID
    public static String Openid = "openid";
    //用户的昵称
    public static String NickName = "nickName";
    //用户的性别
    public static String Gender = "gender";
    //用户头像信息
    public static String ChatHead = "chatHead";
    //用户登录时保存在session中的登录的QQ信息
    public static String userInfoInRun = "userInfoInRun";
    //程序中对日期的格式化
    public static String patternDate = "yyyy-MM-dd HH:mm:ss";



}
