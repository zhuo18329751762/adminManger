package StringBuilder;

import java.util.Scanner;

public class duiChenString {
    public static void main(String[] args) {
        //使用StringBuilder的场景
        //字符串的拼接
        //字符串的反转

        //对称字符串的判断
        //abc
        //正着 反着一样
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        //反转键盘录入的字符串

//        StringBuilder sb=new StringBuilder();
//        sb.append(str);
//        sb.reverse();

        String sb=new StringBuilder().append(str).reverse().toString();
        if(str.equals(sb)){
            System.out.println("是对称字符串");
        }
        else
        {
            System.out.println("不是对称字符串");
        }
    }

}
