package com.interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Frog f=new Frog("小青",3);
        System.out.println(f.getName()+", "+f.getAge());
        f.eat();
        f.swim();
    }
}
