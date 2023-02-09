package IOTest;
public class Student1 {
    private String name;
    private String password;
    private int count;

    public Student1() {
    }

    public Student1(String name, String password, int count) {
        this.name = name;
        this.password = password;
        this.count = count;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }

    public String toString() {
        return "username="+name+"&password="+password+"&count="+count;
    }
}
