package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) {
        String s = "java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        // 1 定义正则表达式
        //?理解为前面的数据Java
        //=表示在Java后面要跟随的数据
        //但是在获取的时候，只能取前半部分

        //爬取版本号8,11,17的java文本，但是只要java，不显示版本号
//        String regex="Java(?=8|11|17)";
//        Pattern p=Pattern.compile(regex);
//        Matcher m = p.matcher(s);
//        while(m.find()){
//            String str=m.group();
//            System.out.println(str);
//        }

        //爬取版本号8,11,17的java文本，正确爬取结果为：java8 java11 java17 java17
//        String regex1="Java(?:8|11|17)";
//        Pattern p=Pattern.compile(regex1);
//        Matcher m = p.matcher(s);
//        while(m.find()){
//            String str=m.group();
//            System.out.println(str);
//        }
        //爬取除了版本号8,11,17的java文本
        String regex2="((?i)Java)(?!8|11|17)";
        Pattern p=Pattern.compile(regex2);
        Matcher m = p.matcher(s);
        while(m.find()){
            String str=m.group();
            System.out.println(str);
        }
    }
}
