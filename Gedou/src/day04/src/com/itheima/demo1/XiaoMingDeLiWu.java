package day04.src.com.itheima.demo1;

import java.util.Scanner;

public class XiaoMingDeLiWu {
    public static void main(String[] args) {
        //键盘录入小明的考试成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩:");
        int Mark = sc.nextInt();
        if (Mark >= 0 && Mark <= 100) {
        if (Mark >= 95 && Mark <= 100) {
            System.out.println("送小明一辆自行车");
        } else if (Mark >= 90 && Mark <= 94) {
            System.out.println("带小明去游乐场玩一天");
        } else if (Mark >= 80 && Mark <= 89) {
            System.out.println("送小明变形金刚一个");
        } else {
            System.out.println("揍小明一顿");
        }
    }
        else {
            System.out.println("录入的成绩不合法");
        }
        }
    }
