package leetCood100;

public class Demo86 {
    /*
    给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在
    大于或等于 x 的节点之前。
    你应当 保留 两个分区中每个节点的初始相对位置。
     */
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(4);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(2);
        ListNode l5=new ListNode(5);
        ListNode l6=new ListNode(2);
//        ListNode l7=new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
//        l6.next=l7;
        ListNode listNode = l1;
        ListNode partition = partition(listNode, 3);
        System.out.println("测试");
        while (partition!=null){
            System.out.println(partition.val);
            partition=partition.next;
        }
    }
    public static ListNode partition(ListNode head, int x) {
        ListNode left=new ListNode(0);
        ListNode leftHead=left;
        ListNode right=new ListNode(0);
        ListNode rightHead=right;
        boolean flag=false;
        while (head!=null){
            if(head.val<x){
                left.next=head;
                left=left.next;
            }else{
                right.next=head;
                right=right.next;
            }
            head=head.next;
        }
        right.next=null;
        left.next=rightHead.next;
        return leftHead.next;
    }
}
