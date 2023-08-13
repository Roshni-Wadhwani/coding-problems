class Solution {
    public int searchInsert(int[] nums, int target) {

        // linear search
       int i=0;
       int n=nums.length;
       while(i<n && nums[i]<target)        i++;
       return i;


    // binary search

    }
}