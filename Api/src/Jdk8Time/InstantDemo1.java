package Jdk8Time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo1 {
    public static void main(String[] args) {
        // 1 获取当前时间的Instant对象(标准时间)
//        Instant now = Instant.now();
//        System.out.println(now);
        // 2 根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);//1970-01-01T00:00:00Z
        Instant instant2=Instant.ofEpochSecond(1L);
        System.out.println(instant2);//1970-01-01T00:00:01Z
        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant3);

        // 3 指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        // 4 isXXX 判断
        Instant instant4=Instant.ofEpochMilli(0L);
        Instant instant5=Instant.ofEpochMilli(1000L);
        // 5 用于时间前后的判断
        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);
        // 6 减少时间系列的方法 接收需要创建新的时间对象
        Instant instant6 = Instant.ofEpochMilli(5466666564L);//1970-03-05T06:31:06.564Z
        System.out.println(instant6);
        Instant instant7 = instant6.minusSeconds(1);//1970-03-05T06:31:05.564Z
        System.out.println(instant7);

    }
}
