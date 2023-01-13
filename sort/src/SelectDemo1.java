public class SelectDemo1 {
    public static void main(String[] args) {
        //选择排序
        //从零索引开始，跟后面的元素一一比较
        //小的放前面，大的放后面

        //定义数组
        int[] arr={2,4,5,3,1};
        //利用选择排序
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if(arr[i]>arr[j]){
                   int num=arr[i];
                   arr[i]=arr[j];
                   arr[j]=num;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
