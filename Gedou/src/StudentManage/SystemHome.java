package StudentManage;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemHome {
    public static void  studentManage() {
        ArrayList<Student> list=new ArrayList<>();
        while(true){
            int i=choose();
            switch (i){
                case 1:
                addStudent(list);
                    break;
                case 2:
                    Scanner sc=new Scanner(System.in);
                    System.out.println("请输入要删除学生的id");
                    String id=sc.next();
                    deleteStudent(list,id);
                    break;
                case 3:
                    Scanner sc2=new Scanner(System.in);
                    System.out.println("请输入要修改学生的id");
                    String id1=sc2.next();
                    xiuGai(list,id1);
                    break;
                case 4:
                    chaXun(list);
                    break;
                case 5:
                    System.out.println("退出");
                    System.exit(0);
                default:
                    System.out.println("您的输入有误!请重新输入");
                    break;
            }

        }
    }
    //查询
    public static void chaXun(ArrayList<Student> list){
        if(list.size()==0){
            System.out.println("当前无学生信息，请添加后再来查询");
        }else{
            System.out.println("学生信息如下:");
            for (int i = 0; i < list.size(); i++) {
                Student stu=list.get(i);
                System.out.println("id"+"\t"+stu.getId()+"  姓名"+"\t"+stu.getName()
                        +"  年龄"+"\t"+stu.getAge()+"  地址"+"\t"+stu.getAddress());
            }
        }
    }
    //修改
    public static void xiuGai(ArrayList<Student> list,String id){
        int flag=panDuan(list,id);
        if(flag==-1){
            System.out.println("id不存在");
            return;
        }else{
            String name;
            int age;
            String address;
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入修改后的学生id");
            id=sc.next();
            System.out.println("请输入修改后的学生姓名");
            name=sc.next();
            System.out.println("请输入修改后的学生年龄");
            age=sc.nextInt();
            System.out.println("请输入修改后的学生地址");
            address=sc.next();
            Student stu=new Student(id,name,age,address);
            list.set(flag,stu);
            System.out.println("修改成功");
        }
    }
    //删除功能
    public static void deleteStudent(ArrayList<Student> list,String id){
        int flag=panDuan(list,id);
        if(flag==-1){
            System.out.println("id不存在");
            return;
        }else{
            list.remove(flag);
            System.out.println("删除成功!!!");
        }
    }
    public static int choose(){
        Scanner sc=new Scanner(System.in);
        System.out.println("-----------欢迎来到学生管理系统-------------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
        System.out.println("请输入您的选择:");
        int i=sc.nextInt();
        return i;
    }
    //添加学生
    public static void addStudent(ArrayList<Student> list){

        String id;
        String name;
        int age;
        String address;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要添加的学生id");
        id=sc.next();
        int flag=panDuan(list,id);
        if(flag!=-1){
            System.out.println("当前id已存在,请重新输入");
            return;
        }
        System.out.println("请输入要添加的学生姓名");
        name=sc.next();
        System.out.println("请输入要添加的学生年龄");
        age=sc.nextInt();
        System.out.println("请输入要添加的学生地址");
        address=sc.next();
        Student stu=new Student(id,name,age,address);
        list.add(stu);
        System.out.println("添加成功");
    }
    //判断id是否存在
    public static int panDuan(ArrayList<Student> list,String id)
    {
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            if(stu.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
