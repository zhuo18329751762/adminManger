package myreflect1;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        获取class对象的三种方式
        1.Class.forName(“全类名”)
        2.类名.class
        3.对象.getClass
         */
        // 1 Class.forName(“全类名”)
        Class clazz1 = Class.forName("myreflect1.Student");
        System.out.println(clazz1);

        // 2 第二种方式   类名.class
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        // 3 对象.getClass
        Student s=new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);

    }
}
