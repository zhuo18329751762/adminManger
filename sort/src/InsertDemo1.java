public class InsertDemo1 {
    public static void main(String[] args) {
        //插入排序 将0索引的元素到n索引的元素看做是有序的，把n+1索引的元素看做是最后一个当成是无序的
        //遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面
        // N的范围:0~最大索引
        int[] arr={3,44,38,5,47,15,36,26,37,2,46,4,19,50,48};
        //找到无序的那一组数据是从哪个索引开始的
        int startIndex=-1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]<arr[i]){
                startIndex=i+1;//得到无序数据中的起始索引
                break;
            }
        }
        //遍历startIndex到末尾
        for (int i = startIndex; i < arr.length; i++) {
                    while(i>0&&arr[i]<arr[i-1]){
                        int temp=arr[i];
                        arr[i]=arr[i-1];
                        arr[i-1]=temp;
                        i--;
                    }
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
