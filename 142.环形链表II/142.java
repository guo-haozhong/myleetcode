/**
 * 快慢指针解法
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){ return null;}
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                //当快慢指针相遇
                ListNode temp=head;
                while(slow!=temp){
                    temp=temp.next;
                    slow=slow.next;
                }
                //当temp=slow时，说明在环的入口处相遇了，返回-
                //链表开始入环的第一个节点
                return temp;
            }
        }
        return null;
    }
}