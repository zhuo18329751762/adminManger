package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Day {
    public static void main(String[] args) throws ParseException {
        //用代码实现计算活了多少天，用JDK7和JDK8两种方式实现

        //JDK7
        //只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值
        // 1 当前时间
        long today = System.currentTimeMillis();
        // 2 计算出生年月日的毫秒值
        String birthday="2003年3月15日";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();
        // 3 计算间隔多少天
        long time=today-birthdayTime;
        System.out.println(time/1000/60/60/24);


        //JDK8
        LocalDate ld1=LocalDate.of(2003,3,15);
        LocalDate ld2=LocalDate.now();
        long between = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(between);

    }
}
