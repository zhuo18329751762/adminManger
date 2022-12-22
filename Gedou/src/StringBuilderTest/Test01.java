package StringBuilderTest;

import java.util.Scanner;

//转换罗马数字
public class Test01 {
    public static void main(String[] args) {
        //1 键盘录入一个字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        //2 判断录入的字符串是否满足要求
        boolean flag =checkstr(str);
        //3 定义罗马数字字符数组
        String[] Rm={"Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        //4 接收转化后的字符串
        if(flag) {
            String s = changeString(str, Rm);
            System.out.println(s);
        }else{
            System.out.println("当前字符串不符合规则，请重新输入");
        }
    }
    //判断录入字符串是否合法
    public static boolean checkstr(String str){
        StringBuilder sb=new StringBuilder();
        for (int i = 0,j=0; i < str.length(); i++) {
            if(str.charAt(i)<'0'||str.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }
    //转换为罗马数字
    public static String changeString(String str,String[] Rm){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)-'0'-1)>=0) {
                sb.append(Rm[str.charAt(i) - '0' - 1]);
            }
            else{
                sb.append("");
            }
        }
        return sb.toString();
    }

}
