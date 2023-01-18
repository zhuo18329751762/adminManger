package Generics;

import java.util.ArrayList;

public class GenericsDemo4 {
    public static void main(String[] args) {
        /*
        定义一个方法，形参是一个集合，但是集合中的数据类型不确定
         */
        //创建集合的的对象
        ArrayList<ye> list1=new ArrayList<>();
        ArrayList<fu> list2=new ArrayList<>();
        ArrayList<zi> list3=new ArrayList<>();
        method(list1);
        method(list2);
        method(list3);
    }
    //此时，泛型里面写的是什么类型，那么只能传递什么类型的数据
    //利用泛型方法有一个小弊端，此时他可以接收任意的数据类型
    //此时我们就可以使用泛型的通配符
    // ？表示不确定的类型
    // 可以表示类型的限定
    // ？extends E:表示可以传递E或E所有的子类类型
    // ? super E:表示可以传递E或者E所有的父类类型

    //泛型的通配符：可以限定类型的范围
    public static void method(ArrayList<? extends ye> list){

    }
}
