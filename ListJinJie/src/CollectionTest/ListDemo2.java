package CollectionTest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        //创建集合并添加元素
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        // 1 迭代器遍历
//        Iterator<String> it=list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        // 2 增强for遍历
//        for (String s : list) {
//            System.out.println(s);
//        }

        // 3 Lambda
//        list.forEach( s->  System.out.println(s) );

        // 4 普通for遍历
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        // 5 列表迭代器
        ListIterator<String> it= list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
            it.previous();
        }

    }
}
