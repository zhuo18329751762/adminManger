package Immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        /*
        创建Map的不可变集合，键值对的数量超过10个
         */
        // 1 创建一个普通的Map集合
        HashMap<String,String> hm=new HashMap<>();
        hm.put("张三","北京");
        hm.put("李四","北京");
        hm.put("王五","北京");
        hm.put("赵六","北京");
        hm.put("刘七","北京");
        hm.put("重八","北京");
        hm.put("九九","北京");
        hm.put("十","北京");
        hm.put("十一","北京");
        hm.put("十二","北京");
        hm.put("十三","北京");
        // 2 利用上面的数据获取一个不可变的集合
//        //获取所有键值对对象
//        Set<Map.Entry<String, String>> entries = hm.entrySet();
//        //把entries变成数组
//        Map.Entry[] arr = entries.toArray(new Map.Entry[0]);
//        //toArray方法在底层会比较集合的长度和数组长度的两者之间的关系
//        //如果集合长度>数组的长度，此时会根据实际数据的个数，重新创建数组
//        //如果集合长度<=数组的长度,此时不会创建新的数组，而是直接用
//
//        //不可变的Map集合
//        Map map = Map.ofEntries(arr);
//        //不可修改
////        map.put("hsda","shiad");


        // 3 jdk10以后的新方法
        Map<String, String> map = Map.copyOf(hm);
        //map.put("hsda","shiad");
    }
}
