package SetDemo;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        // this 表示当前要添加的元素
        // o 表示红黑树中存在的元素
        //指定排序规则
//        要求按照学生年龄进行排序
//        同年龄按照姓名字母排序(暂不考虑中文)
//        同姓名，同年龄认为是同一个人
        //只看年龄
        System.out.println("this "+this);
        System.out.println("0 "+o);
        int result=this.getAge()-o.getAge();
        return result;
        //返回值
        //负数 表示当前要添加的元素是小的，放左边
        //正数 表示当前要添加的元素是大的，放右边
    }
}
