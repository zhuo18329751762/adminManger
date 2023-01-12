public class basic {
    public static void main(String[] args) {
        //定义一个方法挨个往后查找
        //定义一个方法利用基本查找，查询某个元素是否存在
        //数据如下：{131,127,147,81,103,23,7,79}
        int[] arr={131,127,147,81,103,23,7,79};
        Boolean flag = basicSearch(arr, 0);
        System.out.println(flag);

    }
    public static Boolean basicSearch(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }
}
