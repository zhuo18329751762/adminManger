package leetCood50;

public class Demo21 {
    /*
    将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     */
    public static void main(String[] args) {
        //l1 = [1,2,4], l2 = [1,3,4]
        int[] arr1={1,2,4};
        int[] arr2={1,3,4};
        ListNode head1=new ListNode(0);
        ListNode head2=new ListNode(0);
        ListNode l1=head1;
        ListNode l2=head2;
        for (int i = 0; i < arr1.length; i++) {
            l1.next=new ListNode(arr1[i]);
            l1=l1.next;
            //System.out.println(l1.val);
        }
        for (int i = 0; i < arr2.length; i++) {
            l2.next=new ListNode(arr2[i]);
            l2=l2.next;
            //System.out.println(l2.val);
        }
        ListNode listNode = mergeTwoLists(head1.next, head2.next);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) {
                System.out.println(list2.val);
                return list2;
            }
            else if (list2 == null) {
                System.out.println(list1.val);
                return list1;
            }
            else if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                System.out.println("l1"+list1.val);
                return list1;
            }
            else {
                list2.next = mergeTwoLists(list1, list2.next);
                System.out.println("l2"+list2.val);
                return list2;
            }
        }

    public static class ListNode {
        int val;
        ListNode next;
        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
