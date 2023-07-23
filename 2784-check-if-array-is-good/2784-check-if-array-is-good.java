class Solution {
    public boolean isGood(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(Integer elem:nums)          max=Math.max(max,elem);
        
        if(nums.length!=max+1)          return false;
        else{
            int count=0;
            for(Integer elem:nums){
                if(elem==max)               count++;
            }
            if(count==2)                 return true;
            return false;
        }
        
    }
}