package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //初识 lambda表达式
        //lambda的省略规则
        // 1 参数类型可以省略不写
        // 2 如果只有一个参数，参数类型可以省略，同时()也可以省略
        // 3 如果Lambda表达式的方法体只有一行，大括号，分号，return可以省略不写，需要同时省略
        Integer[] arr={2,3,1,5,6,7,8,4,9};
        //Lambda的省略写法
        Arrays.sort(arr, ( o1,  o2) -> o1-o2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
