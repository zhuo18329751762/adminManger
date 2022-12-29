package com.innercl;
public class Test {
    public static void main(String[] args) {
        //内部类非私有时
        Outer.Inner oi=new Outer().new Inner();
        Outer o=new Outer();
        oi.show();

        //内部类私有时
//        Outer o=new Outer();
//        System.out.println(o.getInstance());
    }


}
