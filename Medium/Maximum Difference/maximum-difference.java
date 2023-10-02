//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			Solution ob = new Solution();
			System.out.println(ob.findMaxDiff(a,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int findMaxDiff(int a[], int n)
    {
        Deque<Integer>stack=new ArrayDeque<>();
        int left[]=new int[n];
        int right[]=new int[n];
        
        for(int i=0;i<a.length;i++){
            
            while(!stack.isEmpty() && stack.peek()>=a[i])   stack.pop();
            
            if(stack.isEmpty())         left[i]=0;
            else                        left[i]=stack.peek();
            stack.push(a[i]);
        }
        
        stack.clear();
        for(int i=n-1;i>=0;i--){
            
            while(!stack.isEmpty() && stack.peek()>=a[i])   stack.pop();
            
            if(stack.isEmpty())         right[i]=0;
            else                        right[i]=stack.peek();
            stack.push(a[i]);
        }
        
        // for(int i=0;i<n;i++)    System.out.print(left[i]+" ");
        // System.out.println();
        // for(int i=0;i<n;i++)    System.out.print(right[i]+" ");
        
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)    ans=Math.max(ans,Math.abs(right[i]-left[i]));
        return ans;
    }
}