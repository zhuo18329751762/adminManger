package IntegerDemo;

public class IntegerDemo3 {
    public static void main(String[] args) {
        //在JDK5的时候提出了一个机制，自动装箱和自动拆箱
        //自动拆箱：把基本数据类型会自动的变成其对应的包装类
        //自动拆箱：把包装类自动的变成其对象的基本数据类型
        //在底层，此时还会调用静态方法valueof得到一个Integer对象
//        Integer i1=10;
//        Integer i2=new Integer(10);
//        //自动拆箱的操作
//        int i=i2;
        //在JDK5以后，int的Integer可以看成是同一个东西，因为在内部可以自动转换
    }
}
