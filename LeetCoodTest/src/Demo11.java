public class Demo11 {
    /*
    给定一个长度为 n 的整数数组height。有n条垂线，第 i 条线的两个端点是(i, 0)和(i, height[i])。

找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。

返回容器可以储存的最大水量

     */
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int max = maxArea1(height);
        System.out.println(max);
    }
    public static int maxArea(int[] height) {
        int left=0;
        int right=0;
        int max=0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                int heig=height[i]<height[j]?height[i]:height[j];
                if(heig*(j-i)>max){
                    max=heig*(j-i);
                }
            }
        }
        System.out.println(max);
        return 0;
    }
    public static int maxArea1(int[] height) {
        int max=0;
        int l=0,r=height.length-1;
        while (l<r){
            int are=Math.min(height[l],height[r])*(r-l);
            int minH=Math.min(height[l],height[r]);
            max=Math.max(are,max);
            while(height[l]<=minH&&l<r){
                l++;
            }
            while(height[r]<=minH&&l<r){
                r--;
            }
        }
        return max;
    }
}
