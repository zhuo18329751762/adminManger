package leetCood50;

public class Demo5 {
    /*
    给你一个字符串 s，找到 s 中最长的回文子串。

如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
     */
    public static void main(String[] args) {
        String s="aacabdkacaa";
        String s1 = getHuiWenStr(s);
        System.out.println(s1);
    }
    //中心扩散法
    public  static String getHuiWenStr(String s){
       String res=s.substring(0,1);
        for (int i = 0; i < s.length(); i++) {
            res=extendFromCenter(s,i,i,res);
            res=extendFromCenter(s,i,i+1,res);
        }
        return res;
    }
    public static String extendFromCenter(String s,int left,int right,String res){
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        if(right-left-1>s.length()){
              res=s.substring(left,right-1);
        }
        return res;
    }
    public static  String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int strLen = s.length();
        int maxStart = 0;  //最长回文串的起点
        int maxEnd = 0;    //最长回文串的终点
        int maxLen = 1;  //最长回文串的长度

        boolean[][] dp = new boolean[strLen][strLen];
        for (int r = 1; r < strLen; r++) {
            for (int l = 0; l < r; l++) {
                if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > maxLen) {
                        maxLen = r - l + 1;
                        maxStart = l;
                        maxEnd = r;
                    }
                }
            }

        }
        return s.substring(maxStart, maxEnd + 1);

    }

}
