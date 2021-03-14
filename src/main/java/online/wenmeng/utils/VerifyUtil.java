package online.wenmeng.utils;

import online.wenmeng.config.Config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * 专注于各种信息的验证
 */
public class VerifyUtil {

    /**
     * 校验用户昵称
     * @return
     */
    public static Boolean checkNickName(String nickName){
        if (nickName!=null&&nickName.length() >= Config.nickNameMinLengtg&&nickName.length()<=Config.nickNameMaxLengtg){
            return true;
        }
        return false;
    }
    /**
     * 校验用户昵称
     * @return
     */
    public static Boolean checkage(int age){
        if (age >= 0 &&age<=120){
            return true;
        }
        return false;
    }

    /**
     * 校验用户昵称
     * @return
     */
    public static Boolean checkRealName(String Name){
        if (Name!=null&&Name.length() >= 2&&Name.length()<=5){
            return true;
        }
        return false;
    }

    public static boolean checkWXOrQQ(String weChat) {
        if(weChat==null||weChat.trim().length()==0){
            return false;
        }
        //QQ最短5位 微信号最短是6位最长20位
        Pattern p = Pattern.compile("^[a-zA-Z0-9_-]{5,19}$");
        Matcher m = p.matcher(weChat);
        return m.matches();
    }



    public static boolean checkEmail(String email) {
        boolean flag = false;
        try {
            String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
            Pattern regex = Pattern.compile(check);
            Matcher matcher = regex.matcher(email);
            flag = matcher.matches();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    /**
     * 大陆号码或香港号码都可以
     * @param str
     * @return 符合规则返回true
     * @throws PatternSyntaxException
     */
    public static boolean isPhoneLegal(String str) throws PatternSyntaxException {
        return isChinaPhoneLegal(Long.parseLong(str)) || isHKPhoneLegal(str);
    }

    /**
     *
     * 大陆手机号码11位数，匹配格式：前三位固定格式+后8位任意数
     * 此方法中前三位格式有：
     * 13+任意数
     * 145,147,149
     * 15+除4的任意数(不要写^4，这样的话字母也会被认为是正确的)
     * 166
     * 17+3,5,6,7,8
     * 18+任意数
     * 198,199
     * @param str
     * @return 正确返回true
     * @throws PatternSyntaxException
     */
    public static boolean isChinaPhoneLegal(Long str) throws PatternSyntaxException {
        // ^ 匹配输入字符串开始的位置
        // \d 匹配一个或多个数字，其中 \ 要转义，所以是 \\d
        // $ 匹配输入字符串结尾的位置
        String regExp = "^((13[0-9])|(14[5,7,9])|(15[0-3,5-9])|(166)|(17[3,5,6,7,8])" +
                "|(18[0-9])|(19[8,9]))\\d{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str.toString());
        return m.matches();
    }

    /**
     * 香港手机号码8位数，5|6|8|9开头+7位任意数
     * @param str
     * @return 正确返回true
     * @throws PatternSyntaxException
     */
    public static boolean isHKPhoneLegal(String str) throws PatternSyntaxException {
        // ^ 匹配输入字符串开始的位置
        // \d 匹配一个或多个数字，其中 \ 要转义，所以是 \\d
        // $ 匹配输入字符串结尾的位置
        String regExp = "^(5|6|8|9)\\d{7}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
