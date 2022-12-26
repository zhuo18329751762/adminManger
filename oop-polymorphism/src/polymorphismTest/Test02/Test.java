package polymorphismTest.Test02;

//多态不能调用子类特有的方法 如果需要调用 需要进行强转 但是如果类型转换不一致会报错
public class Test {
    public static void main(String[] args) {
        //多态的弊端 不能调用子类的特有功能
        //因为编译看左边 运行看右边
        animal a=new dog();
        a.eat();
        //a.lookHpme();报错 因为父类没有这个方法

        //解决方案
        //变回子类就可以了
        //cat c=(cat)a;
        //c.catchMouse();  转换异常 因为a创建时就是dog类型
//        if(a instanceof dog){
//            dog d=(dog)a;
//            d.lookHome();
//        }else if(a instanceof cat){
//            cat c=(cat)a;
//            c.catchMouse();
//        }else{
//            System.out.println("没有这个类型，无法转换");
//        }
        //新特性  jdk14以后
//        if(a instanceof dog d){
//            d.lookHome();
//        }else if(a instanceof cat c){
//            c.catchMouse();
//        }else{
//            System.out.println("没有这个类型，无法转换");
//        }
    }
}
class animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}
class dog extends animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
class cat extends animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}