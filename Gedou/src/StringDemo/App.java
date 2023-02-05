package StringDemo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        boolean flag=true;
        Menu menu=new Menu();
        while (flag){
            menu.menu();
            Scanner sc=new Scanner(System.in);
            int a=Integer.parseInt(sc.nextLine());
            switch (a){
                case 1:
                    //addInformation();
                    break;
                case 2:
                    updateInformation();
                    break;
                case 3:
                    delinfoMation();
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }
    public static int addInformation(String info){
        String[] arr=info.split(";");
        //添加
        return 0;
    }

    public static int updateInformation(){
        //修改
        return 0;
    }
    public static int delinfoMation(){
        //删除
        return 0;
    }
}
