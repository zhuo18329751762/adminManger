package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {

    ArrayList<Student> list = new ArrayList<>();

    //键盘录入学生信息并添加到集合中
    Scanner sc=new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
        Student s=new Student();
        System.out.println("请输入学生的姓名");
        String name=sc.next();
        System.out.println("请输入学生的年龄");
        int age=sc.nextInt();
        s.setName(name);
        s.setAge(age);
        list.add(s);
    }
    for (int i = 0; i < list.size(); i++) {
        Student stu=list.get(i);
        System.out.println(stu.getName()+", "+stu.getAge());
    }

    }
}
