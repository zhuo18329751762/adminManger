package leetCood50;

import java.util.Deque;
import java.util.LinkedList;

public class Demo19 {
    /*
    给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
     */
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
//        l1.next=l2;
//        l2.next=l3;
//        l3.next=l4;
//        l4.next=l5;
        ListNode listNode = removeNthFromEnd(l1, 1);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
        public static ListNode removeNthFromEnd(ListNode head, int n) {
            //因为后面要用到删除节点的前一个节点，防止要删除的节点时第一个节点，而导致没有前一个节点的错误
            //这里创建一个节点作为链表的起始节点
            ListNode l=new ListNode(0,head);
            //创建节点l，防止链表删除后为空
            ListNode m=l;
            //创建一个栈模型
            Deque<ListNode> stack=new LinkedList<>();
            //先全部将节点入栈
            while (m!=null){
                //入栈
                stack.push(m);
                m=m.next;
            }
            //进行出栈，要删除倒数第几个元素，就进行多少次出栈
            for(int i=0;i<n;i++){
                stack.pop();
            }
            //拿出要删除的节点的前一个节点
            ListNode peek = stack.peek();
            //将他的next指向要被删除的节点的next域，即可完成删除操作
            peek.next=peek.next.next;
            //返回头节点，此时使用l.next作为头结点进行返回,防止头结点被删除后为空
            return l.next;
        }


    }
