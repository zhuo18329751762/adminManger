package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> list=new ArrayList<>();
        //创建学生对象
        Student s1=new Student("张三",18);
        Student s2=new Student("李四",19);
        Student s3=new Student("王五",20);
        //添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println(stu.getName()+" ,"+stu.getAge());
        }
       
    }
}
