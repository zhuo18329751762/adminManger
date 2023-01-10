package Jdk8Time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo1 {
    public static void main(String[] args) {
        //当前时间
        LocalDateTime today=LocalDateTime.now();
        System.out.println(today);
        //生日时间
        LocalDateTime birthDate=LocalDateTime.of(2000,1,1,
                0,0,0);
        System.out.println(birthDate);
        System.out.println("相差的年份"+ChronoUnit.YEARS.between(birthDate,today));
        System.out.println("相差的月份"+ChronoUnit.MONTHS.between(birthDate,today));
    }
}
