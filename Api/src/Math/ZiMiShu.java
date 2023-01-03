package Math;

public class ZiMiShu {
    public static void main(String[] args) {
        //统计一共有多少个水仙花数
        int count=0;
        for (int i = 1000; i < 9999; i++) {
            //个位 十位 百位
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
            int qian=i/1000%10;
            //int bai=i/100%10;
            //判断
           double sum=Math.pow(ge,4)+Math.pow(shi,4)+Math.pow(bai,4)+Math.pow(qian,4);
          if(sum==i){
              count++;
            }
        }
        System.out.println(count);

    }

}
