package ZiFuChuan;

public class PhoneNumberPingBi {
    public static void main(String[] args) {
        //获取一个手机号码
        String phoneNumber = "13112349468";
        //截取手机号码前三位
        String num=phoneNumber.substring(0,3);
        //截取手机号码后四位
        num=num+"****"+phoneNumber.substring(7,11);
        //打印
        System.out.println(num);
    }
}
