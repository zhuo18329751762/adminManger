package a02abstractdemo2;

public class Test {
    public static void main(String[] args) {
        dog d=new dog("大黄",5);
        System.out.println(d.getName()+", "+d.getAge());
        d.eat();
        d.drink();
    }
}
