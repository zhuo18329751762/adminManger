package polymorphismTest.Demo1;

public class Person {
    private String name;
    private int age;
    public void keepPet(Dog dog,String something){
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+dog.getColour()+"颜色的"
                +dog.getAge()+"岁的狗");
        dog.eat(something);
    }
    public void keepPet(Cat cat,String something){
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+cat.getColour()+"颜色的"
                +cat.getAge()+"岁的猫");
        cat.eat(something);
    }
    public void keepPet(animal a,String something){
        if(a instanceof Dog){
            Dog d=(Dog)a;
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+d.getColour()+"颜色的"
                    +d.getAge()+"岁的狗");
        }
        else if(a instanceof Cat){
            Cat c=(Cat)a;
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+c.getColour()+"颜色的"
                    +c.getAge()+"岁的猫");
        }else {
            System.out.println("没有这种动物");
        }
    }


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
