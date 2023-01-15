package Test;

public class PaFloor {
    public static void main(String[] args) {
        //小明喜欢爬楼梯，有时候一次爬一个台阶，有时候一次爬两个台阶,有时候一次爬三个台阶
        //如果这个楼梯有20个台阶，小明一共有多少种爬法
        // 1层 1种
        // 2层 2种
        // 3层 4种
        // 4层 7种
        System.out.println(getCount(20));
    }
    public static int getCount(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        return getCount(n-1)+getCount(n-2)+getCount(n-3);
    }
}
