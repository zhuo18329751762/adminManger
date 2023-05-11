package leetCood50;

import java.util.*;
import java.util.stream.Collectors;

public class Demo49 {
    /*
    给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。
     */
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strs);
        System.out.println(lists);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map=new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s=strs[i];
            //将字符串装化为字符串数组
            char[] cs=new char[s.length()];
            for (int j = 0; j < s.length(); j++) {
                cs[j]=s.charAt(j);
            }
            //排序
            Arrays.sort(cs);
            String key=String.valueOf(cs);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
