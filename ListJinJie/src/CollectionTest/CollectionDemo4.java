package CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo4 {
    public static void main(String[] args) {
        //Lambda表达式遍历
        // 1 创建集合并添加元素
        Collection<String> coll=new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        // 2 利用匿名类的方式
//        coll.forEach(new Consumer<String>() {
//            @Override
//            //s依次表示集合中的每一个元素
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        // 3 lambda表达式
        coll.forEach((String s)-> System.out.println(s));
    }
}
