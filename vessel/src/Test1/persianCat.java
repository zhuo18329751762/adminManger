package Test1;

public class persianCat extends Cat{

    public persianCat(String name,int age) {
        this.setName(name);
        this.setAge(age);
    }


    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"岁的波斯猫，正在吃小饼干");
    }

    public String toString() {
        return "persianCat{}";
    }
}
