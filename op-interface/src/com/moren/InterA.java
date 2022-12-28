package com.moren;

public interface InterA {
    public abstract void method();
    public default void show(){
        System.out.println("接口中的默认方法-----------show");
    }
}
