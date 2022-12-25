package extendsTest.Test01;

public class Lang extends animal{
    String name="张三";
    @Override
    public void eat(){
        System.out.println("吃肉");
        drink();
        System.out.println(super.name);
    }
}
