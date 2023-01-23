package Test;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test05 {
    public static void main(String[] args) {
        //定义一个Map集合，键用来表示省份名称province,值表示市,但是市有多个
        //遍历格式:
        //江苏省=南京市，扬州市，苏州市，无锡市，常州市
        ArrayList<String> city1=new ArrayList<>();
        Collections.addAll(city1,"南京市","扬州市","苏州市","无锡市","常州市");
        ArrayList<String> city2=new ArrayList<>();
        Collections.addAll(city2,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        ArrayList<String> city3=new ArrayList<>();
        Collections.addAll(city3,"石家庄市","唐山市","邢台市","保定市","张家口市");
        HashMap<String,ArrayList<String>> Sheng=new HashMap<>();
        Sheng.put("江苏省",city1);
        Sheng.put("湖北省",city2);
        Sheng.put("河北省",city3);
        Set<Map.Entry<String, ArrayList<String>>> entries = Sheng.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            //entry表示每一个键值对对象
            String key=entry.getKey();
            System.out.print(key+"=");
            StringJoiner sj=new StringJoiner(", ","","");
            for (int i = 0; i < entry.getValue().size(); i++) {
                String Value=entry.getValue().get(i);
                sj.add(Value);
            }
            System.out.println(sj);
        }
    }
}
