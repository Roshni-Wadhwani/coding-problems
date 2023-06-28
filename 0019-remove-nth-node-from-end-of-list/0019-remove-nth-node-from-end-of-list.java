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
        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        int toBeRemoved=(count-n)+1;//(5-5)+1=>1
        if(toBeRemoved==1)          return head.next;
        current=head;
        count=0;
        while(current!=null){
            count++;//1
            if(count==toBeRemoved-1){
                current.next=current.next.next;
                return head;
            }
            current=current.next;
        }
        return head;
    }
    
}