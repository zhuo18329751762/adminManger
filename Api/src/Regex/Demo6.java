package Regex;

public class Demo6 {
    public static void main(String[] args) {
        //   \\组号，表示把第X组的内容再拿出来用一次
        String regex1="(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b123b".matches(regex1));
        System.out.println("11231".matches(regex1));
        System.out.println("1123b".matches(regex1));//false

        //多个字符相同
        String regex2="(.+).+\\1";
        System.out.println("a145a".matches(regex2));
        System.out.println("abc145abc".matches(regex2));
        System.out.println("*145*".matches(regex2));

        //判断一个字符串的开始部分和结束部分是否一致？开始部分内部每个字符也需要一致
        //*0次或者多次
        String regex3="((.)+\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bb123bbb".matches(regex3));
        System.out.println("&&123&&".matches(regex3));

    }
}
