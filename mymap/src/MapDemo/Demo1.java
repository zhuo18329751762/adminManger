package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        // 1 创建Map集合的对象
        Map<String,String> map=new HashMap<>();
        // 2 添加元素
        map.put("张三","李四");
        map.put("喜羊羊","美羊羊");
        map.put("刘备","孙尚香");
        // 删除操作
        //String result=map.remove("喜羊羊");

        //清空
        //map.clear();

        //判断是否包含
//        boolean flag = map.containsKey("张三");
//        System.out.println(flag);

        //判断值是否存在
//        boolean flag1 = map.containsValue("美羊羊");
//        System.out.println(flag1);

        //判空
//        boolean empty = map.isEmpty();
//        System.out.println(empty);

        //获取集合的长度
        int size = map.size();
        System.out.println(size);
        // 3 打印集合
        //System.out.println(result);
        System.out.println(map);
    }
}
