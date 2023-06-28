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
        // brute force checking every node of first linked list 
        // with every node of second to check if they are equal
        // ListNode current1=headA; 
        // while(current1!=null){
        //     ListNode current2=headB;
        //     while(current2!=null){
        //         if(current1==current2)          return current1;
        //         current2=current2.next;
        //     }
        //     current1=current1.next;
        // }
        // return null;


        // OPTIMISED
        // calculate length of first ll and second
        // whatever is difference traverse that no of nodes
        // both are at same index in respective ll
        // check if they are same.. 
        int c1=0,c2=0;
        ListNode current1=headA;
        ListNode current2=headB;
        while(current1!=null){
            c1++;
            current1=current1.next;
        }
        while(current2!=null){
            c2++;
            current2=current2.next;
        }
        current1=headA;current2=headB;
        if(c1<c2){
            int diff=c2-c1;
            for(int i=0;i<diff;i++)     current2=current2.next;
        }
        else{
            int diff=c1-c2;
            for(int i=0;i<diff;i++)     current1=current1.next;
        }

        while(current1!=null||current2!=null){
            if(current1==current2)          return current1;
            current1=current1.next;
            current2=current2.next;
        }
        return null;
    }
}