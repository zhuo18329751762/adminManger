package Object;

import com.google.gson.Gson;

public class copy {
    public static void main(String[] args) throws CloneNotSupportedException{
        //protected Object clone(int a)  对象克隆
        int[] date={0,1,2,3,4,5,6,7,8,9};
        User u1=new User(4215,"张三","123456","图片",date);
        //方法在底层会帮我们创建一个对象 并把原对象中的数据拷贝过去
        //需要重写Object中的clone方法

        //浅拷贝
        //在克隆非引用数据类型数据时 不会影响
        //在拷贝引用数据类型时 仅仅是将串池中的地址进行拷贝
        //其中一个对象的数据发生改变 另外一个也会被影响
        User u2=(User) u1.clone();
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        date[0]=9;
        System.out.println(u1.toString());
        System.out.println(u2.toString());


        //深克隆
        //基本数据类型拷贝过来
        //字符串会复用
        //引用数据类型会重新创建新的

        //用Gson工具
        Gson gson=new Gson();
        //把对象变成一个字符串
        String s=gson.toJson(u1);
        //把字符串变回对象
        User u3=gson.fromJson(s,User.class);
        System.out.println(u3);
    }
}
