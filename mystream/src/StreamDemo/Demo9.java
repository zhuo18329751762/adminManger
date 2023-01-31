package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class Demo9 {
    public static void main(String[] args) {
        //流终结方法
        /*
        void forEach(Consumer action)       遍历
        long count()                        统计
        toArray()                           收集流中的数据，放到数组中
         */
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","周志南","赵敏","张强","张三丰","张翠山");

        //void forEach(Consumer action)       遍历
        //Consumer的泛型，表示流中数据的类型
        //accept方法的形参s：依次表示流里面的每一个数据
        //方法体:对每一个数据的处理操作
//        list.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        //list.stream().forEach(s-> System.out.println(s));


        //long count()                        统计
//        long count = list.stream().count();
//        System.out.println(count);


        //toArray()                           收集流中的数据，放到数组中
        //IntFunction的泛型，具体类型的数组
        //apply的形参：流中的数据个数，要跟数组的长度保持一致
        //apply的返回值：具体类型的数组
        //方法体：就是创建数组
//        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
//        System.out.println(Arrays.toString(arr));

        String[] arr2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));

    }
}
