package Test1;

public class LiHuaCat extends Cat{
    public LiHuaCat(String name,int age) {
        this.setName(name);
        this.setAge(age);
    }
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的狸花猫，正在吃鱼");
    }
}
