package leetCood150;

public class Demo121 {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int minProfit=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minProfit){
                minProfit=prices[i];
            } else if (prices[i]-minProfit>maxProfit) {
                maxProfit=prices[i]-minProfit;
            }
        }
        return maxProfit;
    }



//    //暴力解法 超时
//    public int maxProfit(int[] prices) {
//        int maxProfit=0;
//        for(int i=0;i<prices.length;i++){
//            for(int j=i+1;j<prices.length;j++){
//                if(prices[j]<=prices[i]){
//                    continue;
//                }
//                int num=prices[j]-prices[i];
//                maxProfit=maxProfit>num?maxProfit:num;
//            }
//        }
//        return maxProfit;
//    }
}
