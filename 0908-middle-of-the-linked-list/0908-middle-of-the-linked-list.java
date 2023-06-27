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
        int countNodes=0;
        ListNode current=head;
        while(current!=null){
            countNodes++;
            current=current.next;
        }
        int mid=(countNodes)/2;
        mid+=1;
        current=head;
        for(int i=0;i<mid-1;i++){
            current=current.next;
        }
        return current;
    }
}