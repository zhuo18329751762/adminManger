package FunctionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class Test3 {
    public static void main(String[] args) {
        /*
        创建集合添加学生对象，学会对象属性:name，age
        只获取姓名并放到数组当中（使用方法引用完成）
         */
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wangwu",25));
        //获取集合到数组中
//        String[] arr = list.stream().map(new Function<Student, String>() {
//            @Override
//            public String apply(Student student) {
//                return student.getName();
//            }
//        }).toArray(String[]::new);

        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
