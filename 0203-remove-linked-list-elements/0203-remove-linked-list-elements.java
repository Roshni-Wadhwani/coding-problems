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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=new ListNode();
        temp.next=head;
        ListNode current=head;
        ListNode prev=temp;
        while(current!=null){
            if(current.val==val){
                prev.next=current.next;
                current=current.next;
            }
            else{
                current=current.next;
                prev=prev.next;
            }
        }
        return temp.next;
    }
}