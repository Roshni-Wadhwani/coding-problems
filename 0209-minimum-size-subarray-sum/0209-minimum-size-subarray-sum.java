class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // brute force
        // int ans=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     int len=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];//8
        //         len++;//4
        //         if(sum>=target)  {
        //            ans=Math.min(len,ans);
        //         }
        //     }
        // }
        // return (ans==Integer.MAX_VALUE)?0:ans;

        int l=0,r=0,ans=Integer.MAX_VALUE,sum=0;
        for(r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                sum-=nums[l];
                ans=Math.min(ans,(r-l+1));
                l++;
            }
        }
        return (ans==Integer.MAX_VALUE)?0:ans;
    }
}