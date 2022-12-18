package ZiFuChuan;

import java.util.Scanner;

public class TongJiString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.next();
        int D=0,d=0,j=0;
        for (int i = 0; i < s.length(); i++) {
            //char变量在参与运算时 自动转换为int类型
            char c=s.charAt(i);
            if(65<=c&&c<=90){
                D++;

            }
            if('0'<=c&&c<='9'){
                j++;
            }
            if(97<=c&&c<=122){
                d++;
            }
        }
        System.out.println(s+"的大写子母有"+D+"个 小写字母有"+d+"个 数字有"+j+"个");

    }
}
