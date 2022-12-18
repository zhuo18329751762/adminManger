package ZiFuChuan;

import java.util.Scanner;

public class FanZhuanString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.next();
        String a=FanZhuan(s);
        System.out.println(a);

    }
    public static String FanZhuan(String s){
        String a=new String();
        for (int i = s.length()-1; i >=0; i--) {
            char c=s.charAt(i);
            a=a+c;
        }
        return a;
    }

}
