package SetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo6 {
    public static void main(String[] args) {


    /*
    请自行选择比较器排序和自然排序两种方式
    要求：存入四个字符串，”c“ ”ab“ ”df“ ”qwer“
    按照长度排序，如果一样长，则按照首字母排序
     */

        //比较器排序
        //o1:表示当前要添加的元素
        //o2:表示已经在红黑树中的元素
        //返回值规则与之前一样
        // 1 创建集合
        TreeSet<String> ts = new TreeSet<>(( o1,  o2)-> {
//                if(o1.length()!=o2.length()){
//                    return o1.length()-o2.length();
//                }else{
//                    return o1.charAt(0)-o2.charAt(0);
//                }
                //按照长度排序
                int i=o1.length()-o2.length();
                i=i==0?o1.compareTo(o2):o1.length()-o2.length();
                return i;
            });
        // 2 添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");
        // 3 打印集合
        System.out.println(ts);
    }
}
