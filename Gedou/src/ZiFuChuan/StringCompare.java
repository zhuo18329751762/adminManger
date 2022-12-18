package ZiFuChuan;

public class StringCompare {
    public static void main(String[] args) {
        //1 创建两个字符串对象
        String s1=new String("abc");
        String s2="abC";
        //2 ==号比较
        //基本数据类型比较的是数据值
        //引用数据类型 比较的是地址值
        //equals分大小写
        //equalsIgnoreCase不分大小写
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
