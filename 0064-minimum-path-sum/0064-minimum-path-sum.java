class Solution {
    public int minPathSum(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)        dp[i][j]=-1;
        }

        return ans(grid,dp,m-1,n-1);
    }

    public static int ans(int grid[][],int dp[][],int r,int c){ 
        if(r==0 && c==0)                    return grid[r][c];                  
        if(r<0 || c<0)                      return (int)(1e9);
        if(dp[r][c]!=-1)                    return dp[r][c];
        
        int left=grid[r][c]+ans(grid,dp,r,c-1);
        int up=grid[r][c]+ans(grid,dp,r-1,c);
        return dp[r][c]=Math.min(left,up);
    }
}