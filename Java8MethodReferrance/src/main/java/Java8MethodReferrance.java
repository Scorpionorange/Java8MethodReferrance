import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by ScorpionOrange on 2016/06/14.
 */
public class Java8MethodReferrance {
    public static void main(String[] args){
        List names = new ArrayList();

        names.add("Peter");
        names.add("Linda");
        names.add("Smith");
        names.add("Zack");
        names.add("Bob");

        //通过 System.out::println 引用了输出方法
        names.forEach(System.out::println);

        System.out.println("\n----- ----- 分隔符 ----- -----");

        //使用for循环进行遍历并输出
        for(int i = 0; i < names.toArray().length; i++){
            System.out.print(names.toArray()[i] + "   ");
        }

        System.out.println("\n----- ----- 分隔符 ----- -----");

        //使用foreach循环进行遍历并输出
        for(Object s : names.toArray()){
            System.out.print(s.toString() + "   ");
        }
    }
}
