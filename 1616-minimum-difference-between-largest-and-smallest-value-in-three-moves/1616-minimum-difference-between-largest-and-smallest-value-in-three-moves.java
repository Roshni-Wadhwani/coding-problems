class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);

        int n=nums.length;
        int i=0;
        int j=(n-1)-3;
        int ans=Integer.MAX_VALUE;

        if(nums.length<=4)      return 0;

        while(i<4){
            ans=Math.min(ans,nums[j]-nums[i]);
            i++;
            j++;
        }

        return ans;
    }
}