package innercl.static1;

public class Outer {
//    int a=10;
//    static int b=20;
    //静态内部类
    static class Inner{
        public void show1(){
            System.out.println("非静态方法被调用了");
        }
        public static  void show2(){
            System.out.println("静态方法被调用了");
        }
    }
}
