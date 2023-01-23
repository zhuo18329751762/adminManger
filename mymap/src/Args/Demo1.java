package Args;

public class Demo1 {
    public static void main(String[] args) {
        /*
        假如需要定义一个方法求和，它可以完成：计算2个数据的和，计算3个数据的和，计算4个数据的和，计算n个数据的和，
         */
        //JDK5后 可变参数
        System.out.println(getSum(1, 2, 3, 4));
    }
    // 1 方法形参中只能写一个可变参数
    // 2 在方法中，如果除了可变参数以外，还有其他的形参，那么可变参数要写到最后
    public static int getSum(int...args){
        int sum=0;
        for (int i = 0; i < args.length; i++) {
            sum+=args[i];
        }
        return sum;
    }
}
