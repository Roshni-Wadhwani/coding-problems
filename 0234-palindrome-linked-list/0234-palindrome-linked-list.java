/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int i=0;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev=null;
        ListNode current=slow.next;
        while(current!=null){
            ListNode newNode=current.next;
            current.next=prev;
            prev=current;
            current=newNode;
        }
        ListNode tempHead=prev;
        ListNode initHead=head;
        while(tempHead!=null){
            if(tempHead.val!=initHead.val)          return false;
            tempHead=tempHead.next;
            initHead=initHead.next;
        }
        return true;
    }
}