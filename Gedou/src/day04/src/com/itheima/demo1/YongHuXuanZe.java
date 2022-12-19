package day04.src.com.itheima.demo1;

import java.util.Scanner;

public class YongHuXuanZe {
    public static void main(String[] args) {
        //1 2 3 4为功能键，其他均为退出
        Scanner sc=new Scanner(System.in);
        System.out.println("请选择按键:");
        int number= sc.nextInt();
        switch(number){
            case 1-> System.out.println("机票查询");
            case 2-> System.out.println("机票预订");
            case 3-> System.out.println("机票改签");
            default ->  System.out.println("退出服务");
        }
    }
}
