package Regex;

public class Demo5 {
    public static void main(String[] args) {
        String s="张三fjhsdjf李四cihsdb4hsdbc王五";
        //方法在底层也会创建文本解析器的对象
        //然后从头开始去读字符串的内容，只要满足，就用第二个参数替换
        String s1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(s1);

        //分割
        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

