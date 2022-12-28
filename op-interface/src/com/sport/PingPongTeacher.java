package com.sport;

public class PingPongTeacher extends Person implements Jiao,Speak{
    @Override
    public void jiao() {
        System.out.println("乒乓球教练教打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }

    public PingPongTeacher() {
    }

    public PingPongTeacher(String name, int age) {
        super(name, age);
    }
}
