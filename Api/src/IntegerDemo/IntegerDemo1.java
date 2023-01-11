package IntegerDemo;

public class IntegerDemo1 {
    public static void main(String[] args) {
//        // 1 利用构造方法获取Integer的对象(JDK5以前的方式)
//        Integer i1=new Integer(1);
//        Integer i2=new Integer("1");
//        System.out.println(i1);
//        System.out.println(i2);
//
//        // 2 利用静态方法获取Integer的对象(JDK5以前的方式)
//        Integer i3 = Integer.valueOf(133);
//        Integer i4 = Integer.valueOf("123");
//        Integer i5 = Integer.valueOf("123",8);
//        System.out.println(i3);
//        System.out.println(i4);
//        System.out.println(i5);
        //3 这两种方式获取对象的区别
        Integer i6=Integer.valueOf(127);
        Integer i7=Integer.valueOf(127);
        System.out.println(i6==i7);//true

        //[-128,128)都不会创建新对象，会使用底层提前创建好的,不包含128
        Integer i8=Integer.valueOf(128);
        Integer i9=Integer.valueOf(128);
        System.out.println(i8==i9);//false

        Integer i10=new Integer(127);
        Integer i11=new Integer(127);
        System.out.println(i10==i11);

        Integer i12=new Integer(128);
        Integer i13=new Integer(128);
        System.out.println(i12==i13);

    }
}
