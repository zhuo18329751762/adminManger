package Objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        User u1=null;
        User u2=new User("张三",18);

        //比较两个对象属性是否相等
//        boolean flag=u1.equals(u2);
//        System.out.println(flag);
        boolean result= Objects.equals(u1,u2);
        System.out.println(result);

        //public static boolean inNull(Object obj)  判断对象是否为null
        User u3=new User();
        User u4=null;
        System.out.println(Objects.isNull(u4));

        //public static boolean nonNull(Object obj)  判断对象是否为null
        System.out.println(Objects.nonNull(u4));
    }
}
