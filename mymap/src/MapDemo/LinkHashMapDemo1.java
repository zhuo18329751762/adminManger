package MapDemo;

import java.util.LinkedHashMap;

public class LinkHashMapDemo1 {
    public static void main(String[] args) {
        //由键决定
        //有序，不重复，无索引
        //可以保证存取顺序一致
        // 1 创建集合
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        // 2 添加元素
        lhm.put("c",123);
        lhm.put("a",111);
        lhm.put("c",456);
        lhm.put("d",789);
        // 3 打印集合
        System.out.println(lhm);
    }
}
