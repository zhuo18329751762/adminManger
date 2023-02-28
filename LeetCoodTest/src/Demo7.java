public class Demo7 {
    /*
    给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。

如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。

假设环境不允许存储 64 位整数（有符号或无符号）。
*/
    public static void main(String[] args) {
        int a=1463847412;
        int reverse = reverse(a);
        System.out.println(reverse);
    }
    public static int reverse(int x) {
            String str = Integer.toString(x);
            StringBuffer sb = new StringBuffer();
            if (str.charAt(0) == '-') {
                sb.append('-');
                for (int i = str.length() - 1; i > 0; i--) {
                    sb.append(str.charAt(i));
                }

            } else {
                for (int i = str.length() - 1; i >= 0; i--) {
                    sb.append(str.charAt(i));
                }
            }
            //反转后的数据处理
        if (!(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE-1)){
            return 0;
        }
        boolean flag = judge(sb.toString());
        if(flag==false){
            return 0;
        }
        int num = Integer.parseInt(sb.toString());
            return num;
    }
    public static boolean judge(String str){
        String Max=Integer.toString(Integer.MAX_VALUE);
        String Min=Integer.toString(Integer.MIN_VALUE);
        if(str.charAt(0)=='-'){
            if(str.length()>Min.length()){
                return false;
            }
            if(str.length()<Min.length()){
                return true;
            }
            for (int i = 1; i < str.length(); i++) {
                if(str.charAt(i)>Min.charAt(i)){
                    return false;
                }
                if(str.charAt(i)<Min.charAt(i)){
                    return true;
                }
            }

            return true;
        }else{
            if(str.length()>Max.length()){
                return false;
            }
            if(str.length()<Max.length()){
                return true;
            }
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i)+" ");
                System.out.println(Max.charAt(i));
                if(str.charAt(i)>Max.charAt(i)){
                    return false;
                }
                if(str.charAt(i)<Max.charAt(i)){
                    return true;
                }
            }
            return true;
        }
    }
    //力扣官方答案
    public static int reverse2(int x){
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
    }
