//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solve(arr,n-1,dp);
    }
    int solve(int a[],int index,int dp[]){
        if(index==0)            return a[0];
        if(index==1)            return Math.max(a[0],a[1]);
        if(dp[index]!=-1)       return dp[index];
        else{
            int pick=solve(a,index-2,dp)+a[index];
            int not_pick=solve(a,index-1,dp)+0;
            return dp[index]=Math.max(pick,not_pick);
        }
    }
}