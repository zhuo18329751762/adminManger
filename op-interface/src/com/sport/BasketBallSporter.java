package com.sport;

public class BasketBallSporter extends Person implements Xue{
    @Override
    public void xue() {
        System.out.println("篮球运动员学打篮球");
    }

    public BasketBallSporter() {
    }

    public BasketBallSporter(String name, int age) {
        super(name, age);
    }
}
