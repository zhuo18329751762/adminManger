package leetCood150;

import java.util.HashSet;
import java.util.Set;

public class Demo141 {
/*
给你一个链表的头节点 head ，判断链表中是否有环。

如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。

如果链表中存在环 ，则返回 true 。 否则，返回 false 。
 */
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public static void main(String[] args) {
        ListNode head=new ListNode(3);
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(0);
        ListNode l3=new ListNode(-4);
        head.next=l1;
        l1.next=l2;
        l2.next=l3;
        l3.next=l1;
        System.out.println(hasCycle(head));

    }
        public static boolean hasCycle(ListNode head) {
            if(head==null||head.next==null){
                return false;
            }
            ListNode fast=head.next;
            ListNode slow=head;
            while (fast!=null&&fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
        }
}
