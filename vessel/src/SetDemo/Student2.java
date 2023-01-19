package SetDemo;

public class Student2 implements Comparable<Student2>{
    private String name;
    private int age;
    private int yuWen;
    private int shuXue;
    private int yingyu;

    public Student2() {
    }

    public Student2(String name, int age, int yiWen, int shuXue, int yingyu) {
        this.name = name;
        this.age = age;
        this.yuWen = yiWen;
        this.shuXue = shuXue;
        this.yingyu = yingyu;
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
     * @return yiWen
     */
    public int getYuWen() {
        return yuWen;
    }

    /**
     * 设置
     * @param yuWen
     */
    public void setYuWen(int yuWen) {
        this.yuWen = yuWen;
    }

    /**
     * 获取
     * @return shuXue
     */
    public int getShuXue() {
        return shuXue;
    }

    /**
     * 设置
     * @param shuXue
     */
    public void setShuXue(int shuXue) {
        this.shuXue = shuXue;
    }

    /**
     * 获取
     * @return yingyu
     */
    public int getYingyu() {
        return yingyu;
    }

    /**
     * 设置
     * @param yingyu
     */
    public void setYingyu(int yingyu) {
        this.yingyu = yingyu;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", yiWen = " + yuWen + ", shuXue = " + shuXue + ", yingyu = " + yingyu +" 总分"+ (yuWen+shuXue+yingyu)+ "}";
    }

    @Override
    public int compareTo(Student2 o) {
        int sum1=this.yuWen+this.shuXue+this.yingyu;
        int sum2=o.yuWen+o.shuXue+o.yingyu;
        //比较总分
        int i=sum1-sum2;
        //总分一样，按照语文
        i=i==0?this.yuWen-o.yuWen:i;
        //语文一样，按照数学
        i=i==0?this.shuXue-o.shuXue:i;
        //数学一样，按照英语
        i=i==0?this.yingyu-o.yingyu:i;
        //英语一样，按照年龄
        i=i==0?this.age-o.age:i;
        //年龄一样，按照姓名
        i=i==0?this.name.compareTo(o.name):i;

        return i;
    }
}
