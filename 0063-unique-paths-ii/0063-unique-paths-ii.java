class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;

        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return solve(obstacleGrid,dp,m-1,n-1);
    }

    public static int solve(int a[][],int dp[][],int r,int c){

        if(r>=0 && c>=0 && a[r][c]==1)      return 0;
        if(r==0&&c==0)                      return 1;
        if(r<0||c<0)                        return 0;
        if(dp[r][c]!=-1)                    return dp[r][c];

        int up=solve(a,dp,r-1,c);
        int left=solve(a,dp,r,c-1);

        return dp[r][c]=up+left;
    }
}