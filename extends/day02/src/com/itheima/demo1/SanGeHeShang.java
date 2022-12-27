package com.itheima.demo1;

public class SanGeHeShang {
    public static void main(String[] args) {
        //有三个和尚，现在需要获取三个和尚中的最高身高
        int Height1=150;
        int Height2=165;
        int Height3=210;
        int Max=Height1>Height2?Height1:Height2;
        System.out.println(Max>Height3?Max:Height3);
    }
}
