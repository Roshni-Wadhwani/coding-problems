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
import java.math.BigInteger;
class Solution {
    public ListNode doubleIt(ListNode head) {
        String given="";
        ListNode temp=head;

        while(temp!=null){
            given+=temp.val;
            temp=temp.next;
        }

        BigInteger bg=new BigInteger(given);
        BigInteger ansInt=bg.multiply(BigInteger.valueOf(2));
        char[] ansString=String.valueOf(ansInt).toCharArray();

        System.out.println(ansInt);

        int firstNum=Integer.parseInt(String.valueOf(ansString[0]));//3
        ListNode firstNode=new ListNode(firstNum);

        ListNode newHead=firstNode;

        for(int i=1;i<ansString.length;i++){
            int tempNum=Integer.parseInt(String.valueOf(ansString[i]));
            ListNode tempNode=new ListNode(tempNum);
            firstNode.next=tempNode;
            firstNode=firstNode.next;
        }
        return newHead;
    }
}