package zhuoyang.staticDemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //创建一个集合，用来存储学生集合
        ArrayList<Student> list=new ArrayList();
        Student stu1=new Student("张三",18,"男");
        Student stu2=new Student("李四",19,"男");
        Student stu3=new Student("王五",25,"女");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        int maxAge =StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAge);
    }


}
