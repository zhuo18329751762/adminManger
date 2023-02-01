package StreamDemo;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        /*
        现有两个ArrayList集合
        第一个集合中：存储6名男演员的名字和年龄。第二个集合中：存储6名女演员的名字和年龄
        姓名和年龄中间用逗号隔开。比如：张三,23
        要求完成以下操作
        1，男演员只要名字为三个字的前两个人
        2，女演员只要姓杨的，并且不要第一个
        3，把过滤后的男演员姓名和女演员姓名合并到一起
        4，将上一步的演员信息封装成Actor对象
        5，将所有的演员对象都保存到list集合中
        备注：演员类Actor，属性只有一个：name，age
         */
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"张三,23","易烊千玺，20","马化腾,45","蔡徐坤,25","李四,45","王麻子,12");
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"杨洋,12","迪丽热巴,29","杨幂,39","关晓彤,24","杨百合,40","王菲,50");
        //1 处理男演员 男演员只要名字为三个字的前两个人
        Stream<String> man = list1.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);
        //2 处理女演员 女演员只要姓杨的，并且不要第一个
        Stream<String> woman = list2.stream()
                .filter(s -> '杨' == (s.split(",")[0].charAt(0)))
                .skip(1);
        //3 把过滤后的男演员姓名和女演员姓名合并到一起
        //4 将上一步的演员信息封装成Actor对象
        List<Actor> list = Stream.concat(man, woman)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
