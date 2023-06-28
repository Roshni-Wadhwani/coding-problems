/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode current1=headA; 
        while(current1!=null){
            ListNode current2=headB;
            while(current2!=null){
                if(current1==current2)          return current1;
                current2=current2.next;
            }
            current1=current1.next;
        }
        return null;
    }
}