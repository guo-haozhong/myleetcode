/**
 * 快慢指针解法
 * 时间复杂度：O(N)，其中 N 是链表中的节点数
 * 空间复杂度：O(1)
 */

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
 var detectCycle = function(head) {
    if(head==null){return null}
    let fast=head,slow=head
    while(fast && fast.next!==null){
        slow=slow.next;
        fast=fast.next.next;
        if(fast==slow){
            let temp=head;
            while(temp!==slow){
                temp=temp.next;
                slow=slow.next;
            }
            return temp
        }
    }
    return null
};