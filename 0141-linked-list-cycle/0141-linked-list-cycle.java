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
        ListNode fast=head,slow=head;
        while(fast!=null && slow!=null){
            if(fast.next==null)     break;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)          return true;
        }
        return false;
    }
}