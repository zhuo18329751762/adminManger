package ZiFuChuan;

public class PersonId {
    public static void main(String[] args) {
        String Id="450111197205054878";
        String year=Id.substring(6,10);
        String month=Id.substring(10,12);
        String day=Id.substring(12,14);
        //获取性别
        char sex=Id.charAt(16);
        //用ASCII码表转换
        int num=sex-48;
        System.out.println("人物信息为:");
        System.out.println("出生年月日为:"+year+"年"+month +"月"+day+"日");
        if(num%2==0){
            System.out.println("性别为:女");
        }else{
            System.out.println("性别为:男");
        }
    }
}
