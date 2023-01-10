package Jdk8Time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateDemo2 {
    public static void main(String[] args) {
        // 1 获取当前时间对象(带时区)
        ZonedDateTime now=ZonedDateTime.now();
        System.out.println(now);
        // 2 获取指定时间对象(带时区)
        //年月日时分秒纳秒方式指定
        ZonedDateTime time1=ZonedDateTime.of(2023,10,1,
                11,12,12,0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);
        // 3 通过Instant+时区的方式指定获取时间对象
        Instant instant=Instant.ofEpochMilli(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2=ZonedDateTime.ofInstant(instant,zoneId);
        System.out.println(time2);
        // 4 withXxx 修改时间系列的方法
        //修改时间必须新创建对象
        ZonedDateTime time3 = time2.withYear(2000);
        System.out.println(time3);
        //增加时间
        ZonedDateTime time4 = time3.plusDays(1);
        System.out.println(time4);
        //减少时间
        ZonedDateTime time5 = time4.minusYears(1);
        System.out.println(time5);
    }
}
