package CodeSuiXiangLu;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int a=num/100000;
        num=num%100000;
        num=num*10+a;
        System.out.println(num);
    }
}
