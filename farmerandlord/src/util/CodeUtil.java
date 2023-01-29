package util;

import java.util.Random;

public class CodeUtil {
    public static String getCode(){
                char[] alphabe={'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                'O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d',
                'e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
                'u','u','w','x','y','z',};
               int[] num={0,1,2,3,4,5,6,7,8,9};
        Random r=new Random();
        int j=r.nextInt(4);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if(i!=j){
                sb.append(alphabe[r.nextInt(alphabe.length)]);
            }else{
                sb.append(r.nextInt(num.length));
            }
        }
        return sb.toString();
    }
}
