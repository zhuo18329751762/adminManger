package Test;

public class Test5_10 {
    public static void main(String[] args) {
        int count=0;
        for(int i=101;i<1000;i++){
            if(i%5==0&&i%6==0){
                System.out.print(i+" ");
                count++;
            }
            if(count==10){
                System.out.println();
                count=0;
            }
        }
    }
}
