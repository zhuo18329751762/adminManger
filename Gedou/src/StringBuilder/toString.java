package StringBuilder;

public class toString {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb=new StringBuilder();
        //添加字符串
        sb.append("AAA").append("BBB").append("CCC").append("DDD");
        System.out.println(sb);
        //用完StringBuilder将其转换为字符串
        String str=sb.toString();
        System.out.println(str);
    }
}
