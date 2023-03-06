import java.lang.invoke.ConstantCallSite;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Demo8 {
    /*
    请你来实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。

函数 myAtoi(string s) 的算法如下：

读入字符串并丢弃无用的前导空格
检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
如果整数数超过 32 位有符号整数范围 [−231,  231 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −231 的整数应该被固定为 −231 ，大于 231 − 1 的整数应该被固定为 231 − 1 。
返回整数作为最终结果。
     */
    public static void main(String[] args) {
        String s="1";
        int num = myAtoi(s);
        System.out.println(num);
    }
    public static int myAtoi(String s) {
        ArrayList<Character> list=new ArrayList<>();
        long  n=0;
        int i=0;
        boolean flag=true;
        if(s.length()==0){
            return 0;
        }
        while(i < s.length()) {
            if(s.charAt(i) == ' '){
                i++;
            }else if(s.charAt(i)=='-'||s.charAt(i)=='+'||(s.charAt(i)>=48&&s.charAt(i)<=57)){
                if(s.charAt(i+1)=='-'||s.charAt(i+1)=='+'){
                    return 0;
                }
                break;
            }else{
                return 0;
            }
        }
        if(s.length()==i){
            return 0;
        }
            if (s.charAt(i) == '-') {
                list.add('-');
                i++;
            } else if (s.charAt(i) == '+') {
                list.add('+');
                i++;
            } else {
                list.add('+');
            }
        for (int j = i; j < s.length(); j++) {
            if(s.charAt(j)>=48&&s.charAt(j)<=57){
                list.add(s.charAt(j));
            }else{
                break;
            }
        }
        i=1;
        while (list.get(i)==48){
            System.out.println("测试");
            list.remove(i);
        }
        System.out.println(list);
        if(list.size()>9){
            if(list.get(0)=='-'){
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
        for (int j = 1; j < list.size(); j++) {
            n=n*10+list.get(j)-48;
        }
        if(list.get(0)=='-'){
            n=0-n;
            return (int)n==n?(int)n:Integer.MIN_VALUE;
        }
        return (int)n==n?(int)n:Integer.MAX_VALUE;
    }

    public static int myAtoi2(String s) {
        //最大int是 2147483647 最小int是 -2147483648
        int result = 0;
        int len = s.length(), index = 0;
        while(index < len) {
            if(s.charAt(index) == ' ') index++;
            else break;
        }
        int symbol = 1;
        if(index < len) {
            if(s.charAt(index) == '-') {
                symbol *= -1;
                index++;
            } else if(s.charAt(index) == '+') {
                index++;
            }
        }
        while(index < len) {
            int temp = s.charAt(index) - '0';
            if(temp >= 0 && temp <= 9) {
                if(result == 214748364) {
                    if(symbol == 1){
                        if(temp < 7) result = result * 10 + temp;
                        else return Integer.MAX_VALUE;
                    } else {
                        if(temp < 8) result = result * 10 + temp;
                        else return Integer.MIN_VALUE;
                    }
                } else if(result > 214748364) {
                    if(symbol == 1){
                        return Integer.MAX_VALUE;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    result = result * 10 + temp;
                }
                index++;
            } else {
                break;
            }
        }
        return result * symbol;
    }
}
