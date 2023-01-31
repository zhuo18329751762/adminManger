package Immutable;

import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        /*
        创建Map的不可变集合
            1 键是不能重复的
            2 Map里面的of方法，参数是有上限的，最多只能传递20个参数，10个键值对
         */
        Map<String, String> map = Map.of("张三", "南京", "李四", "北京", "王五", "东京");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println("key="+key+"value="+value);
        }
        System.out.println("-------------------------------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key="+key+"value="+value);

        }
    }
}
