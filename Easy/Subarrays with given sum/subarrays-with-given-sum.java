//{ Driver Code Starts
import java.util.*; 
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int sum = sc.nextInt();
		    Solution ob=new Solution();
		    System.out.println(ob.subArraySum(arr,n,sum));
		}
	}
}


// } Driver Code Ends


class Solution
{ 
    public static int subArraySum(int[] arr, int n, int k)
    { 
        //code here.
        int pSum=0;
        int count=0;
        HashMap<Integer,Integer>freq=new HashMap<>();
        freq.put(0,1);
        
        for(Integer elem:arr){
            pSum+=elem;
            int diff=pSum-k;
            if(freq.containsKey(diff))          count+=freq.get(diff);
            
            if(freq.containsKey(pSum))      freq.put(pSum,freq.get(pSum)+1);
            else                            freq.put(pSum,1);
        }
        return count;
    }
}
  