package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Demo6 {
    public static void main(String[] args) {
        /*
        filter      过滤
        limit       获取前几个元素
        skip        跳过前几个元素

        中间方法，返回新的stream流，原来的stream流只能使用一次，建议使用链式编程
        修改Stream流中的数据，不会影响原来集合或者数组的数据
         */
        ArrayList<String> list=new ArrayList<>();

        Collections.addAll(list,"张无忌","周志南","赵敏","张强","张三丰","张翠山");
        //filter    过滤  把张开头的留下，其余数据过滤不要

//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                //如果返回值为true，留下
//                //如果返回值为false，不要
//                return s.startsWith("张");
//            }
//        }).forEach(s-> System.out.println(s));
//        list.stream()
//                .filter(s->s.startsWith("张"))
//                .filter(s->s.length()==3)
//                .forEach(s-> System.out.println(s));

        //limit       获取前几个元素
//        list.stream().limit(3)
//                .forEach(s-> System.out.println(s));

        //skip        跳过前几个元素
//        list.stream().skip(4)
//                .forEach(s-> System.out.println(s));
    }
}
