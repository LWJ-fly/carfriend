import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/14 18:35
 * @Descrintion:
 * @version: 1.0
 */
public class Test {

    @org.junit.Test
    public void fun(){
        List<Integer> list = new ArrayList();
        list.add(122123);
        list.add(122123555);
        list.add(122122343);
        System.out.println(list.contains(122122343));
        System.out.println(list.size());
        list.remove((Integer) 122122343);
        System.out.println(list.size());
    }
    @org.junit.Test
    public void fun1(){
        List<String> list = new ArrayList();
        list.add(122123+"");
        list.add(122123555+"");
        list.add(122122343+"");
        System.out.println(list.contains(122122343+""));
        System.out.println(list.size());
        list.remove(122122343+"");
        System.out.println(list.size());
    }
}
