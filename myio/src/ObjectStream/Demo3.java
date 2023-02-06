package ObjectStream;

import java.io.*;
import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        将多个自定义对象序列化到文件中，但是由于对象的个数不确定，反序列化流该如何读取呢
         */

//        //创建多个对象
//        Student s1=new Student("zhangsan",23,"南京");
//        Student s2=new Student("lisi",25,"上海");
//        Student s3=new Student("wangwu",24,"北京");
//        ArrayList<Student> list=new ArrayList<>();
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        //创建序列化对象
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("myio\\d.txt"));
//        oos.writeObject(list);
//        oos.close();

        //创建反序列化对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("myio\\d.txt"));
        ArrayList<Student> list=(ArrayList<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }
        ois.close();

    }
}
