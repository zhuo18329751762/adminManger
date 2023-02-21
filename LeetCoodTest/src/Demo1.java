import java.util.*;

public class Demo1 {
        public static void main(String[] args) {
            String s="abcdsasd";
            int i = lengthOfLongestSubstring(s);
            System.out.println(i);
        }
        public static  int lengthOfLongestSubstring(String s) {
            int n=s.length(),Max=0;
            Map<Character,Integer> map=new HashMap<>();
            for(int end=0,start=0;end<n;end++){
                char c=s.charAt(end);
                if(map.containsKey(c)){
                    start=Math.max(map.get(c),start);
                }
                Max=Math.max(Max,end-start+1);
                map.put(c,end+1);
            }
            return Max;
        }
}
