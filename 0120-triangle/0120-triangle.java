class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int n=triangle.get(m-1).size();

        int dp[][]=new int[m][n];
        for(int[] row:dp)              Arrays.fill(row,-1);

        return solve(triangle,dp,m,0,0);
    }

    public int solve(List<List<Integer>>t,int[][] dp,int bound,int r,int c){
        if(r==bound-1)            return t.get(bound-1).get(c);
        if(dp[r][c]!=-1)          return dp[r][c];

        int s=t.get(r).get(c)+solve(t,dp,bound,r+1,c);
        int d=t.get(r).get(c)+solve(t,dp,bound,r+1,c+1);

        return dp[r][c]=Math.min(s,d);
    }
}