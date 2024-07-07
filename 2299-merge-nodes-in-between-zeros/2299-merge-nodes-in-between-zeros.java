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
    public ListNode mergeNodes(ListNode head) {

        List<Integer>tmp=new ArrayList<>();

        ListNode curr=head.next;

        int ans=0;

        while(curr!=null){
            if(curr.val!=0)         ans+=curr.val;
            else{
                tmp.add(ans);
                ans=0;
            }
            curr=curr.next;
        }

        ListNode newHead=new ListNode(0);
        curr=newHead;

        for(int i=0;i<tmp.size();i++){
            ListNode newNode=new ListNode(tmp.get(i));
            curr.next=newNode;
            curr=curr.next;
        }
        return newHead.next;

        
    }
}