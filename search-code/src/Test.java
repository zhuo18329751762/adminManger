import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int[] arr={7,23,79,81,103,127,131,147};
        ArrayList<Integer> list=erFenSearch(arr,48);
        if(list.size()==0){
            System.out.println("没有查询到");
        }else{
            System.out.println(list);
        }
    }
    public static ArrayList<Integer> erFenSearch(int[] arr,int num){
        ArrayList<Integer> list=new ArrayList<>();
        int min=0;
        int max=arr.length;
        int mid=(min+max)/2;
        while(true){
            if(min>max){
                return list;
            }
            if(arr[mid]==num){
                list.add(arr[mid]);
                list.add(mid);
                return list;
            }
            if(arr[mid]<num){
                min=mid+1;
                mid=(min+max)/2;
            }else if(arr[mid]>num){
                max=mid-1;
                mid=(min+max)/2;
            }
        }
    }
}
