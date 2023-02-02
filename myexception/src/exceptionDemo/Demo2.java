package exceptionDemo;

public class Demo2 {
    public static void main(String[] args) {
        /*
        JVM默认的处理异常方法
        1：把异常的名称，异常的原因及异常出现的位置等信息输出在了控制台
        2：程序此时会停止执行，异常下面的代码不会在执行
         */
        System.out.println("1");
        System.out.println(2/0);
        System.out.println("2");
        System.out.println("3");
    }
}
