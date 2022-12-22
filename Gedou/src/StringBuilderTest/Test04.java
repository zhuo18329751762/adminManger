package StringBuilderTest;

import java.util.Random;
public class Test04 {
    public static void main(String[] args) {
        //生成验证码
        //4位大写或者小写字母加一位数字    数字在任意位置
        char[] alphabe={'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                'O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d',
                'e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
                'u','u','w','x','y','z',};
        int[] num={0,1,2,3,4,5,6,7,8,9};
        String yanZhengMa=getYanZhengMa(alphabe,num);
        System.out.println("验证码是:"+yanZhengMa);
    }
    public static String getYanZhengMa(char[] arr,int[] num){
        Random r=new Random();
        int j=r.nextInt(4);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if(i!=j){
                sb.append(arr[r.nextInt(arr.length)]);
            }else{
                sb.append(r.nextInt(num.length));
            }
        }
        return sb.toString();
    }
}
