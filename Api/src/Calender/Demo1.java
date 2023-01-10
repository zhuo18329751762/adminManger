package Calender;

import java.util.Calendar;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        //Calender代表了系统当前时间的日历对象，可直接修改年份，月份...
        // 1 获取日历对象
        //细节1 Calender是一个抽象类，不能直接new，而是通过一个静态方法获取到子类对象
        //根据系统的不同时区来获取不同的日历对象
        //把时间中的纪元，年，月，日，时，分，秒，星期，放到一个数组中
        //细节1:
        //月份0~11 如果获取出来是0，那么实际是1月
        //星期：在老外眼中 星期日是一周中的第一天
        // 1(星期日) 2(星期一)  3 4 5 6 7(星期六)
        Calendar c = Calendar.getInstance();
        //System.out.println(c);
        // 2 修改日历对象中的时间
        Date d=new Date(0L);
        c.setTime(d);
//        System.out.println(c);
//
//        int year=c.get(Calendar.YEAR);
//        int month=c.get(Calendar.MONTH);
//        int date=c.get(Calendar.DATE);
//        int week=c.get(Calendar.DAY_OF_WEEK);
//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(date);
//        System.out.println(getWeek(week));

        //修改日历的某一个字段
        c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONTH,11);
        c.set(Calendar.DAY_OF_MONTH,10);
        System.out.println(c);
        //add
        c.add(Calendar.MONTH,-1);
        System.out.println(c);


    }
    public static String getWeek(int index){
        //定义一个数组，让汉字星期几 与1~7对应
        String[] arr={"","星期90日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[index];
    }
}
