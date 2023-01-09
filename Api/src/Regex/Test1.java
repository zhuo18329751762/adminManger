package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {

        //Pattern:正则表达式
        //Matcher:文本匹配器

        String str=" Java4深度覅北四环腹背受敌很方便茶几上的成本就是大家还是大城市的城市的Java8锁定技佛士大夫Java11" ;
        //获取正则表达式的对象
        Pattern p=Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器对象
        //m:文本匹配器的对象
        //str:大串
        //p:规则
        //m要在str中找到符合p规则的小串
        Matcher m=p.matcher(str);
        while(m.find()){
            String s = m.group();
            System.out.println(s);

        }

        //拿着文本匹配器从头开始读取，寻找是否有满足规则的子串
        //没有返回false
        //有的话返回true，在底层记录子串的起始索引和结束索引+1
        boolean b=m.find();

        //方法底层会根据find方法记录的索引进行字符串的截取
        //subString(起始索引，结束索引)；包头不包尾
//        String s1=m.group();
//        System.out.println(s1);

        //继续读取后面的内容
//         b = m.find();
//        String s2=m.group();
//        System.out.println(s2);

    }

}
