class Solution {
    public boolean isMonotonic(int[] nums) {
        int first=nums[0];
        int last=nums[nums.length-1];

        boolean increasing=true;

        if(last<first)         increasing=false;

        if(increasing){
           for(int i=0;i<nums.length-1;i++){
               if(nums[i]>nums[i+1])        return false;
           }
           return true;
        }
        else{
            for(int i=0;i<nums.length-1;i++){
               if(nums[i]<nums[i+1])        return false;
            }
           return true;
        }
    }
}