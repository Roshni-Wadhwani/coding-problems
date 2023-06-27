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
    public ListNode middleNode(ListNode head) {
        // TC:-O(N)+O(N/2)
        // SC:-O(1)
        // int countNodes=0;
        // ListNode current=head;
        // while(current!=null){
        //     countNodes++;
        //     current=current.next;
        // }
        
        // int mid=(countNodes)/2;
        // mid+=1;
        // current=head;
        // for(int i=0;i<mid-1;i++){
        //     current=current.next;
        // }
        // return current;


        //optimised .... TORTOISE METHOD
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && slow!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}