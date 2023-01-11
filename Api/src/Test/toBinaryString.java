package Test;

import java.util.Scanner;

public class toBinaryString {
    public static void main(String[] args) {
        //定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个十进制数");
        String str = sc.nextLine();
        int i=Integer.parseInt(str);
        String binaryStr=ToBinaryString(i);
        System.out.println(binaryStr);
    }

    private static String ToBinaryString(int num) {
        StringBuilder str=new StringBuilder();
        while(true){
            if(num==0){
                break;
            }
            //获取余数
            int remainder=num%2;
            //或者直接插入，不用翻转
            //str.insert(0,remainder);
            str.append(remainder);
            num=num/2;
        }
        return str.reverse().toString();
        //return str.toString();
    }
}
