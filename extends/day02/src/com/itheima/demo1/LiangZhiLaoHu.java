package com.itheima.demo1;

import java.util.Scanner;

public class LiangZhiLaoHu {
    public static void main(String[] args) {
        //判断两只老虎体重是否相等
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重:");
        int Tiger1= sc.nextInt();
        System.out.println("请输入第二只老虎的体重:");
        int Tiger2=sc.nextInt();
        System.out.println(Tiger1==Tiger2 ? "相同":"不同");
    }
}
