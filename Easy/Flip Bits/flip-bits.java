//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maxOnes(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int maxOnes(int a[], int n) {
        // Your code goes here
        // int count=0;
        // int ans=0;
        // for(int i=0;i<n;i++){
        //     if(a[i]==1)             count++;
        //     int countZero=0;
        //     int countOne=0;
        //     for(int j=i;j<n;j++){
        //         if(a[j]==0)             countZero++;//3
        //         else                    countOne++;//2
        //         ans=Math.max(ans,countZero-countOne);//1
        //         if(countZero<0)         countZero=0;
        //     }
        // }
        // return count+ans;
        
        
        int count=0;
        int one=0;
        int max=0;
        
        for(int i=0;i<n;i++){
            if(a[i]==0)                 count++;
            else{
                count--;
                one++;
                if(count<0)             count=0;
            }
            max=Math.max(max,count);
        }
        return max+one;
    }
}
