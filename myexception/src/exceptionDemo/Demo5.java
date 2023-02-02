package exceptionDemo;

public class Demo5 {
    public static void main(String[] args) {
        //2 如果try中可能遇到多个问题，怎么执行
        //会写多个catch与之对应
        //如果我们捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面
        //JDK7以后，我们可以在catch中同时捕获多个异常，中间用|隔开
        //表示如果出现A异常或者B异常，采用同一种处理方案


        int[] arr={1,2,3,4,5,6};
        try{
            System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
            System.out.println(2/0);//ArithmeticException
            String s=null;
            System.out.println(s.equals("abc"));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (Exception e){

        }

        System.out.println("执行结束");
    }
}
