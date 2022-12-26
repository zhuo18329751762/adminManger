package polymorphismTest.Demo1;

public class Cat extends animal{


    public Cat() {
    }

    public Cat(int age, String colour) {
        super(age, colour);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColour()+"颜色的猫眯着眼睛侧着头吃"+something);
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
