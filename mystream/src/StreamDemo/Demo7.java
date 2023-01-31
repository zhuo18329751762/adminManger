package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo7 {
    public static void main(String[] args) {
        /*
        distinct        元素去重，依赖（hashCode和equals方法）
        concat          合并a和b两个流为一个流
         */
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"张无忌","周志南","赵敏",
                "张无忌","张强","赵敏","张三丰","张无忌","张翠山");

        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"周志南","林正英");

        //distinct          元素去重，依赖（hashCode和equals方法）
        //list1.stream().distinct().forEach(s-> System.out.println(s));

        //concat
        Stream.concat(list1.stream(),list2.stream()).forEach(s-> System.out.println(s));
    }
}
