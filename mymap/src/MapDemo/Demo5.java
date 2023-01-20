package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Demo5 {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式
        // 1 创建Map集合对象
        Map<String,String> m=new HashMap<>();
        // 2 添加元素
        m.put("鲁迅","这句话是我说的");
        m.put("曹操","不可能绝对不可能");
        m.put("刘备","接着奏乐接着舞");
        m.put("柯镇恶","看我眼色行事");
        // 3 利用Lambda表达式进行遍历
        //forEach是按照第二种方式遍历，依次得到每一个键和值
        //在调用accept方法
        m.forEach(( key,  value)-> System.out.println(key+"="+value));
    }
}
