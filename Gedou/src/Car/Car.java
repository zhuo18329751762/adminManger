package Car;
import java.util.Scanner;
import java.lang.System;
public class  Car {
    public static void main(String[] args) {
        //构造函数定义一个车类
        che car=new che();
        boolean flag=true;
        while(flag) {
            car.function();
            car.diaoYong();
        }
    }
    }

enum colour {red, yellow, blue, green, cyan, purple,};

class che {
 //属性
 int price;//价格
 String pinPai;//品牌
 double length;//长度
 double width;//宽度
 double height;//高度
    double volume = volume();//车的体积
     int a=0;//标志变量，记录车辆是否以启动
 colour col;//车的颜色




 //行为
 //构造函数定义一个车
 che() {
     Scanner sc = new Scanner(System.in);
     System.out.println("请输入车的价格");
     this.price = sc.nextInt();
     System.out.println("请输入车的品牌");
     this.pinPai = sc.next();
     System.out.println("请输入车的长度");
     this.length = sc.nextDouble();
     System.out.println("请输入车的宽度");
     this.width = sc.nextDouble();
     System.out.println("请输入车的高度");
     this.height = sc.nextDouble();
     System.out.println("您的车是什么颜色:");
     System.out.println("1:红色");
     System.out.println("2:黄色");
     System.out.println("3:蓝色");
     System.out.println("4:绿色");
     System.out.println("5:青色");
     System.out.println("6:紫色");
     int i=sc.nextInt();
     switch (i) {
         case 1:
             this.col = colour.red;
             break;
         case 2:
             this.col = colour.yellow;
             break;
         case 3:
             this.col = colour.blue;
             break;
         case 4:
             this.col = colour.green;
             break;
         case 5:
             this.col = colour.cyan;
             break;
         case 6:
             this.col = colour.purple;
             break;
         default:
             System.out.println("您的输入有误");
             return;
     }
     volume = volume();//定义体积大小
     System.out.println("恭喜 您的车信息以录入成功!!!");
 }


 //面板
 public void function() {
     System.out.println("****************");
     System.out.println("您想让车干什么");
     System.out.println("1:启动车辆");
     System.out.println("2:车辆前进");
     System.out.println("3:车辆倒车");
     System.out.println("4:车辆停止");
     System.out.println("5:展示车辆信息");
     System.out.println("  6:退出 ");
     System.out.println("****************");
 }
 //功能调用
 public void diaoYong(){
     Scanner sc=new Scanner(System.in);
     int i= sc.nextInt();
     switch(i){
         case 1:
              a=go(a);//启动车辆
             break;
         case 2:
             qianJin(a);//车辆前进
             break;
         case 3:
             daoche(a);//车辆倒车
             break;
         case 4:
             tingche(a);//车辆停止
             break;
         case 5:
             print();
             //展示车辆信息
             break;
         case 6:
             return;
         default:
             System.out.println("您的输入有误");
             break;
     }
    }


 //获取车的体积方法
 public double volume() {
     return length * width * height;
 }

 //启动汽车
 public int go(int b) {
     if(b==0) {
         jiDianQi();
         faDongJi();
         System.out.println("汽车启动成功!!!");
         return 1;
     }
     else{
         System.out.println("车辆以启动，无需再次启动");
     }
     return 1;
 }

 //启动继电器
 public void jiDianQi() {
     System.out.println("继电器正在启动");
     System.out.println("继电器启动成功!!!");
 }
 //启动发动机
 public void faDongJi() {
     System.out.println("发动机正在启动");
     System.out.println("发动机启动成功!!!");
 }
 //前进
 public void qianJin(int i){
     if(i==1) {
         System.out.println("汽车正在前进");
     }
     else{
         System.out.println("您的汽车还没启动");
         return;
     }
 }
 //倒车
 public void daoche(int i){
     if(i==1) {
         System.out.println("汽车正在倒车");
     }
     else{
         System.out.println("您的汽车还没启动");
         return;
     }
 }
 //停车
 public void tingche(int i){
     if(i==1) {
         System.out.println("汽车正在刹车");
     }
     else{
         System.out.println("您的汽车还没启动");
         return;
     }
 }
 //打印车辆信息
 public void print(){
     System.out.println("您的车辆信息如下:");
     System.out.println("价格:" + this.price);
     System.out.println("品牌:" + this.pinPai);
     System.out.println("长度:" + this.length);
     System.out.println("宽度:" + this.width);
     System.out.println("高度:" + this.height);
     System.out.println("体积:" + this.volume);
     System.out.println("颜色:" + this.col);
     System.out.println("您的汽车信息打印完成");
    }

 public int getPrice() {
     return price;
 }

 public void setPrice(int price) {
     this.price = price;
 }

 public String getPinPai() {
     return pinPai;
 }

 public void setPinPai(String pinPai) {
     this.pinPai = pinPai;
 }

 public double getLength() {
     return length;
 }

 public void setLength(double length) {
     this.length = length;
 }

 public double getWidth() {
     return width;
 }

 public void setWidth(double width) {
     this.width = width;
 }

 public double getHeight() {
     return height;
 }

 public void setHeight(double height) {
     this.height = height;
 }

 public colour getCol() {
     return col;
 }

 public void setCol(colour col) {
     this.col = col;
 }
}


