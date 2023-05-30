package leetCood100;

import domain.ListNode;
import leetCood50.Demo19;

import java.util.Deque;
import java.util.LinkedList;

public class Demo61 {
    /**
     * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
     */
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l1.next=l2;
//        l2.next=l3;
//        l3.next=l4;
//        l4.next=l5;
        ListNode listNode = rotateRight(l1, 2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(k==0){
            return head;
        }
        //记录头结点
        ListNode h=head;
        //记录节点个数
        int num=0;
        //创建一个栈模型
        Deque<ListNode> stack=new LinkedList<>();
        while (head!=null){
            //入栈
            stack.push(head);
            head=head.next;
            num++;
        }
        System.out.println(num);
        if(num==0||num==1||k%num==0){
            return h;
        }
        k=k%num;
        //找到倒数第k个节点
        for (int i = 0; i < k; i++) {
            stack.pop();
        }
        ListNode peek = stack.peek();
        ListNode l=peek.next;
        ListNode l1=l;
        peek.next=null;
        //将尾部向前数第K个元素作为头，原来的头接到原来的尾上
        while (l.next!=null){
            l=l.next;
        }
        l.next=h;
        return l1;
    }
}
