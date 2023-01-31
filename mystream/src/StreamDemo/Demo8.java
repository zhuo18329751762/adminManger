package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Demo8 {
    public static void main(String[] args) {
        /*
        map     转换流中的数据
         */
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌-15","周志南-14","赵敏-55","张强-100","张三丰-40","张翠山-57");
        //只获取年龄，并打印
        //String ->int

        //第一个类型：流中原本的数据类型
        //第二个类型：要转成之后的类型
        //apply的形参s：依次表示流中的每一个数据
        //返回值：表示转换之后的数据
//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] arr = s.split("-");
//                String ageString = arr[1];
//                int age=Integer.parseInt(ageString);
//                return age;
//            }
//        }).forEach(s-> System.out.println(s));

        list.stream().map(s->Integer.parseInt(s.split("-")[1]))
        .forEach(s-> System.out.println(s));
    }
}
