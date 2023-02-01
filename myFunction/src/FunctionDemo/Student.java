package FunctionDemo;

public class Student {
    private String name;
    private  int age;

    public Student() {
    }
    public Student(String str){
        String[] arr = str.split(",");
        name=arr[0];
        age=Integer.parseInt(arr[1]);
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
        return name+"-"+age;
    }
}
