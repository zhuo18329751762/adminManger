package leetCood50;

public class Demo24 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        ListNode l6=new ListNode(6);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
//        l4.next=l5;
//        l5.next=l6;
        ListNode listNode = swapPairs(l1);
        int i=0;
        while (listNode!=null){
            i++;
            System.out.println("l"+i+"="+listNode.val);
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
    public static ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode list=new ListNode(0,head);
        ListNode list1=list;
        while(list1!=null&&list1.next!=null&&list1.next.next!=null){
            ListNode l1=list1.next;
            ListNode l2=l1.next;
            ListNode l3=l2.next;

            list1.next=l2;
            l2.next=l1;
            l1.next=l3;
            //一次跳跃两个
            list1=l1;

        }
        return list.next;
    }
}
