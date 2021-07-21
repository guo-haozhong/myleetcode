/**
 * 哈希解法
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
    public boolean hasCycle(ListNode head) {
        Set<ListNode> hashlist=new HashSet<ListNode>();
        while(head!=null){
            if(!hashlist.add(head)){
                //如果存在于哈希表，则链表有环
                return true;
            }
            head=head.next;
        }
        return false;
    }
}