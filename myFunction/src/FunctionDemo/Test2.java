package FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    /*
    集合中存储一些字符串数据，比如：张三,23
    收集到Student类型的数组当中(使用方法引用完成)
     */
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌,15","周志南,14","赵敏,55","张强,100","张三丰,40","张翠山,57");
        Student[] list1 = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(list1);

    }
}
