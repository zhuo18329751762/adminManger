package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Demo7 {
    public static void main(String[] args) {
        //创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)
        //存储三个键值对元素，并遍历
        //要求:同姓名，同年龄认为是同一个学生
        Student s1=new Student("张三",18);
        Student s2=new Student("李四",19);
        Student s3=new Student("王五",20);
        Student s4=new Student("王五",20);
        Map<Student,String> m=new HashMap<>();
        m.put(s1,"陕西");
        m.put(s2,"山西");
        m.put(s3,"广西");
        m.put(s4,"上海");
        // 遍历集合
//        Set<Student> keys = m.keySet();
//        for (Student key : keys) {
//            String value=m.get(key);
//            System.out.println(key+"="+value);
//        }

//        Set<Map.Entry<Student, String>> entries = m.entrySet();
//        for (Map.Entry<Student, String> entry : entries) {
//            Student key=entry.getKey();
//            String value=entry.getValue();
//            System.out.println(key+"="+value);
//        }

        m.forEach(( student,  s)->  System.out.println(student+"="+s));
    }
}
