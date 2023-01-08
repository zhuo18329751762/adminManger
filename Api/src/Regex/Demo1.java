package Regex;

public class Demo1 {
    public static void main(String[] args) {
        /*
        效验qq号
        规则：6位及20位之间，0不能在开头，必须全部是数字
         */
        String qq="442345689";
//        boolean flag=checkQQ(qq);
//        System.out.println(flag);
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
        System.out.println("\"");

    }
    public static boolean checkQQ(String qq){
        if(qq.length()<6||qq.length()>20) {
            System.out.println("位数不在6~20之间");
            return false;
        }
            if(qq.charAt(0)=='0'){
                System.out.println("首位不能是0");
                return false;
            }
            for (int i = 0; i < qq.length(); i++) {
                if(qq.charAt(i)<48||qq.charAt(i)>57){
                    System.out.println("必须全部是数字");
                return false;
                }
            }
        return true;
    }
}
