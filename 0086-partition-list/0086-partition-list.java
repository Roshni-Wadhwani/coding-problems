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
    public ListNode partition(ListNode head, int x) {
        ListNode head1=new ListNode(1000);
        ListNode head2=new ListNode(1000);
        ListNode curr1=head1;
        ListNode curr2=head2;
        ListNode current=head;

        while(current!=null){
            if(current.val<x){
                curr1.next=current;
                curr1=curr1.next;
            }
            else{
                curr2.next=current;
                curr2=curr2.next;
            }
            current=current.next;
        }
        curr1.next=head2.next;
        curr2.next=null;

        return head1.next;
    }
}