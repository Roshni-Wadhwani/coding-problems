class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return callRecursion(0,0,m,n,dp);
    }
    public static int callRecursion(int i,int j,int x,int y,int dp[][]){
        if(i>=x||j>=y)                return 0;
        if(i==x-1 && j==y-1)          return 1;
        if(dp[i][j]!=-1)              return dp[i][j];
        return dp[i][j]=callRecursion(i+1,j,x,y,dp)+callRecursion(i,j+1,x,y,dp);
    }
}