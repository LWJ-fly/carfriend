import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/14 18:35
 * @Descrintion:
 * @version: 1.0
 */
public class Test {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("输入判断的回文数： 输入exit退出");
            String str = scanner.nextLine().trim();
            if (str.equals("exit")) {
                break;
            }
            new Test().judge(str);
        }
    }


    /**
     * 判断是否是回文数——数字类型判断
     * @param num
     *
     *
     * 7123321
     * 7000001
     *
     * 12332
     * 10002
     *
     * 233
     * 203
     *
     *  3
     */
    public void judge(int num){
        int lastNum ;
        while (num>9){//如果是两位数以上 进行循环
            int numLen = 10;
            lastNum = num - ((int)(num/10))*10;
            while (num/numLen>9){//判断当前数字位数
                numLen *= 10;
            }
            if (((int)(num/numLen))==lastNum){
                num = (num  - lastNum - lastNum*numLen)/10;
            }else {
                break;
            }
        }
        if (num>9){
            System.out.println("不是回文数");
        }else {
            System.out.println("是回文数");
        }
    }

    /**
     * 判断是不是回文数——字符串类型判断
     * @param str
     *
     * 1    2   3   3   2   1
     * 0    1   2   3   4   5
     */
    public void judge(String str){
        int num = str.length();
        int i=0;
        while(str.charAt(--num)==str.charAt(i++)){
            if (num<=i){
                System.out.println("是回文数");
                break;
            }
        }
        if (num>=i){
            System.out.println("不是回文数");
        }
    }

    /**
     * 3000米绳子，do while 每天减半，多久小于五米
     *  先执行一次
     *      然后进行判断
     */
    @org.junit.Test
    public void fun1(){
        Double len = 3000d;//定义一个绳子
        int day = 0;
        do{
            //每次绳子减去一半
            len = len/2;
            day++;
            System.out.println("用时"+day+"天\t绳子长度为"+len);
            //出口，len<5 不在循环
            if (len<5){
                break;
            }
        }while (true);

        System.out.println("一共用了 "+day+" 天");
    }
    /**
     * 键盘上输入一个整数，判断完整数
     *  完整数：除了自己本身，所有因数和
     *      28 =  1+2+4+7+14
     *      1 本身
     *      5 6之间
     *      i  j    i  j    i  j    i  j    i  j    i  j
     *      1*28    2*14    4*7     7*4     14*2    28*1
     *
     *      25
     *      i  j    i  j    i  j    i  j
     *      1*25    5*5      5*5    25*1
     *
     *      num  开平方
     *
     *  那么有一个需要排除的 1 不是完整数
     */
    @org.junit.Test
    public void fun(){
        int num = 2;
        int sum = 1;//所有的因数和，因为一定有1 * num本身 所以先+ 1
        if (num == 1){
            System.out.println("1 不是完整数");
            return;
        }
        int mid = (int) Math.sqrt(num);
        int point = mid;
        while (point>1){
            point = point -1;
            for (int i = num-1;i>mid;i--){
                if (point*i==num){
                    sum += (point+i);
                    System.out.println("找出因数： "+point+" 和 "+i);
                }
            }
        }
        System.out.println(sum);
        if (sum == num){
            System.out.println("是完整数");
        }else {
            System.out.println("不是完整数");
        }

    }
}
