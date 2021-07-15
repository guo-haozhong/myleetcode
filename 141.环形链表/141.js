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
 * @return {boolean}
 */
 var hasCycle = function(head) {
    if(!head || !head.next){
        return false
    }
    let fast=head //快指针-移动2位
    let slow=head //慢指针-移动1位
    
    while(fast && fast.next){
        fast=fast.next.next
        slow=slow.next
        if(fast==slow){
            //快慢指针相等--环形链表
            return true
        }
    }
    return false
};