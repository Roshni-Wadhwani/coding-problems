//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        
        // your code here
        return solve(n,dp);
    }
    
    int solve(int n,int dp[]){
        int mod=(1000000000+7);
        if(n<=1)                    return 1;
        if(dp[n]!=-1)               return dp[n];
        int left=solve(n-1,dp);
        int right=solve(n-2,dp);
        return dp[n]=((left%mod)+(right%mod))%mod;
    }
}
// 1   1   1   1
// 1   2   1
// 2   2
// 2   1   1
// 1   1   2

