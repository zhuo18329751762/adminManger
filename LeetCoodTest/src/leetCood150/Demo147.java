package leetCood150;

import java.util.List;

public class Demo147 {
    /*
    给定单个链表的头 head ，使用 插入排序 对链表进行排序，并返回 排序后链表的头 。

插入排序 算法的步骤:

插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
重复直到所有输入数据插入完为止。
下面是插入排序算法的一个图形示例。部分排序的列表(黑色)最初只包含列表中的第一个元素。每次迭代时，从输入数据中删除一个元素(红色)，并就地插入已排序的列表中。

对链表进行插入排序。
     */



    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        //定义一个头结点
        ListNode h=new ListNode(0);
        ListNode cur=head;
        while (cur!=null){
            ListNode pre=h;
            ListNode next=cur.next;
            while (pre.next!=null&&pre.next.val<=cur.val){
                pre=pre.next;
            }
            cur.next=pre.next;
            pre.next=cur;
            cur=next;
        }
        return h.next;
    }
}
