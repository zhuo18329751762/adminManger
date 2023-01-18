package SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo3 {
    public static void main(String[] args) {
        //LinkedHashSet可以保证有序
        //创建对象
        Student s1=new Student("zhangsan",18);
        Student s2=new Student("lisi",18);
        Student s3=new Student("wangwu",20);
        Student s4=new Student("zhangsan",18);
        //创建集合的对象
        LinkedHashSet<Student> lhs=new LinkedHashSet<>();
        //添加元素
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));
        //打印
        System.out.println(lhs);

    }
}
