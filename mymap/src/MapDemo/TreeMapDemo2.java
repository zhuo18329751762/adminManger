package MapDemo;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        //键:学生对象
        //值:籍贯
        //要求:按照学生年龄的升序排列.年龄一样按照姓名的字母排序，同姓名年龄为同一个人
        //创建学生对象
        Student s1=new Student("张三",18);
        Student s2=new Student("bb",14);
        Student s3=new Student("王五",19);
        Student s4=new Student("赵六",20);
        Student s5=new Student("aa",14);
        TreeMap<Student,String> tm=new TreeMap<>();
        //添加学生对象
        tm.put(s1,"陕西");
        tm.put(s2,"云南");
        tm.put(s3,"四川");
        tm.put(s4,"北京");
        tm.put(s5,"天津");
        tm.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s) {
                System.out.println(student+"="+s);
            }
        });
    }
}
