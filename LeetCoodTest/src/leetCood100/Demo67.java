package leetCood100;

import Test.汉诺塔递归;

import java.util.ArrayList;
import java.util.List;

public class Demo67 {
    /*
    给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。
     */
    public static void main(String[] args) {
        String a="11";
        String b="101";
        String s = addBinary(a, b);
        System.out.println(s);
    }
    public static String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int temp=0;
        int len1 = a.length()-1;
        int len2 = b.length()-1;
        while (len1>=0||len2>=0||temp!=0){
            if(len1>=0) {
                temp += a.charAt(len1) - '0';
            }
            if(len2>=0) {
                temp += b.charAt(len2) - '0';
            }
            sb.append(temp%2);
            temp=temp/2;
            len1--;
            len2--;
        }
        return sb.reverse().toString();
    }
}
