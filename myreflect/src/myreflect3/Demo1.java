package myreflect3;

import java.lang.reflect.Field;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        // 1 获取字节码文件
        Class clazz = Class.forName("myreflect3.Student");
        // 2 获取所有公共成员变量
//        Field[] fields = clazz.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
        // 3 获取所有类型的成员变量
//        Field[] fields1 = clazz.getDeclaredFields();
//        for (Field field : fields1) {
//            System.out.println(field);
//        }

        // 4 获取单个公共成员变量
//        Field gender = clazz.getField("gender");
//        System.out.println(gender);

        // 5 获取单个所有权限成员变量
        Field name = clazz.getDeclaredField("name");
        //System.out.println(name);
        //获取权限修饰符
        int m = name.getModifiers();
        System.out.println(m);
        //获取成员变量名字
        String str = name.getName();
        System.out.println(str);
        //获取成员变量数据类型
        Class<?> type = name.getType();
        System.out.println(type);
        //获取成员变量记录的值
        Student s=new Student("张三",23,"男");
        name.setAccessible(true);
        Object value = name.get(s);
        System.out.println(value);


    }
}
