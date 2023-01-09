package Regex;

public class Demo3 {
    public static void main(String[] args) {
        //验证用户名
        //要求：大小写字母，数字，下划线一共4-16位

        String regex1="\\w{4,16}";
        System.out.println("da_ddff".matches(regex1));
        //验证身份证号码
        //18位，前17位任意数字，最后一位可以是数字也可以是大写或者小写x
        //按照身份证号码格式严格要求

        //忽略大小写的书写格式
        //(?i)abc

        //身份证号码简单效验
        String regex2="[1-9]\\d{16}(\\d||(?i)x)";
        System.out.println("61043120030345145X".matches(regex2));
        System.out.println("61043120030345145x".matches(regex2));

        //身份证号码复杂效验
        //[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[1-2]\\d|3[0-1])\\d{3}(\\d|(?i)x)
        String regx3="[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[1-2]\\d|3[0-1])\\d{3}(\\d|(?i)x)";
        System.out.println("61043120030325145x".matches(regx3));
    }
}
