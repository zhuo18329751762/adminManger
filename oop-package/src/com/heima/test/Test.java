package com.heima.test;


import com.heima.domain1.Teacher;

//final修饰方法 表明这是最终方法 不能被重写
//final修饰类 表明这是最终类 不能被继承
//final修饰变量 叫做常量 只能赋值一次
//final修饰基本数据类型 记录的值不能发生变化
//final修饰引用数据类型 记录的地址不能发生变化,属性值可以发生变化
public class Test {
    public static void main(String[] args) {
        //创建学生对象
//        Student s=new Student();
//        s.setName("张三");
//        s.setAge(18);
//        System.out.println(s.getName()+", "+s.getAge());

//        String s="abc";
//        System.out.println(s);

//        Teacher t=new Teacher();
//        com.heima.domain1.Teacher t=new com.heima.domain1.Teacher();
//        com.heima.domain2.Teacher t2=new com.heima.domain2.Teacher();

        final int a=110;
        System.out.println(a);
    }
}
