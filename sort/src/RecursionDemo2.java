public class RecursionDemo2 {
    public static void main(String[] args) {
        //用递归求5的阶乘
        int num=JieCheng(5);
        System.out.println(num);
    }

    private static int JieCheng(int num) {
        if(num==1){
            return 1;
        }
        return num*JieCheng(num-1);
    }
}
