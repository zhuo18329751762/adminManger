package FunctionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class Test1 {
    public static void main(String[] args) {
        //集合中有以下数字，要求把他们都变成int类型
        ArrayList<String> arr=new ArrayList<>();
        Collections.addAll(arr,"1","2","3","4","5");
        //方法引用
//        arr.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                int i=Integer.parseInt(s);
//                return i;
//            }
//        }).forEach(s-> System.out.println(s));

        arr.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));

    }

}
