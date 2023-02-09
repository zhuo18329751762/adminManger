package IOTest;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) throws IOException {
        /*
        将正确的用户名和密码手动保存在本地的userinfo.txt文件中
        保存格式为:username=zhangsan&password=123
        让用户键盘录入用户名和密码
        比较用户录入的和正确的用户名密码是否一致
        如果一致则打印登陆成功
        如果不一致则打印登录失败
         */
        BufferedReader br=new BufferedReader(new FileReader("E:\\userinfo.txt"));
        String str;
        HashMap<String,String> hm=new HashMap<>();
        while ((str=br.readLine())!=null){
            System.out.println(str);
            String name=str.split("=")[1].split("&")[0];
            String password=str.split("=")[2];
            hm.put(name,password);
        }
        br.close();
        System.out.println(hm);
        System.out.println("请输入用户名");
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("请输入用户密码");
        String password = sc.nextLine();
        boolean flag = hm.containsKey(name);
        if(flag){
            String pass = hm.get(name);
            if(pass.equals(password)){
                System.out.println("登陆成功");
            }else {
                System.out.println("密码输入错误");
            }
        }else{
            System.out.println("用户名输入错误");
        }
    }
}
