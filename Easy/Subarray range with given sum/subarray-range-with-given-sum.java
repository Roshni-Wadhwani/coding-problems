//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;

class Driverclass
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
    		    System.out.println(new Solution().subArraySum(arr, n, sum));
    		    
    		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int n, int sum)
    {
        // add your code here
        // brute force
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     int tempSum=0;
        //     for(int j=i;j<arr.length;j++){
        //         tempSum+=arr[j];
        //         if(tempSum==sum)            count++;
        //     }
        // }
        // return count;
        
        
        
        // optimization
        int pSum=0;
        int count=0;//3
        HashMap<Integer,Integer>freq=new HashMap<>();
        
        freq.put(0,1);
        // (1,1),(3,1),(6,1),
        
        for(Integer elem:arr){
            pSum+=elem;//3
            int diff=pSum-sum;//0
            if(freq.containsKey(diff)){
                count+=freq.get(diff);
            }
            if(freq.containsKey(pSum))  freq.put(pSum,freq.get(pSum)+1);
            else                        freq.put(pSum,1);
        }
        return count;
    }
}