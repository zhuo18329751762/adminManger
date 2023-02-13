package reflectDemo2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        /*
        反射可以和配置文件结合的方式，动态的创建对象，并调用方法
         */
        // 1 读取配置文件中的信息
        Properties prop = new Properties();
        FileInputStream fis=new FileInputStream("myreflect\\prop.properties");
        prop.load(fis);
        fis.close();
        //System.out.println(prop);
        // 2 获取全类名和方法名
        String classname = (String) prop.get("classname");
        String methodname = (String) prop.get("method");
        System.out.println(classname);
        System.out.println(methodname);
        // 3 利用反射创建对象并运行方法
        Class clazz = Class.forName(classname);
        Constructor con = clazz.getDeclaredConstructor();
        Object o = con.newInstance();
        System.out.println(o);
        Method method = clazz.getDeclaredMethod(methodname);
        method.setAccessible(true);
        method.invoke(o);
    }
}
