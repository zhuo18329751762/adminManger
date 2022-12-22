package StringBuilderTest;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        //键盘录入任意字符串，打乱里面的内容

        //键盘录入一个字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        String s=upsetString(str);
        System.out.println(s);
    }
    //定义一个打乱字符串的方法
    public static String upsetString(String str){
        char[] c=new char[str.length()];
        Random r=new Random();
        for (int i = 0; i < str.length(); i++) {
            c[i]=str.charAt(i);
        }
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch=c[i];
            int j=r.nextInt(str.length());
            c[i]=c[j];
            c[j]=ch;
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(c[i]);
        }
        return sb.toString();
    }
}
