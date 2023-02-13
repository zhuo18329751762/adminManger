package myreflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 1 获取Class字节码文件
        Class clazz = Class.forName("myreflect4.Student");
        // 2 获取所有公共方法对象(包含父类中的所有公共方法)
//        Method[] methods = clazz.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }
        // 3 获取所有权限方法对象(不包含父类中的所有公共方法)
//        Method[] methods = clazz.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }
        // 4 获取单个方法对象
        Method eat = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(eat);
        //获取方法修饰符
        int modifiers = eat.getModifiers();
        System.out.println(modifiers);
        //获取方法名字
        String name = eat.getName();
        System.out.println(name);
        //获取方法形参
        Parameter[] parameters = eat.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        //获取方法抛出的异常
        Class<?>[] exceptionTypes = eat.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }
        //方法运行
        Student s=new Student("张三",14);
        //参数一 方法调用者
        //参数二 传递的形参
        eat.setAccessible(true);
        //获取返回值
        Object result = eat.invoke(s, "奥利给");
        System.out.println(result);
    }
}
