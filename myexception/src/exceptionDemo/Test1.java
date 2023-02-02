package exceptionDemo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        键盘录入一个人的姓名和年龄
        姓名的长度在3~10之间
        年龄的范围为18~40岁
        超出这个范围是异常数据不能赋值，需要重新输入，一直录入正确为止

        需要考虑用户键盘录入是的所有情况
        比如：录入年龄时超出范围，录入年龄时录入了abc等情况
         */
        Scanner sc=new Scanner(System.in);
        girl g=new girl();
        while (true) {
            try {
                System.out.println("请输入姓名");
                String name=sc.nextLine();
                g.setName(name);


                System.out.println("请输入年龄");
                String age= sc.nextLine();
                int Age = Integer.parseInt(age);
                g.setAge(Age);
                //如果一切正确，跳出循环
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄的格式有误，请输入数字");
                continue;
            }catch (NameFormatException e){
                System.out.println("姓名长度有误");
                continue;
            }catch (AgeOutOfBoundsException e){
                System.out.println("年龄范围有误");
            }
        }


        //打印
        System.out.println(g);

    }
}
