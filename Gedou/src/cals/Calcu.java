package cals;

import javax.xml.ws.soap.Addressing;

public class Calcu {
        float num1;
        float num2;

        public void add(float num1,float num2){
            System.out.println("加法");
            float total =num1+num2;
//            boolean state;
//            if(total==11){
//                state = true;
//            }else{
//                state = false;
//            }
//
//            if(state){
//                System.out.println("加法计算正确");
//            }else{
//                System.out.println("加法计算错误");
//            }
            System.out.println("加法结果是:"+total);
        }

        public void jianFa(float num1,float num2){
            System.out.println("减法");
            float total =num1-num2;
            System.out.println("减法结果是:"+total);
        }

        public void cuFa(float num1,float num2){
            System.out.println("除法");
            double total = num1/num2;
            System.out.println("除法结果是:"+total);
        }

        public void chenFa(float num1,float num2){
            System.out.println("乘法");
            float total = num1*num2;
            System.out.println("乘法结果是:"+total);
        }
        public void ciFang(float num1,float num2){
            float num=num1;
            int n=(int)num2;
            for (int i = 0; i < n-1; i++) {
                num1=num1*num;
            }
            System.out.println("次方运算");
            System.out.println(num+"的"+n+"次方为"+num1);
        }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
}