package LinkedListDemo;

import java.util.LinkedList;

public class Demo1 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("aaa");
        ll.add("bbb");
        ll.add("ccc");

        ll.addFirst("ddd");
        ll.addLast("eee");
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
    }
}
