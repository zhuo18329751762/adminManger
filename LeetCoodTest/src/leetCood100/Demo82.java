package leetCood100;

public class Demo82 {

    /*
        给定一个已排序的链表的头 head ， 删除原始链表中所有重复数字的节点，只留下不同的数字 。返回 已排序的链表 。
     */
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(1);
//        ListNode l3=new ListNode(3);
//        ListNode l4=new ListNode(3);
//        ListNode l5=new ListNode(4);
//        ListNode l6=new ListNode(4);
//        ListNode l7=new ListNode(5);
//        l1.next=l2;
//        l2.next=l3;
//        l3.next=l4;
//        l4.next=l5;
//        l5.next=l6;
//        l6.next=l7;
        ListNode listNode = l1;
        ListNode listNode1 = deleteDuplicates(listNode);
        while (listNode1!=null){
            System.out.println(listNode1.val);
            listNode1=listNode1.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0, head);

        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}
