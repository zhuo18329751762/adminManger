import java.util.HashMap;

public class Demo3 {
    public static void main(String[] args) {
        /*
        给一个字符串，查找其中无重复的最大子串
         */
        String s="abcdsasd";
        int max = getMaxString(s);
        System.out.println(max);
    }
    public static int getMaxString(String s){
        int Max=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int end=0,start=0; end < s.length(); end++) {
            char c=s.charAt(end);
            if(hm.containsKey(c)){
                start=Math.max(start,hm.get(c));
            }
            Max=Math.max(Max,end-start+1);
            hm.put(c,end+1);
        }
        return Max;
    }
}
