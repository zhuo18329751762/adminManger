package exceptionDemo;

public class Demo9 {
    public static void main(String[] args) {
        /*
        throws:写在方法定义处，表示声明一个异常。告诉调用者，使用本方法可能会有哪些异常
        throw:写在方法内，结束方法。手动抛出异常对象，交给调用者，方法下面的代码就不再执行了

        需求：
        定义一个方法求数组的最大值
         */
        int[] arr=null;
        int max=0;
        try{
            max=getMax(arr);
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界异常");
        }
        System.out.println(max);



    }
    public static int getMax(int[] arr){
        if(arr==null){
            //手动创建一个异常对象，并把这个异常对象交给方法的调用者处理
            //此时方法就会结束，下面的代码就不会再执行了
            throw new NullPointerException();
        }
        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException();
        }
        int Max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        return Max;
    }

}
