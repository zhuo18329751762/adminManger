package leetCood150;

import domain.ListNode;

public class Demo109 {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return new TreeNode(head.val);
        }
        ListNode midNode=getMidNode(head);
        TreeNode root=new TreeNode(midNode.val);
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(midNode.next);
        return root;
    }
    public ListNode getMidNode(ListNode head){
        ListNode pre=null;
        ListNode fast=head,slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            pre=slow;
            slow=slow.next;
        }
        if(pre!=null){
            pre.next=null;
        }
        return slow;
    }

}
