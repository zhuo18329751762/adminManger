public class BubbleDemo1 {
    public static void main(String[] args) {
        //冒泡排序法
        int[] arr={5,4,3,2,1};
        //利用冒泡排序将数组中的数据变成1,2,3,4,5
        for (int i = 0; i < arr.length-1; i++) {
            for (int i1 = 0; i1 < arr.length-1; i1++) {
                if(arr[i1]>arr[i1+1]){
                    int num=arr[i1+1];
                    arr[i1+1]=arr[i1];
                    arr[i1]=num;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
