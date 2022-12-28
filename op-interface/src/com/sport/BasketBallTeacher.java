package com.sport;

public class BasketBallTeacher extends Person implements Jiao{
    @Override
    public void jiao() {
        System.out.println("篮球教练教打篮球");
    }

    public BasketBallTeacher() {
    }

    public BasketBallTeacher(String name, int age) {
        super(name, age);
    }
}
