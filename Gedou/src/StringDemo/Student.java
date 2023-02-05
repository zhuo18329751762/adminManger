package StringDemo;

public class Student {
    private String name;
    private String garde;
    private String school;
    private String age;
    private String sex;
    private String phone;

    public Student() {
    }

    public Student(String name, String garde, String school, String age, String sex, String phone) {
        this.name = name;
        this.garde = garde;
        this.school = school;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
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
     * @return garde
     */
    public String getGarde() {
        return garde;
    }

    /**
     * 设置
     * @param garde
     */
    public void setGarde(String garde) {
        this.garde = garde;
    }

    /**
     * 获取
     * @return school
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置
     * @param school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 获取
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "Student{name = " + name + ", garde = " + garde + ", school = " + school + ", age = " + age + ", sex = " + sex + ", phone = " + phone + "}";
    }
}
