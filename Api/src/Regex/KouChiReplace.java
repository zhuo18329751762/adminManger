package Regex;

public class KouChiReplace {
    public static void main(String[] args) {
        //将字符串替换为“我要学编程”
        String s="我要学学编编编编程程";
        String regex="(.)\\1+";
        String s1=s.replaceAll(regex,"$1");
        System.out.println(s1);
    }
}
