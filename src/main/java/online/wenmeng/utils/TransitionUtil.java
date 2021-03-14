package online.wenmeng.utils;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @Auther: 狼芒
 * @Date: 2021/2/14 19:38
 * @Descrintion: 常见对象类型的转换工具类
 * @version: 1.0
 */
public class TransitionUtil {
    /**
     * @Method：返回相应类型的值
     * Boolean  Byte    Character   Short    Integer     Long       Float       Double
     * 1        2       3           4       5           6           7           8
     * String   Date    Array       Map      List       BigDecimal  BigInteger  Stack
     * 9        10      11          12      13          14          15          16
     * @param obj 需要判断类型的值
     * @param <T> 返回的类型
     * @return 返回相应的类型转换的对象值
     */
    public static  <T> T transitionType(Object obj, Class<T> t){
        if (obj==null){
            return null;
        }
        return (T) transition(obj,Integer.parseInt(getObjectType(obj)+""+getClassType(t)));
    }

    /**
     * @Method:将指定的对象进行相应的转换
     * @param original 未进行转换的对象
     * @param code  进行转换的代码值
     *   规律： 【下标符号A,B相拼接，代表A转B、  B,A相拼接，代表B转A】
     *  12 代表 Boolean(boolean)转Byte(byte)      13 代表 Boolean(boolean)转Character(char)
     *  14 代表 Boolean(boolean)转Short(short)    15 代表 Boolean(boolean)转Integer(int)
     *  910 代表 String转Date      109 代表 Data转String
     *
     *    boolean   byte    char       short    int         long       float       double
     *    Boolean  Byte    Character   Short    Integer     Long       Float       Double
     *      1        2       3           4       5           6         7           8
     *    String   Date    Array       Map      List       BigDecimal  BigInteger  Stack
     *      9      10      20          30        40         50         60          70
     * @return 返回转换后的目标对象       根据上方的参考码，需要可以自行添加调用
     */
    private static Object transition(Object original, int code){
        if (original==null){
            return null;
        }
        //相应的接口，需要可进行补充.....
        switch (code){
            case 15:
                return  (Boolean)original ? 1 : 0;
            case 19:
                return original.toString();
            case 58:
                return Double.parseDouble(original.toString());
            case 56:
            case 96:
                return Long.parseLong(original.toString().trim());
            case 95:
                return Integer.parseInt((String) original);
            case 508:
                return ((BigDecimal) original).doubleValue();
            default:
                int mid ;
                //剩下的是自己转自己？
                if (code<100){//自己转自己，两位数
                    mid = code/10;
                    code = code-mid*10;
                    if (mid==code){//判断是否相同
                        return original;
                    }
                }else if (code>1000){//自己转自己，四位数
                    mid = code/100;
                    code = code-mid*100;
                    if (mid==code){//判断是否相同
                        return original;
                    }
                }
                throw new RuntimeException("TransitionUtil.transition: No corresponding conversion method is implemented:"+code+"(没有实现相应的转换方法:"+code+")");
        }
    }
    /*
     * @Method:获取Object中的类型
     *    boolean   byte    char       short    int         long       float       double
     *    Boolean  Byte    Character   Short    Integer     Long       Float       Double
     *      1        2       3           4       5           6         7           8
     *    String   Date    Array       Map      List       BigDecimal  BigInteger  Stack
     *      9      10      20          30        40         50         60          70
     *
     * @param obj 要获取参数的类型
     * @return 返回类型的标识
     */
    private static int getObjectType(Object obj){
        if (obj instanceof Boolean){
            return 1;
        }else if (obj instanceof Byte){
            return 2;
        }else if (obj instanceof Character){
            return 3;
        }else if (obj instanceof Short){
            return 4;
        }else if (obj instanceof Integer){
            return 5;
        }else if (obj instanceof Long){
            return 6;
        }else if (obj instanceof Float){
            return 7;
        }else if (obj instanceof Double){
            return 8;
        }else if (obj instanceof String){
            return 9;
        }else if (obj instanceof Date){
            return 10;
        }else if (obj instanceof Array){
            return 20;
        }else if (obj instanceof Map){
            return 30;
        }else if (obj instanceof List){
            return 40;
        }else if (obj instanceof BigDecimal){
            return 50;
        }else if (obj instanceof BigInteger){
            return 60;
        }else if (obj instanceof Stack){
            return 70;
        }else {
            return 0;
        }
    }

    /*
     * @Method:获取Object中的类型
     *    boolean   byte    char       short    int         long       float       double
     *    Boolean  Byte    Character   Short    Integer     Long       Float       Double
     *      1        2       3           4       5           6         7           8
     *    String   Date    Array       Map      List       BigDecimal  BigInteger  Stack
     *      9      10      20          30        40         50         60          70
     *    void
     *    Void      待补充
     *     80       10000
     *
     * @param obj 要获取参数的类型
     * @return 返回类型的标识
     */
    private static <T> int getClassType(Class<T> t){
         /*
            首先判断处理基本类型
            Boolean.TYPE, Character.TYPE, Byte.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Void.TYPE
            ((Class) t.getField("TYPE").get(null)).isPrimitive()
         */
        if (t==Boolean.class||t==boolean.class){
            return 1;
        }else if (t==Character.class||t==char.class){
            return 2;
        }else if (t==Byte.class||t==byte.class){
            return 3;
        }else if (t==Short.class||t==short.class){
            return 4;
        }else if (t==Integer.class||t==int.class){
            return 5;
        }else if (t==Long.class||t==long.class){
            return 6;
        }else if (t==Float.class||t==float.class){
            return 7;
        }else if (t==Double.class||t==double.class){
            return 8;
        }else if (t==Void.class||t==void.class){//这个类型设置为80吧
            return 80;

        /*
            非基本类型
            String   Date    Array       Map      List       BigDecimal  BigInteger  Stack
         */
        }else if (t==String.class){
            return 9;
        }else if (t==Date.class){
            return 10;
        }else if (t==Array.class){
            return 20;
        }else if (t==Map.class){
            return 30;
        }else if (t==List.class){
            return 40;
        }else if (t==BigDecimal.class){
            return 50;
        }else if (t==BigInteger.class){
            return 60;
        }else if (t==Stack.class){
            return 70;
        }else {
            return 10000;
        }
    }
}