package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        //使用迭代器的形式遍历map集合
        // 1 创建Map集合的对象
        Map<String,String> map=new HashMap<>();

        // 2 添加元素
        map.put("张三","李四");
        map.put("喜羊羊","美羊羊");
        map.put("刘备","孙尚香");
        // 3 通过键找值
        //3.1获取所有的键，把这些键放到一个单列集合当中
        Set<String> keys = map.keySet();
        //3.2遍历单列集合，得到每一个键
       Iterator<String> it=keys.iterator();
       while (it.hasNext()){
           String key=it.next();
           System.out.println(key+"="+map.get(key));
       }
    }
}
