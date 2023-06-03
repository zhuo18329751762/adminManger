package Test.Test10_21;

public class Test {
    public static void main(String[] args) {
        Circle2D circle2D1=new Circle2D(1,1,1);
        Circle2D circle2D2=new Circle2D(2,2,2);
        //boolean contains = circle2D1.contains(0,1);
        boolean contains = circle2D1.overlaps(circle2D2);
        System.out.println(contains);
    }
}
