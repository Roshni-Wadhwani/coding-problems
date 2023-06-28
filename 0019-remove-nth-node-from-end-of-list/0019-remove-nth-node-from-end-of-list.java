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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // int count=0;
        // ListNode current=head;
        // while(current!=null){
        //     count++;
        //     current=current.next;
        // }
        // int toBeRemoved=(count-n)+1;
        // // if 1st element is to be deleted->edge case
        // if(toBeRemoved==1)          return head.next;
        // current=head;
        // count=0;
        // while(current!=null){
        //     count++;
        //     if(count==toBeRemoved-1){
        //         current.next=current.next.next;
        //         return head;
        //     }
        //     current=current.next;
        // }
        // return head;



        // optimised
        ListNode temp=new ListNode();
        temp.next=head;
        ListNode fast=temp;
        ListNode slow=temp;
        for(int i=1;i<=n;i++)       fast=fast.next;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return temp.next;
    }
    
}