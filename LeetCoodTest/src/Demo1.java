import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class Demo1 {
        public static void main(String[] args) {
            String s="dvdf";
            int i = lengthOfLongestSubstring(s);
            System.out.println(i);
        }
        public static  int lengthOfLongestSubstring(String s) {
            HashSet<Character> ha=new HashSet<>();
            ArrayList<Integer> list=new ArrayList<>();
            list.add(0);
            for (int i = 0; i < s.length(); i++) {
                if(ha.contains(s.charAt(i))){
                    System.out.println(i);
                    list.add(i);
                    ha.clear();
                    ha.add(s.charAt(i));
                }else{
                    ha.add(s.charAt(i));
                }
            }
            list.add(s.length());
            System.out.println(list);
            int max = getMax(list);
            return max;
        }
        public static int getMax(ArrayList<Integer> list){
            int max=0;
            for (int i = 0; i < list.size()-1; i++) {
                int num=list.get(i+1)-list.get(i);
                if(num>max){
                    max=num;
                }
            }
            return max;
        }
}
