class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min[]=new int[nums.length];
        int max[]=new int[nums.length];

        min[0]=nums[0];
        max[nums.length-1]=nums[nums.length-1];

        for(int i=1;i<nums.length;i++){
            min[i]=Math.min(nums[i-1],min[i-1]);
        }
        for(int i=nums.length-2;i>=0;i--){
            max[i]=Math.max(max[i+1],nums[i+1]);
        }

        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            if(min[i]<ele && max[i]>ele)        return true;
        }
        return false;
    }
}