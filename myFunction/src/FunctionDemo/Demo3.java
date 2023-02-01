package FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo3 {
    public static void main(String[] args) {
        //集合里面存储姓名和年龄，比如:张无忌,15
        //要求将数据封装成Student对象并收集到list集合中
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌,15","周志南,14","赵敏,13",
                "张强,20","张三丰,23","张翠山,52");
//        List<Student> newlist = list.stream().map(new Function<String, Student>() {
//            @Override
//            public Student apply(String s) {
//                String[] arr = s.split(",");
//                String name = arr[0];
//                int age = Integer.parseInt(arr[1]);
//
//                return new Student(name, age);
//            }
//        }).collect(Collectors.toList());
//        System.out.println(newlist);

        List<Student> newlist = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newlist);
    }
}
