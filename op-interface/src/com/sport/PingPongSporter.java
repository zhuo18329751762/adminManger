package com.sport;

public class PingPongSporter extends Person implements Xue,Speak{
    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }

    @Override
    public void xue() {
        System.out.println("乒乓球运动员学打乒乓球");
    }

    public PingPongSporter() {
    }

    public PingPongSporter(String name, int age) {
        super(name, age);
    }
}
