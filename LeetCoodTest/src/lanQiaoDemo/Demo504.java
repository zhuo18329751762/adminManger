package lanQiaoDemo;

import java.util.*;

public class Demo504 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String s = scan.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int max=0;
        char c=' ';
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Integer value = entry.getValue();
            if(value>max){
                max=value;
                c=entry.getKey();
            }
        }
        System.out.println(c);
        System.out.println(max);
        scan.close();
    }
}
