package leetCood150;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo139 {
    /*
    给你一个字符串 s 和一个字符串列表 wordDict 作为字典。请你判断是否可以利用字典中出现的单词拼接出 s 。

注意：不要求字典中出现的单词全部都使用，并且字典中的单词可以重复使用。
     */

    public static void main(String[] args) {

        List<String> wordDict = new ArrayList<>();
//        String s = "catsandog";
//        wordDict.add("cats");
//        wordDict.add("dog");
//        wordDict.add("sand");
//        wordDict.add("and");
//        wordDict.add("cat");

        String s="aaaaaaa";
        wordDict.add("aaaa");
        wordDict.add("aaa");
        System.out.println(wordBreak(s, wordDict));

    }
    public static boolean wordBreak(String s, List<String> wordDict) {
       boolean[] dp=new boolean[s.length()+1];
       dp[0]=true;
       for(int i=1;i<=s.length();i++){
           for(int j=0;j<i;j++){
               if(dp[j]&&wordDict.contains(s.substring(j,i))){
                   dp[i]=true;
                   break;
               }
           }
       }
       return dp[s.length()];
    }
}
