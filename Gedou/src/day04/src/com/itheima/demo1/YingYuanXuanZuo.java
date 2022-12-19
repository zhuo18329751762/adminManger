package day04.src.com.itheima.demo1;

import java.util.Scanner;

public class YingYuanXuanZuo {
    public static void main(String[] args) {
        //键盘录入本人的电影票号，若为奇数则打印坐左边，若为偶数则打印坐右边
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的票号");
        int Ticket=sc.nextInt();
        if(Ticket>=0&&Ticket<=100) {
            if (Ticket % 2 == 0) {
                System.out.println("请您坐右边");
            } else {
                System.out.println("请您坐左边");
            }
        }
        else {
            System.out.println("您的票不合法！！！");
        }
        }
    }
