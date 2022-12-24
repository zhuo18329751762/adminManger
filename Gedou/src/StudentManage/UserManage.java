package StudentManage;
import StringBuilderTest.Test04;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManage {
    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList<>();
        while(true) {
            int i = choose();
            switch (i) {
                case 1:
                    denglu(list);
                    break;
                case 2:
                    zhuCe(list);
                    break;
                case 3:
                    wangJiPassWord(list);
                    break;
            }
        }
    }
    public static int choose(){
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作: 1:登录 2:注册 3:忘记密码");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        return i;
    }
    //忘记密码
    public static void wangJiPassWord(ArrayList<User> list){
        String userName;
        String passWord;
        String idCard;
        String phoneNum;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        userName=sc.next();
        int a=panduan(list,userName);
        if(a==-1){
            System.out.println("该用户名未注册，请先注册");
            return;
        }else {
            System.out.println("请输入"+userName+"注册时预留身份证号码");
            idCard=sc.next();
            if(!(idCard.equals(list.get(a).getIdCard()))){
                System.out.println("输入的身份证号码有误");
                return ;
            }else{
                System.out.println("请输入"+userName+"注册时预留手机号码");
                phoneNum=sc.next();
                if(!(phoneNum.equals(list.get(a).getPhoneNum()))){
                    System.out.println("输入的手机号码有误");
                    return ;
                }else{
                    System.out.println("请输入新密码");
                    passWord=sc.next();
                    list.get(a).setPassWord(passWord);
                    System.out.println("密码修改成功！！！");
                }
            }
        }


    }
    //登录功能
    public static void denglu(ArrayList<User> list){
        char[] alphabe={'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                'O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d',
                'e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
                'u','u','w','x','y','z',};
        int[] num={0,1,2,3,4,5,6,7,8,9};
        String userName;
        String passWord;
        String yanzhen;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        userName=sc.next();
        int a=panduan(list,userName);
        if(a==-1){
            System.out.println("该用户名未注册，请先注册");
            return;
        }else{
            String yanZhengMa=Test04.getYanZhengMa(alphabe,num);
            System.out.println("验证码是"+yanZhengMa);
            System.out.println("请输入验证码");
            yanzhen=sc.next();
            if(!(yanzhen.equals(yanZhengMa))){
                System.out.println("验证码输入错误");
                return;
            }else{
                for (int i = 0; i < 3; i++) {
                    System.out.println("您还有"+(3-i)+"次机会");
                    System.out.println("请输入用户密码");
                    passWord=sc.next();
                    if(passWord.equals(list.get(a).getPassWord())){
                        //进入学生信息管理系统
                        System.out.println("登陆成功!");
                        SystemHome sh=new SystemHome();
                        sh.studentManage();
                     }
                    else{
                        System.out.println("密码输入错误，请重试");
                        if(i==2){
                            System.out.println("当前账号已被锁定，请联系官方人员");
                        }
                    }
                }
            }
        }


    }
    //注册功能
    public static void zhuCe(ArrayList<User> list){
        String userName;
        String passWord;
        String idCard;
        String phoneNum;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的用户名");
        userName=sc.next();
        boolean a=panDuan(userName);
        if(a) {
            int flag = panduan(list, userName);
            if (flag != -1) {
                System.out.println("该用户名已存在");
                return;
            } else {
                System.out.println("请输入密码");
                passWord=sc.next();
                System.out.println("请再次输入密码");
                String passWord2=sc.next();
                if(passWord.equals(passWord2)){
                    System.out.println("请输入身份证号码");
                    idCard=sc.next();
                    boolean b=yanZheng(idCard);
                    if(!b){
                        System.out.println("身份证格式有误");
                        return;
                    }else{
                        System.out.println("请输入手机号码");
                        phoneNum=sc.next();
                        boolean c=shouJiNum(phoneNum);
                        if(!c){
                            System.out.println("手机号码格式有误");
                            return;
                        }else{
                            User u=new User(userName,passWord,idCard,phoneNum);
                            list.add(u);
                            System.out.println("注册成功");
                        }
                    }
                    //身份证号码
                    //手机号码
                }else{
                    System.out.println("两次密码不一致，请重新注册");
                    return;
                }
            }
        }
        else{
            System.out.println("用户名长度必须在3~15之间");
            System.out.println("用户名只能是数字加字母的组合，不能是纯数字");
            System.out.println("请重新注册");
        }
    }
    //验证手机号码
    public static boolean shouJiNum(String phoneNum){
        if(phoneNum.length()!=11||phoneNum.charAt(0)=='0'){
            return false;
        }
        else{
            for (int i = 0; i < phoneNum.length(); i++) {
                if(!(phoneNum.charAt(i)>='0'&&phoneNum.charAt(i)<='9')){
                    return false;
                }
            }
        }
        return true;
    }
    //验证身份证号码
    public static boolean yanZheng(String idCard){
        if(idCard.length()==18&&idCard.charAt(0)!='0'){
            for (int i = 0; i < idCard.length()-1; i++) {
                if(!(idCard.charAt(i)>='0'&&idCard.charAt(i)<='9')){
                    return false;
                }
            }
            if(!(((idCard.charAt(idCard.length()-1)>='0')&&(idCard.charAt(idCard.length()-1)<='9'))
                    ||(idCard.charAt(idCard.length()-1)>='x'||idCard.charAt(idCard.length()-1)>='X'))){
                return false;
            }
            return true;
        }
        return false;
    }
    //判断用户名是否合法
    public static boolean panDuan(String name){
        if(name.length()>=3&&name.length()<=15){
            boolean ziMu=false;
            boolean num=false;
            for (int i = 0; i < name.length(); i++) {
                if((name.charAt(i)>='a'&&name.charAt(i)<='z')||
                        (name.charAt(i)>='A'&&name.charAt(i)<='Z')||
                        (name.charAt(i)>='0'&&name.charAt(i)<='9'))
                if((name.charAt(i)>='a'&&name.charAt(i)<='z')||(name.charAt(i)>='A'&&name.charAt(i)<='Z')){
                    ziMu=true;
                }
                if(name.charAt(i)>='0'&&name.charAt(i)<='9'){
                    num=true;
                }
            }
            if(ziMu&&num){
                return true;
            }
        }
        return false;
    }
    //判断用户名是否唯一
    public static int panduan(ArrayList<User> list,String name){
        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            if(u.getUserName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
