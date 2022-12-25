package extendsTest.Test02;

public class SharPei extends dog{
    @Override
    public void eat(){
        super.eat();
        System.out.println("狗啃骨头");
    }
}
