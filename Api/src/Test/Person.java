package Test;

public class Person {
    private String name;
    private int age;
    private double stature;


    public Person() {
    }

    public Person(String name, int age, double stature) {
        this.name = name;
        this.age = age;
        this.stature = stature;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return stature
     */
    public double getStature() {
        return stature;
    }

    /**
     * 设置
     * @param stature
     */
    public void setStature(double stature) {
        this.stature = stature;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + ", stature = " + stature + "}";
    }
}
