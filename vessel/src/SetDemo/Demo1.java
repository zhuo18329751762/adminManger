package SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        /*
        利用Set系列的集合，添加字符串，并使用多种方式遍历
        迭代器
        增强for
        Lambda表达式
         */
        // 1 创建Set集合对象
        Set<String> s=new HashSet<>();
        // 2 添加元素
        //如果当前元素是第一次添加，返回true
        //如果当前元素不是第一次添加，返回false
        System.out.println(s.add("张三"));
        s.add("李四");
        s.add("王五");
        // 3 打印集合
        //无序 没有索引
        //System.out.println(s);
        //迭代器遍历
//        Iterator<String> it=s.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        //增强for
//        for (String s1 : s) {
//            System.out.println(s1);
//        }
        //Lambda表达式
        s.forEach(str->System.out.println(str));
    }
}
