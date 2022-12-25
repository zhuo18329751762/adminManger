package polymorphismTest.Test01;

public class Test {
    public static void main(String[] args) {
        //创建对象 并调用register方法
        Student s=new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t=new Teacher();
        t.setName("李四");
        t.setAge(32);

        Administrator a=new Administrator();
        a.setName("王五");
        a.setAge(26);
        register(s);
        register(t);
        register(a);
    }

    //这个方法 既能接收老师，又能接收学生，还能接收管理员
    public static void register(Person p){
        p.show();
    }
}
