package FunctionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Demo5 {
    public static void main(String[] args) {
        /*
            方法引用(数组的构造方法)
            格式:
            数据类型[]::new
         */
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);
        //收集到数组中
//        Integer[] arr = list.stream().toArray(new IntFunction<Integer[]>() {
//            @Override
//            public Integer[] apply(int value) {
//                return new Integer[value];
//            }
//        });
//        System.out.println(Arrays.toString(arr));

        //方法引用
        Integer[] arr = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
