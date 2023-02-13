package myreflect4;

import java.io.IOException;

public class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    private String eat(String something) throws IOException,CloneNotSupportedException {
        System.out.println("在吃"+something);
        return "吃完了";
    }
    public void eat(String something,int a){
        System.out.println("在吃"+something);
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
    private void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
