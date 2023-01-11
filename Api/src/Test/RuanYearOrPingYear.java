package Test;

import java.time.LocalDate;
import java.util.Calendar;

public class RuanYearOrPingYear {
    public static void main(String[] args) {
        //判断任意的年份是闰年还是平年
        //用JDK7和JDK8两种方式实现
        //JDK7
        Calendar c=Calendar.getInstance();
        c.set(2000,2,1);//月份范围0~11
        //把日历减一天
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        if(day==29){
            System.out.println("闰年");
        }else{
            System.out.println("平年");
        }

        //JDK8
        //月份范围1~12
        //设定时间
        LocalDate read = LocalDate.of(2000, 3, 1);
        //把时间往前减一天
        LocalDate read2 = read.minusDays(1);
        System.out.println(read2);
        //获取这一天的天数
        int day1 = read2.getDayOfMonth();
        if(day1==29){
            System.out.println("闰年");
        }else{
            System.out.println("平年");
        }


        //true 闰年
        //false 平年
                System.out.println(read.isLeapYear());
    }
}
