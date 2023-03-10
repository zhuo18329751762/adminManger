package FunctionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class Test4 {
    public static void main(String[] args) {
        /*
        创建集合添加学生对象，学生对象属性：name，age
        把姓名和年龄拼接成：张三-23的字符串，并放到数组当中（使用方法引用完成）
         */
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);
        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
//         list.stream().map(new Function<Student, String>() {
//            @Override
//            public String apply(Student student) {
//                return student.getName() + "-" + student.getAge();
//            }
//        }).forEach(s-> System.out.println(s));
        String[] strings = list.stream().map(Student::toString).toArray(String[]::new);
        System.out.println(Arrays.toString(strings));
    }
}
