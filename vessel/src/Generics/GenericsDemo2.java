package Generics;

import java.util.ArrayList;

/*
定义一个工作类：ListUtil
类中定义一个静态方法addAll，用来添加多个集合的元素

 */
public class GenericsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        ListUtil.addAll(list,"aaa","aaa","aaa","aaa");
        System.out.println(list);
    }
}
