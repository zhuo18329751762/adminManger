package myreflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1 获取字节码文件
        Class classz = Class.forName("myreflect2.Student");
        // 2 获取构造方法
        //获取所有公共的构造方法
//        Constructor[] cons1 = classz.getConstructors();
//        for (Constructor con : cons1) {
//            System.out.println(con1);
//        }
        //获取所有构造方法
//        Constructor[] cons2 = classz.getDeclaredConstructors();
//        for (Constructor con : cons2) {
//            System.out.println(con);
//        }
        //获取公共单个构造方法
//        Constructor con1 = classz.getConstructor();//获取空参
//        System.out.println(con1);
//
//        Constructor con2 = classz.getConstructor(String.class,int.class);//获取有参构造
//        System.out.println(con2);

        //获取所有权限构造方法
//        Constructor con3 = classz.getDeclaredConstructor(String.class);
//        System.out.println(con3);
//
        Constructor con4 = classz.getDeclaredConstructor(int.class);
//        int m1 = con4.getModifiers();
//        System.out.println(con4);
//        System.out.println(m1);

        //暴力反射:表示临时取消权限效验
        con4.setAccessible(true);
        Student stu=(Student) con4.newInstance(14);
        System.out.println(stu);


    }
}
