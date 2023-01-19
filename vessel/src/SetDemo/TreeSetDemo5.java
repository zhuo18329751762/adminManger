package SetDemo;

import java.util.TreeSet;

public class TreeSetDemo5 {
    public static void main(String[] args) {
        /*
        创建TreeSet集合，并添加3个学生对象
        学生对象属性
        姓名，年龄
        要求按照学生年龄进行排序
        同年龄按照姓名字母排序(暂不考虑中文)
        同姓名，同年龄认为是同一个人
        方式一:
                默认的排序规则/自然排序
                Student实现Comparable接口，重写里面的抽象方法，在指定比较规则
         */
        // 1 创建三个学生对象
        Student s1=new Student("zhangsan",88);
        Student s2=new Student("lisi",19);
        Student s3=new Student("wangwu",20);
        // 2 创建TreeSet集合
        TreeSet<Student> ts=new TreeSet<>();
        // 3 添加
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        // 4 打印集合
        System.out.println(ts);
    }
}
