package polymorphismTest.Demo1;

public class animal {
    private int age;//年龄
    private String colour;//颜色
    public void eat(String something){
        System.out.println("狗吃"+something);
    }

    public animal() {
    }

    public animal(int age, String colour) {
        this.age = age;
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
