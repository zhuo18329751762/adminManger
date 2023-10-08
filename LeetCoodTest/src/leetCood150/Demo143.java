package leetCood150;

public class Demo143 {
    /*
给定一个单链表 L 的头节点 head ，单链表 L 表示为：

L0 → L1 → … → Ln - 1 → Ln
请将其重新排列后变为：

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
     */

    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }
        //获取中间节点
        ListNode mid=middleNode(head);
        ListNode l1=head;
        ListNode l2=mid.next;
        mid.next=null;
        //反转右半段节点
        l2=reverseList(l2);
        //合并左右两边节点
        mergeList(l1,l2);
    }
    public ListNode middleNode(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void mergeList(ListNode l1,ListNode l2){
        ListNode l1_tmp;
        ListNode l2_tep;
        while(l1!=null&&l2!=null){
            l1_tmp=l1.next;
            l2_tep=l2.next;
            l1.next=l2;
            l1=l1_tmp;
            l2.next=l1;
            l2=l2_tep;
        }
    }
}
