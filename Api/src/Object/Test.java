package Object;

public class Test {
    public static void main(String[] args) {
        String s="abc";
        //字符串中的equals 先判断字符串是不是自己
        //然后判断是不是字符串
        StringBuilder sb=new StringBuilder("abc");

        System.out.println(s.equals(sb));
        System.out.println(sb.equals(s));
        //StringBuilder中没有重写equal函数
        //所以使用的是Object中的equals函数

    }
}
