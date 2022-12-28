package com.sport;

public class Test {
    public static void main(String[] args) {
        BasketBallSporter bbs=new BasketBallSporter("蔡徐坤",18);
        System.out.println(bbs.getName()+", "+bbs.getAge());
        bbs.xue();
        BasketBallTeacher bbt=new BasketBallTeacher("李四",35);
        System.out.println(bbt.getName()+", "+bbt.getAge());
        bbt.jiao();

        PingPongSporter pps=new PingPongSporter("迪迦",888);
        System.out.println(pps.getName()+", "+pps.getAge());
        pps.xue();
        pps.speak();

        PingPongTeacher ppt=new PingPongTeacher("盖亚",999);
        System.out.println(ppt.getName()+", "+ppt.getAge());
        ppt.jiao();
        ppt.speak();
    }
}
