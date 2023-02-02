package exceptionDemo;

public class Demo7 {
    public static void main(String[] args) {
       // 4 如果try中遇到了问题，那么try下面的其他代码还会执行吗
        //下面的代码不会执行了，直接跳转到catch当中，执行catch里面的语句体
        //但是如果没有对应的catch与之对应，那么还是会交给虚拟机进行处理
        int[] arr={1,2,3,4,5,6};
        try{
            System.out.println(arr[10]);
            System.out.println("执行了吗");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }
        System.out.println("执行结束");

    }
}
