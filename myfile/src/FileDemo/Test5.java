package FileDemo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test5 {
    //统计一个文件夹中每种文件的个数并打印(考虑子文件)
    //格式如下:
    //txt:3个
    //doc:4个
    //jpg:6个
    public static void main(String[] args) {
        File f=new File("E://");
        Map<String, Integer> map = print(f);
        System.out.println(map);
    }
    public static Map<String,Integer> print(File file) {
        //定义集合
        HashMap<String, Integer> hm = new HashMap<>();
        /*
        统计一个文件夹中每种文件的个数
         */
        File[] files = file.listFiles();
        if(files!=null) {
            for (File f : files) {
                if (f.isFile()) {
                    //是文件
                    String[] name = f.getName().split("\\.");
                    if (name.length >= 2) {
                        String endName = name[name.length - 1];
                        if (hm.containsKey(endName)) {
                            //存在
                            Integer count = hm.get(endName);
                            count++;
                            hm.put(endName, count);
                        } else {
                            //不存在
                            hm.put(endName, 1);
                        }
                    }
                } else {
                    //子文件中的数据
                    Map<String, Integer> sonMap = print(f);
                    //遍历
                    Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                    for (Map.Entry<String, Integer> entry : entries) {
                        String key = entry.getKey();
                        Integer value = entry.getValue();
                        if (hm.containsKey(key)) {
                            //存在
                            Integer i = hm.get(key);
                            hm.put(key, value + i);
                        } else {
                            //不存在
                            hm.put(key, value);
                        }
                    }
                }
            }
        }
        return hm;
    }
    }
