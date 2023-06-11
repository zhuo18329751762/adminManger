package Test.Test13_11;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon=new Octagon(5);
        System.out.println(octagon.getArea());
        System.out.println(octagon.getPerimeter());
        Octagon clone = (Octagon)octagon.clone();
        int i = clone.compareTo(octagon);
        System.out.println(i);
    }

}
