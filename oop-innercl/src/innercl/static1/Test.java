package innercl.static1;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi=new Outer.Inner();
        oi.show1();
        //两种调用方式
        oi.show2();
        Outer.Inner.show2();
    }


}
