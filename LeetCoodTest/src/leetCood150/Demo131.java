package leetCood150;

import java.util.ArrayList;
import java.util.List;

public class Demo131 {
    /*
    给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。

回文串 是正着读和反着读都一样的字符串。
     */
    public static void main(String[] args) {
        String s="aab";
        System.out.println(partition(s));
    }
    static List<List<String>> list=new ArrayList<>();
    static List<String> stringList=new ArrayList<>();
    public static List<List<String>> partition(String s) {
        dfs(s,0);
        return list;
    }
    public static void dfs(String s,int index){
        if(index==s.length()){
            list.add(new ArrayList<>(stringList));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            String str=s.substring(index,i+1);
            if(isPartition(str)){
                stringList.add(str);
            }else{
                continue;
            }
            dfs(s,i+1);
            stringList.remove(stringList.size()-1);
        }
    }
    public static boolean isPartition(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
