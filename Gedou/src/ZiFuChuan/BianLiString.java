package ZiFuChuan;

import java.util.Scanner;

public class BianLiString {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s=sc.next();
        //进行遍历
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);

        }
    }
}
