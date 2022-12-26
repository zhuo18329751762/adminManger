package a01abstractdemo1;

public class Student extends Person{

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

}
