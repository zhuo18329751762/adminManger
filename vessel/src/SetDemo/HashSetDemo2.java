package SetDemo;

public class HashSetDemo2 {
    public static void main(String[] args) {
        /*
        哈希值
        对象的整数表现形式
        1.如果没有重写hashCode方法，计算出的哈希值是不同的
        2.如果已经重写hashCode方法，不同的对象只要属性相同，计算出来的哈希值是一样的
        3.但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样(也称为哈希碰撞)
         */
        // 1 创建对象
        Student s1=new Student("张三",18);
        Student s2=new Student("张三",18);
        Student s3=new Student("王五",20);
        // 2 如果没有重写hashCode方法，不同对象计算出来的哈希值是不同的
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s3.hashCode());
        // 3 哈希碰撞
        System.out.println("abc".hashCode());//96354
        System.out.println("acD".hashCode());//96354
    }
}
