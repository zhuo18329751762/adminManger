package leetCood150;

public class Demo125 {
    /*
    如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。
    则可以认为该短语是一个 回文串 。

字母和数字都属于字母数字字符。

给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
    public static boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if((c>='a'&&c<='z')||(c>='0'&&c<='9')){
                sb.append(c);
                continue;
            }
            if(c>='A'&&c<='Z'){
                c= (char) (c+32);
                sb.append(c);
            }
        }
        String string = sb.toString();
        String reverse = sb.reverse().toString();
        return string.equals(reverse);
    }
}
