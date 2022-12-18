package ZiFuChuan;

public class PinJieString {
    public static void main(String[] args) {
        //把int数组中的数据按照指定格式拼接成一个字符串返回
        int[] arr={1,2,3};
       String s= pinJie(arr);
        System.out.println(s);
    }
    public static String pinJie(int[] arr){
        if(arr==null){
            return "";
        }
        if(arr.length==0){
            return "[]";
        }
        String s=new String();
        s=s+"[";
        for (int i = 0; i < arr.length; i++) {
            s=s+arr[i];
            if(i!=arr.length-1){
                s=s+",";
            }
        }
        s=s+"]";
        return s;
    }
}
