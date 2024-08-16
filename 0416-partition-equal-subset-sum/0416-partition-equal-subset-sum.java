class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum=doSum(nums);

        if(totalSum % 2 !=0)            return false;

        int dp[][]=new int[nums.length][(totalSum/2)+1];
        for(int r[]:dp)             Arrays.fill(r,-1);

        return checkPart(nums.length-1,nums,totalSum/2,dp);
    }
    public int doSum(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++)             sum+=a[i];
        return sum;
    }
    public boolean checkPart(int ind,int a[],int target,int dp[][]){
        if(target==0)                   return true;
        if(ind==0)                      return a[0]==target;

        if(dp[ind][target]!=-1)         return dp[ind][target]==0?false:true;

        boolean taken=false;
        if(target>=a[ind])
                    taken=checkPart(ind-1,a,target-a[ind],dp);
        boolean not_taken=checkPart(ind-1,a,target,dp);

        dp[ind][target]=taken||not_taken?1:0;
        return taken||not_taken;
    }
}