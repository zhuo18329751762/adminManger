package Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型，集合如何存储数据
        //不能访问子类特有的功能
        // 1 创建集合的对象
        ArrayList list=new ArrayList();
        // 2 添加数据
        Student s1=new Student("张三",18);
        list.add(123);
        list.add("aaa");
        list.add(s1);
        // 3 遍历集合获取每一个元素
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
