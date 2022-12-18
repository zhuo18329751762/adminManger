package ZiFuChuan;
import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        //键盘录入的字符串是new出来的
        String[][] s=new String[1][2];
        s[0][0]=new String("admin");
        s[0][1]=new String("123");
        for (int i=0;i<3;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入账号");

            String account=sc.next();
            System.out.println("请输入密码");

            String passWord=sc.next();
            if((account.equals(s[0][0]))&&(passWord.equals(s[0][1]))){
                System.out.println("登陆成功!!!");
                break;
            }
            else{
                if(i==2){
                    System.out.println("该账号已被锁定!!!");
                }
                System.out.println("密码有误,您还剩下"+(2-i)+"次机会");
            }
        }
    }
}
