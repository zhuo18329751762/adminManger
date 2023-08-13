package leetCood100;

public class Demo83 {
    /*
    给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
     */
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(1);
        ListNode l3=new ListNode(2);
        ListNode l4=new ListNode(2);
        ListNode l5=new ListNode(3);
        ListNode l6=new ListNode(3);
        ListNode l7=new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=l7;
        ListNode listNode = l1;
        ListNode listNode1 = deleteDuplicates(listNode);
        while (listNode1!=null){
            System.out.println(listNode1.val);
            listNode1=listNode1.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode l=new ListNode(0,head);
        ListNode node=l;
        while (head!=null){
            if(head.next==null){
                node.next=head;
                break;
            }
            if(head.val!=head.next.val) {
                node.next=head;
                node = node.next;
            }
            head = head.next;
        }
        return l.next;
    }
}
