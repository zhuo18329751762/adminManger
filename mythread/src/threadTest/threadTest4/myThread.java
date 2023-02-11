package threadTest.threadTest4;

import threadMethod5.MyThread;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class myThread extends Thread{
    //共享数据
    //100块，分成三个包
    static BigDecimal money=BigDecimal.valueOf(100);
    static int count=3;
    //最小的中奖金额
    static final BigDecimal MIN= BigDecimal.valueOf(0.01);

    @Override
    public void run() {
       synchronized (MyThread.class){
           if(count==0){
               System.out.println(getName()+"没有抢到红包！");
           }else{
               //不能直接随机
               BigDecimal price;
               if(count==1){
                   //无需随机
                   price=money;
               }else{
                   //表示前两次，抽红包
                   Random r=new Random();
                   double bounds=money.subtract(BigDecimal.valueOf(count-1).multiply(MIN)).doubleValue();
                   price=BigDecimal.valueOf(r.nextDouble(bounds));
               }
               price=price.setScale(2, RoundingMode.HALF_UP);
               money=money.subtract(price);
               System.out.println(getName()+"抢到了"+price+"元");
               count--;
           }

       }
    }
}
