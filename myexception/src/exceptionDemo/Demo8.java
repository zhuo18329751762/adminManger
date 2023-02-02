package exceptionDemo;

public class Demo8 {
    public static void main(String[] args) {
        /*
        public String getMessage()  返回此throwable的详细消息字符串
        public String toString()    返回此可抛出的简短描述
        public void printStackTrace 把异常的错误信息输出在控制台
                                    仅仅是打印信息，不会停止程序运行
         */
        int[] arr={1,2,3,4,5,6};
//        try {
//            System.out.println(arr[10]);
//        } catch (ArrayIndexOutOfBoundsException e) {
////            String message = e.getMessage();
////            System.out.println(message);//Index 10 out of bounds for length 6
////            String s = e.toString();
////            System.out.println(s);//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6
//            e.printStackTrace();
//        }
//
//        System.out.println("执行结束");
        //正常的输出语句
        System.out.println(123);

        //错误的输出语句(而是用来打印错误信息)
        System.err.println(123);
    }
}
