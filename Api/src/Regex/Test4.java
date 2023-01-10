package Regex;

public class Test4 {
    public static void main(String[] args) {
        //非捕获分组，分组之后不需要再用本组数据，仅仅是把数据括起来
        //身份证号码的简易正则表达式
        String s="610431200503142256";
        //?: ?! ?= 都是非捕获分组，不占用组
        String regex="[1-9]\\d{16}(?:\\d|x|X)\\1";
        System.out.println(s.matches(regex));


    }
}
