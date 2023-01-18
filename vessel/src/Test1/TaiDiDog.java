package Test1;

public class TaiDiDog extends Dog{
    public TaiDiDog(String name,int age) {
        this.setName(name);
        this.setAge(age);
    }
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的泰迪，正在吃骨头，边吃边蹭");
    }
}
