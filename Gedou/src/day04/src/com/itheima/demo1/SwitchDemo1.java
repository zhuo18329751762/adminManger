package day04.src.com.itheima.demo1;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //兰州拉面，武汉热干面，北京炸酱面，陕西油泼面
        System.out.println("     菜单  ");
        System.out.println("   兰州拉面   ");
        System.out.println("  武汉热干面  ");
        System.out.println("  北京炸酱面  ");
        System.out.println("  陕西油泼面  ");
        System.out.println("请问您想吃什么");
        Scanner sc=new Scanner(System.in);
        String noodles = sc.nextLine();
        switch (noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃泡面");
                break;
        }
    }
}
