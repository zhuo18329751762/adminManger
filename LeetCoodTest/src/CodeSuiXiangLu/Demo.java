package CodeSuiXiangLu;


import java.util.UUID;

public class Demo {
    public static void main(String[] args) {
        //2进制 8进制
        int count=0;
        int num=0;
        while (count<23){
            num++;
            String er = Integer.toString(num, 2);
            String ba = Integer.toString(num, 8);
            int n1=0;
            int n2=0;
            for (int i = 0; i < er.length(); i++) {
                n1+=er.charAt(i)-48;
            }
            for (int i = 0; i < ba.length(); i++) {
                n2+=ba.charAt(i)-48;
            }
            if(n1!=0&&n2==n1){
                count++;
            }
        }
        System.out.println(num);
    }
}
