package Date;

import java.util.Date;
import java.util.Random;

public class TimeCalculate {
    public static void main(String[] args) {
        //打印时间节点开始一年后的时间
        extracted();

        //定义任意两个Date对象，比较哪个在前，哪个在后
        Random r=new Random();
        //创建两个时间对象
        Date d1=new Date(Math.abs(r.nextInt()));
        Date d2=new Date(Math.abs(r.nextInt()));
        System.out.println(d1);
        System.out.println(d2);
        if(d1.getTime()>d2.getTime()){
            System.out.println("d1>d2");
        }else if(d1.getTime()<d2.getTime()){
            System.out.println("d1<d2");
        }else {
            System.out.println("d1==d2");
        }

    }

    private static void extracted() {
        //打印时间节点开始一年后的时间
        Date d=new Date(0);
        long time = d.getTime();
        time=time+1000L*60*60*24*365;
        d.setTime(time);
        System.out.println(d);
    }
}
