package CodeSuiXiangLu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo7 {
    public static void main(String[] args) {
        //a, e, i, o, u
        Scanner scanner=new Scanner(System.in);
        String str = scanner.next();
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        char a=' ';
        for (int i = 0; i < str.length(); i++) {
            if(set.contains(str.charAt(i))){
                a=str.charAt(i);
            }
        }
        System.out.println(a);
    }
}
