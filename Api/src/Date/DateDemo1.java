package Date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        // 1 创建时间对象
        Date d=new Date();
        System.out.println(d);
        // 2 创建对象表示一个指定的时间
        Date d2=new Date(0L);
        System.out.println(d2);
        // 3 setTime 修改时间
        d2.setTime(1000L);
        System.out.println(d2);
        // 4 getTime
        long time= d2.getTime();
        System.out.println(time);
    }
}
