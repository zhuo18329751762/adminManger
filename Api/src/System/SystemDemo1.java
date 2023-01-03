package System;

public class SystemDemo1 {
    public static void main(String[] args) {

        //状态码
        //0:表示当前虚拟机正常停止
        //非0:表示当前虚拟机异常停止
        //需要结束整个程序时 用该方法
        //System.exit(0);
        System.out.println("执行");

       //获取时间原点
        //用来比较时间复杂度
        long l=System.currentTimeMillis();
        System.out.println(l);

        //拷贝数组
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int[] arr2=new int[10];
        //将arr1中的数据拷贝到arr2中
        //参数1 数据源
        //参数2 数据源的第几个索引开始
        //参数3 目的地
        //参数4 目的地的开始索引
        //参数5 拷贝的个数
        System.arraycopy(arr1,6,arr2,2,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
