package exceptionDemo;

public class Demo6 {
    public static void main(String[] args) {
        //3 如果try中遇到的问题没有被捕获，怎么执行
        //相当于try...catch中的代码白写了,最终会交给虚拟机进行处理

        int[] arr={1,2,3,4,5,6};
        try{
            System.out.println(arr[10]);
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }

        System.out.println("执行结束");
    }
}
