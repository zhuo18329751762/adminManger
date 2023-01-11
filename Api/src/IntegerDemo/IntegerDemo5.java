package IntegerDemo;

import java.util.Scanner;

public class IntegerDemo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.nextLine();//接收一整行，遇到回车键才会停止
        System.out.println(str);
        int i = Integer.parseInt(str);
        System.out.println(i);

    }
}
