class Solution {
    public int maxAscendingSum(int[] nums) {
        int i=1,maxAns=-1,ans=0;

        while(i<nums.length){
            ans+=nums[i-1];
            if(nums[i-1]>=nums[i])  {
                maxAns=Math.max(maxAns,ans);
                ans=0;
            }
            i++;         
        }
        ans+=nums[nums.length-1];
        maxAns=Math.max(maxAns,ans);
        return maxAns;

    }
}