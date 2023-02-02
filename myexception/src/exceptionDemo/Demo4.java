package exceptionDemo;

public class Demo4 {
    public static void main(String[] args) {
        /*
        自己处理（捕获异常）灵魂四问

        1 如果try中没有遇到问题，怎么执行
            会执行try中的代码，不会执行catch中的代码






         */
        int[] arr={1,2,3,4,5,6};
        try{
            System.out.println(arr[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }

        System.out.println("执行结束");
    }
}
