package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        /*
        定义一个集合，并添加一些整数1,2,3,4,5,6,7,8,9,10
        过滤奇数，只留下偶数
        并将结果保存起来
         */
        ArrayList<Integer> arr=new ArrayList<>();
        Collections.addAll(arr,1,2,3,4,5,6,7,8,9,10);
        List<Integer> newarr = arr.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(newarr);
    }
}
