package leetCood50;

public class Demo28 {

    /*
    给你两个字符串haystack 和 needle ，
    请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
    如果needle 不是 haystack 的一部分，则返回 -1 。

     */

    public static void main(String[] args) {
//        String haystack = "leetcode";
//        String needle = "leeto";
//        String haystack = "sadbutsad";
//        String needle = "sad";
//        String haystack = "hello";
//        String needle = "ll";
        String haystack = "mississippi";
        String needle = "issip";
        int i = strStr(haystack, needle);
        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {
        //表示此时匹配到的needle索引
        int j=0;
        int left=0;
        int right=0;
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i)==needle.charAt(j)){
                left=i;
                while(haystack.charAt(i)==needle.charAt(j)&&j<needle.length()&&i<haystack.length()){
                    i++;
                    j++;
                    right=j+left;
                    if(i==haystack.length()||j==needle.length()){
                        break;
                    }
                }
                if((right-left)==needle.length()){
                    //此时已经找到相同的字符串
                    return left;
                }else{
                    i=left;
                    j=0;
                }
            }
        }
        return -1;
    }
}
