package StringBuilder;

public class StringBuilderFenXi {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        //长度 0
        System.out.println(sb.length());
        //容量 默认16
        System.out.println(sb.capacity());

//        sb.append("abc");
//        //长度 3
//        System.out.println(sb.length());
//        //容量 默认16
//        System.out.println(sb.capacity());
//
//
//        sb.append("abcdefghijklmnopqrstuvwxyz");
//        //长度 16
//        System.out.println(sb.length());
//        //容量 34=16*2+2;
//        System.out.println(sb.capacity());

        sb.append("abcdefghijklmnopqrstuvwxyz0123456789");
        //长度 36
        System.out.println(sb.length());
        //容量 36;
        System.out.println(sb.capacity());

    }
}
