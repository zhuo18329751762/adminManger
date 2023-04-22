package leetCood50;

import java.util.ArrayList;
import java.util.List;

public class Demo22 {

    /*
    数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
     */

    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        System.out.println(list);
    }


    public static List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        if(n==0){
            return list;
        }
        helper(list,"",n,n);
        return list;
    }
    public static void helper(List<String> list,String s,int left,int right){
        if(left>right){
            return;
        }
        if(left==0&&right==0){
            list.add(s);
            return;
        }
        if(left>0){
            helper(list,s+"(",left-1,right);
        }
        if(right>0){
            helper(list,s+")",left,right-1);
        }
    }




//    public static void main(String[] args) {
//        System.out.println(generateParenthesis(3));
//    }
//
//
//
//
//    public static List<String> generateParenthesis(int n) {
//        //用链表解决问题
//        List<Character> list=new ArrayList<>();
//        List<String> list1=new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            StringBuffer sb=new StringBuffer();
//            //i表示一次性能存储的最多左括号
//            int j=0;//表示此时集合中的左括号数量
//            int count=0;//表示已经使用了几个括号
//            int len=0;//表示已经使用了几个括号
//            while (count<n){
//                while (list.size()<i) {
//                    list.add('(');
//                    sb.append("(");
//                    System.out.println("测试");
//                    len++;
//                }
//                list.remove(i-1);
//                sb.append(")");
//                len--;
//                count++;
//            }
//            list1.add(sb.toString());
//        }
//        return list1;
//    }
}
