package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
        //按照字符串的长度进行排序，短的在前面，长的在后面
        String[] arr={"a","aaaa","aaa","aa"};
        //a aa aaa aaaa
        //如果以后要将数组中的内容进行排序，就需要用到sort方法，而且要指定排序的规则
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //按照字符串的长度进行排序
//                return o1.length()-o2.length();
//            }
//        });
        //Lambda
        Arrays.sort(arr, ( o1,  o2)-> o1.length()-o2.length());
        System.out.println(Arrays.toString(arr));
    }
}
