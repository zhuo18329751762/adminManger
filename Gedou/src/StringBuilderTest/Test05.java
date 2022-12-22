package StringBuilderTest;

public class Test05 {
    public static void main(String[] args) {
        //给定两个以字符串形式表示的非负整数num1和num2,返回num1和num2的乘积，它们的乘积也表示为字符串形式
        String s1="16";//s1、s2必须只含有数字
        String s2="16";//s1、s2必须只含有数字
        String s3=StringProduct(s1,s2);
        System.out.println(s1+"*"+s2+"="+s3);
    }
    public static String StringProduct(String s1,String s2){
        int num1=0,num2=0;
        for (int i = 0; i < s1.length(); i++) {
            num1=s1.charAt(i)-48+num1*10;
        }
        for (int i = 0; i < s2.length(); i++) {
            num2=s2.charAt(i)-48+num2*10;
        }
        int num3= num1*num2;
        StringBuilder sb=new StringBuilder();
        while(num3>0){
            int g=num3%10;
            num3=num3/10;
            sb.append(g);
        }
        sb.reverse();//反转sb
        return sb.toString();
    }
}
