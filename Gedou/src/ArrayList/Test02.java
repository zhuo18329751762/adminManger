package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        /*
        main中定义一个集合 存入三个用户对象
        用户属性 id username password
        要求：
        定义一个方法 根据id查找对应的用户信息
        如果存在 返回true
         */
        ArrayList<User> list=new ArrayList<>();
        User u1=new User("001","张三","123456");
        User u2=new User("002","李四","12345678");
        User u3=new User("003","王五","1234566");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户id");
        String id=sc.next();
        int flag=PanDuan(list,id);
        System.out.println(flag);
    }
    public static int PanDuan(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            if(u.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
