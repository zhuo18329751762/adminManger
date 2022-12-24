package zhuoyang.staticDemo2;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类
        int[] arr={1,2,3,4,5,6,7,8,9};
        double[] arr2={2.3,4.2,5.2,5.0};
        String str=ArrayUtil.printArr(arr);
        System.out.println(str);
        double d=ArrayUtil.getAverage(arr2);
        System.out.println(d);
    }
}
