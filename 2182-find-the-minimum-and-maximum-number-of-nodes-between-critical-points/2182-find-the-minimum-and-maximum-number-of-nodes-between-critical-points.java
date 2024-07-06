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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] ans=new int[2];
        for(int i=0;i<ans.length;i++)           ans[i]=-1;

        List<Integer>indices=new ArrayList<>();
        
        ListNode prev=head;//5
        if(head.next==null)             return ans;
        ListNode current=head.next;
        int index=1;

        while(current.next!=null){
            if((current.val<prev.val && current.val<current.next.val) || (current.val>prev.val && current.val>current.next.val)){
                indices.add(index);
            }
            index++;
            prev=current;
            current=current.next;
        }

        System.out.println(indices);

        int tempMin=Integer.MAX_VALUE;

        for(int i=0;i<indices.size()-1;i++){
            tempMin=Math.min(indices.get(i+1)-indices.get(i),tempMin);
        }
        ans[0]=tempMin;

        int n=indices.size();
        if(indices.size()>=2)                ans[1]=indices.get(n-1)-indices.get(0);

        if(ans[0]==Integer.MAX_VALUE)       ans[0]=-1;

        return ans;
    }
}