package SetDemo;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        /*
        需求：利用TreeSet存储整数并进行排序
         */
        // 1 创建TreeSet对象
        TreeSet<Integer> ts=new TreeSet<>();
        // 2 添加元素
        ts.add(4);
        ts.add(3);
        ts.add(2);
        ts.add(6);
        ts.add(1);
        // 3 打印集合
        //System.out.println(ts);

        // 4 遍历集合
        //迭代器
//        Iterator<Integer> it=ts.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        //增强for
//        for (Integer i : ts) {
//            System.out.println(i);
//        }
        //Lambda表达式
//        ts.forEach( integer->  System.out.println(integer)) ;
    }
}
