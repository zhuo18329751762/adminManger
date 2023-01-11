package IntegerDemo;

public class IntegerDemo4 {
    public static void main(String[] args) {
        // 1 把整数转成二进制十六进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);
        // 2 把整数转成八进制
        String str2=Integer.toOctalString(100);
        System.out.println(str2);
        // 3 把整数转成十六进制
        String str3 = Integer.toHexString(100);
        System.out.println(str3);
        // 4 把字符串类型的整数转成int类型的整数
        //强制型语言：每种数据在JAVA中都有各自的数据类型
        //在计算时，不是同一种数据结构，是不能直接计算的
        int i = Integer.parseInt("123");
        System.out.println(i);
        System.out.println(i+1);
        //在类型转化时，括号里必须只能是数字，不能是其他，否则会报错
        //八种包装类中，除了Character都有对应的pricexxx的方法，进行类型转换

    }
}
