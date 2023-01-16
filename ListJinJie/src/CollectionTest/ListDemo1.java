package CollectionTest;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        // 1 创建一个集合
        List<String> list=new ArrayList<>();
        // 2 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //void add(int index,E element)  在此集合的指定位置插入指定的元素
        list.add(1,"111");
        //E remove(int index)  删除指定索引的元素，返回被删除的元素
        System.out.println(list.remove(0));
        //E set(int index,E element) 修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(1, "www"));
        //E get(int index) 返回指定索引的元素
        System.out.println(list.get(2));
        // 3 打印集合
        System.out.println(list);
    }
}
