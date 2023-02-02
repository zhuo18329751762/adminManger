package exceptionDemo;

public class girl {
    private String name;
    private int age;

    public girl() {
    }

    public girl(String name, int age) {
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
        int len = name.length();
        if(len<3||len>10){
            throw new NameFormatException(name+"格式有误，长度应该为：3~10");
        }
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
        if(age<18||age>40){
            throw new AgeOutOfBoundsException(age+"超出范围");
        }
        this.age = age;
    }

    public String toString() {
        return "girl{name = " + name + ", age = " + age + "}";
    }
}
