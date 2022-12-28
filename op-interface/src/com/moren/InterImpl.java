package com.moren;

public class InterImpl implements InterA,InterB{
    @Override
    public void method() {
    }

    @Override
    public void show() {
        System.out.println("接口中的默认方法-----------show");
    }

}
