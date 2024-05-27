class Solution {
    public int specialArray(int[] nums) {
        
        int maxElement=-1;
        for(int i=0;i<nums.length;i++){
            maxElement=Math.max(maxElement,nums[i]);
        }

        
        for(int i=1;i<=maxElement;i++){
            int count=0;
            int toBeSearched=i;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=toBeSearched)       count++;
            }
            if(count==toBeSearched)             return count;
        }
        
        return -1;
    }
}