package StreamDemo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo10 {
    public static void main(String[] args) {
        /*
        collect(Collector collector)            收集流中的数据，放到集合中（List Set Map）
         */
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无-男-16","张无忌-男-15","周志南-女-14","赵敏-女-56",
                "张强-男-20","张三丰-男-55","张翠山-男-40");

        //收集List集合
        //把所有的男性收集起来
        List<String> newlist = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newlist);

        //收集到Set集合   相比List集合可以去重
        //把所有的男性收集起来
        Set<String> newset = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(newset);

        //收集Map集合当中
        //谁做为键，谁做为值
        //键：姓名。值：年龄
        //toMap:参数一表示键的生成规则
        //      参数二表示值的生成规则

        /*
        参数一:
        Function泛型一：表示流中的每一个数据类型
                泛型二：表示Map集合中键的数据类型
                方法apply形参：依次表示流里面的每一个数据
                        方法体：生成键的代码
                        返回值：已经生成的键

        参数二:
        Function泛型一：表示流中的每一个数据类型
                泛型二：表示Map集合中键的数据类型
                方法apply形参：依次表示流里面的每一个数据
                        方法体：生成值的代码
                        返回值：已经生成的值
         */

        //Map集合键不能重复
//        Map<String, Integer> newmap = list.stream().filter(s -> "男".equals(s.split("-")[1]))
//                .collect(Collectors.toMap(new Function<String, String>() {
//                     @Override
//                     public String apply(String s) {
//                         String key = s.split("-")[0];
//                         return key;
//                     }
//                 },
//                new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        Integer value = Integer.parseInt(s.split("-")[2]);
//                        return value;
//                    }
//                }));
//        System.out.println(newmap);
        Map<String, String> map2 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0]
                        ,
                        s -> s.split("-")[2]));
        System.out.println(map2);
    }
}
