package MapDemo;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        /*
        字符串"aababcabcdabcde"
        请统计字符串中每一个字符出现的此数，并按照以下格式输出
        输出结果
        a(5) b(4) c(3) d(2) e(1)
         */
        //利用HashMap集合进行统计  没有要求对结果进行排序，默认使用HashMap
        //如果题目中要求对结果进行排序，请使用TreeMap

        //键：表示要统计的内容
        //值：表示次数
        // 1 定义字符串
        String s="aababcabcdabcde";
        // 创建集合TreeMap集合
        TreeMap<Character,Integer> tm=new TreeMap<>();
        // 2 遍历每一个字符
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(tm.containsKey(c)){
                //存在
                int count=tm.get(c);
                count++;
                tm.put(c,count);
            }else{
                //不存在
                tm.put(c,1);
            }
        }
        System.out.println(tm);
        StringBuilder sb=new StringBuilder();
        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character character, Integer integer) {
                sb.append(character).append("(").append(integer).append(") ");
            }
        });
        System.out.println(sb);
    }
}
