package Test;

import java.util.Scanner;

public class parseInt {
    public static void main(String[] args) {
        //实现parseInt方法的效果，将字符串形式的数据转成整数
        //字符串中只能是数字不能有其他字符
        //最少一位，最多十位
        //0不能开头
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        String str = sc.nextLine();
        int i=parseint(str);
        System.out.println(i);
    }

    private static int parseint(String str) {
        int num = 0;
        if(!str.matches("[1-9]\\d{0,9}")){
            System.out.println("格式有误");
            System.exit(0);
        }else{
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                    num=(str.charAt(i)-'0')+num*10;
                }else{
                    System.out.println("包含非法字符");
                    System.exit(0);
                }
            }

        }
        return num;
    }

}
