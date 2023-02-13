package reflectDemo1;

import java.io.*;
import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        /*
        对于任意一个对象，都可以把对象的字段名和值，保存到文件中去
         */
        Student s=new Student("张三",18);
        Teacher t=new Teacher("李四",15);
        saveObject(s);
    }
    //把对象里面的成员变量名和值保存到本地文件中
    public static void saveObject(Object o) throws IllegalAccessException, IOException {
        Class clazz = o.getClass();
        //创建IO流
        BufferedWriter bw=new BufferedWriter(new FileWriter("myreflect\\a.txt"));
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            //成员变量名
            String name = field.getName();
            //成员变量值
            Object value = field.get(o);
            //存储
            bw.write(name+"="+value);
            bw.newLine();

        }
        bw.close();
    }
}
