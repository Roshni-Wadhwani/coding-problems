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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        //if we are given heads of two list 
        //we can try searching if current.next is equal to null and get the last element
        //as soon as we get the last element we can connect that element to the first of next list
    ListNode head3=null;
	  ListNode temp3=null;
		if(head1==null)			return head2;
		else if(head2==null)		return head1;
	  else if(head1!=null && head2!=null && head1.val<head2.val){
	    head3=head1;
	    temp3=head1;
	    head1=head1.next;
	  }
	  else if(head1!=null && head2!=null && head1.val>=head2.val){
	    head3=head2;
	    temp3=head2;
	    head2=head2.next;
	  }
	   
	  while(temp3!=null && head1!=null && head2!=null){
	    if(head1.val<head2.val){
	      temp3.next=head1;
	      head1=head1.next;
	    }
	    else{
	      temp3.next=head2;
	      head2=head2.next;
	    }
	    temp3=temp3.next;
	  }
	  
	  while(temp3!=null && head1!=null){
	    temp3.next=head1;
	    head1=head1.next;
	    temp3=temp3.next;
	  }
	  while(temp3!=null && head2!=null){
	    temp3.next=head2;
	    head2=head2.next;
	    temp3=temp3.next;
	  }
	  return head3;
	}
}