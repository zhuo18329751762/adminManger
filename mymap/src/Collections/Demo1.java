package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        //addAll 批量添加元素
        // 1 创建集合对象
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"abc","abc","a5c","adc","abe","ubc","abg","qbc");
        System.out.println(list);
        // 2 shuffle 打乱集合元素的顺序
        Collections.shuffle(list);
        System.out.println(list);
        // 3 sort 排序
        Collections.sort(list);
        System.out.println(list);
    }
}
