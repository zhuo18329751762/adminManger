import java.util.Arrays;

public class Demo14 {
    /*
    编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。
     */
    public static void main(String[] args) {
        String[] strs = {"ab","a"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        int min=strs[0].length();
        System.out.println(min);
        for (int i = 1; i < strs.length; i++) {
            if(strs[i].length()<min){
                min= strs[i].length();
            }
        }
        if(min==0){
            return "";
        }
        System.out.println(min);
        for (int i = 0; i < min; i++) {
            for (int j = 1; j < strs.length; j++) {
                System.out.println(strs[0].charAt(i)+"-------"+strs[j].charAt(i));
                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        System.out.println("测试");
        return strs[0].substring(0,min);
    }
}
