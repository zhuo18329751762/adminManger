package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Demo6 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式
        // 1 创建Map集合对象
        Map<String,String> m=new HashMap<>();
        // 2 添加元素
        m.put("鲁迅","这句话是我说的");
        m.put("曹操","不可能绝对不可能");
        m.put("刘备","接着奏乐接着舞");
        m.put("柯镇恶","看我眼色行事");
        // 3 Map的第二种遍历方式
        //通过键值对对象进行遍历
        //3.1 通过一个方法获取所有的键值对对象，返回一个Set对象
        Set<Map.Entry<String,String>> entries=m.entrySet();
        //3.2 遍历entries这个集合，去得到里面每一个键值对对象
        //增强for遍历
//        for (Map.Entry<String, String> entry : entries) {
//            //3.3 利用entry调用get方法获取键和值
//            String key=entry.getKey();
//            String value=entry.getValue();
//            System.out.println(key+"="+value);
//        }
        //迭代器遍历
//        Iterator<Map.Entry<String,String>> it=entries.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        //Lambda表达式遍历
        entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> stringStringEntry) {
                String key=stringStringEntry.getKey();
                String value=stringStringEntry.getValue();
                System.out.println(key+"="+value);
            }
        });

    }
}
