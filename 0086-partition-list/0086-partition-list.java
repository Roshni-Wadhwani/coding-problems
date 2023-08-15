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
        curr1.next=null;
        curr2.next=null;
        
        ListNode temp1=head1.next;
        ListNode head3=new ListNode(1000);
        ListNode curr3=head3;

        while(temp1!=null){
            curr3.next=temp1;
            curr3=curr3.next;
            temp1=temp1.next;
        }
        ListNode temp2=head2.next;
        while(temp2!=null){
            curr3.next=temp2;
            curr3=curr3.next;
            temp2=temp2.next;
        }
        return head3.next;
    }
}