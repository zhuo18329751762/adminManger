package Object;

import java.util.StringJoiner;

//如果一个接口没有抽象方法
//表示当前接口是一个标记性窗口
public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone()
        //先把克隆对象中的数组获取出来
        int[] newDate=new int[date.length];
        for (int i = 0; i < date.length; i++) {
            newDate[i]=date[i];
        }
        //调用父类中的对象克隆方法
        User u=(User)super.clone();
        //需要替换克隆出来的数组地址值
        u.date=newDate;
        return u;
    }

    public User(int id, String username, String password, String path, int[] date) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.date = date;
    }
    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
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
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return date
     */
    public int[] getDate() {
        return date;
    }

    /**
     * 设置
     * @param date
     */
    public void setDate(int[] date) {
        this.date = date;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", path = " + path + ", date = " + arrToString() + "}";
    }
    public String arrToString(){
        StringJoiner sj=new StringJoiner(",","[","]");
        for (int i = 0; i < date.length; i++) {
            sj.add(date[i]+"");
        }
        return sj.toString();
    }
}
