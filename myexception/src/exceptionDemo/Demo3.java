package exceptionDemo;

public class Demo3 {
//    try{
//        可能异常的代码
//    }catch(异常类名 变量名){
//        异常的处理代码
//    }
    //可以让程序不中断，继续执行下去
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6};


    try{
        System.out.println(arr[10]);
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("索引异常");
    }


    System.out.println("执行结束");

}
}
