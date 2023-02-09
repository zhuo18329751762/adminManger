package Test;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {
        /*
        Properties作为Map集合的操作
         */
        // 1 创建集合对象
        Properties prop=new Properties();
        // 2 添加数据
        //虽然我们可以往Properties当中添加任意的数据类型，但是一般只会往里面添加字符串类型的数据
        prop.put("aaa","bbb");
        prop.put("bbb","bbb");
        prop.put("ccc","bbb");
        prop.put("ddd","bbb");
        // 3 打印集合

//        Set<Object> keys = prop.keySet();
//        for (Object key : keys) {
//            Object o = prop.get(key);
//            System.out.println(key+"="+o);
//        }

//        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
//        for (Map.Entry<Object, Object> entry : entries) {
//            Object key = entry.getKey();
//            Object value = entry.getValue();
//            System.out.println(key+"="+value);
//        }

    }
}
