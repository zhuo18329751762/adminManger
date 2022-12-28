package com.interfacedemo1;

public class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("狗子在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗在狗刨");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
