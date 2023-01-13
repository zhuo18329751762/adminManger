import java.util.Random;

public class QuickSortDemo1 {
    public static void main(String[] args) {
        //快速排序
        //第一轮：以0索引的数字为基准数，确定基准数在数组中的正确位置
        //比基准数小的全部放左边 比基准数大的全部放右边
        int[] arr=new int[5];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        long start=System.currentTimeMillis();
        quickSort(arr,0,arr.length-1);
        long end=System.currentTimeMillis();
        System.out.println(end-start);//24

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    /*
    参数一:我们要排序的数组
    参数二:要排序数组的起始索引
    参数三:要排序数组的结束索引
     */
    public static void quickSort(int[] arr,int i,int j){
        //定义两个变量记录要查找的范围
        int start=i;
        int end=j;
        if(start>end){
            return;
        }
        //记录基准数
        int baseNumber=arr[i];
        //利用循环找到要交换的数字
        while(start!=end){
            //利用end，从后往前开始找，找比基准数小的数字
            while(true){
                if(end<=start||arr[end]<baseNumber){
                    break;
                }
                end--;
            }
            //利用start，从前往后找，找比基准数大的数字
            while(true){
                if(end<=start||arr[start]>baseNumber){
                    break;
                }
                start++;
            }
            //把end和start指向的元素进行交换
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
        }
        //当start与end指向同一个数，表明已经找到基准数应在的位置
        int temp=arr[i];
        arr[i]=arr[start];
        arr[start]=temp;
        //确定6左边的范围
        quickSort(arr,i,start-1);
        //确定6右边的范围
        quickSort(arr,start+1,j);
    }
}
