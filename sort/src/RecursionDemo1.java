public class RecursionDemo1 {
    public static void main(String[] args) {
        //利用递归求1~100之间的和
        int a=addNum(100);
        System.out.println(a);
    }
    public static int addNum(int num){
        if(num==1){
            return 1;
        }
        return num+addNum(num-1);
    }
}
