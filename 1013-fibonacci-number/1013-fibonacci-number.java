class Solution {
    public int fib(int n) {
        //recursion
        // if(n<=1)            return n;
        // else                return fib(n-1)+fib(n-2);

        //dp

        int dp[]=new int[n+1];

        dp[0]=0;
        if(n>0)        dp[1]=1;
        for(int i=2;i<=n;i++)               dp[i]=dp[i-1]+dp[i-2];

        return dp[n];

    }
}