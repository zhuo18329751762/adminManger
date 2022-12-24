package zhuoyang.staticDemo1;

public class StudentTest {
    public static void main(String[] args) {
        //静态变量是随着累的加载而加载的，优先于对象出现的
        // 1 创建第一个学生对象
        Student.techerName="老六";
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setGender("男");
        //s1.techerName="老六";
        s1.study();
        s1.show();
        // 2 创建第二个学生对象
        Student s2=new Student();
        s2.setName("李四");
        s2.setAge(18);
        s2.setGender("男");
        s2.study();
        s2.show();
    }

}
