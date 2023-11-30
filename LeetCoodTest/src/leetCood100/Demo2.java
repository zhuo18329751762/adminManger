package leetCood100;

public class Demo2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode l3 = new ListNode();
        l3 = addTwoNumbers(l1,l2);
        while (l3 != null){
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode l4 = l3;
        int temp=0;
        int flag=0;
        while (l1!=null||l2!=null){
            temp=0;
            if(l1!=null){
                temp+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                temp+=l2.val;
                l2=l2.next;
            }
            temp+=flag;
            if(temp>=10){
                flag=1;
                temp-=10;
            }else{
                flag=0;
            }
            l3.next = new ListNode(temp);
            l3=l3.next;
        }
        if(flag==1) {
            l3.next = new ListNode(flag);
        }
        return l4.next;
    }
}
