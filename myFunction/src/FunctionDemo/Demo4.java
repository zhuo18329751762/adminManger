package FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.function.Function;

public class Demo4 {
    public static void main(String[] args) {
        //集合里面有一些字符串，要求变成大写后进行输出
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");
        //变成大写后进行输出
//        list.stream().map(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        }).forEach(s-> System.out.println(s));

        list.stream().map(String::toUpperCase).forEach(s-> System.out.println(s));
    }
}
