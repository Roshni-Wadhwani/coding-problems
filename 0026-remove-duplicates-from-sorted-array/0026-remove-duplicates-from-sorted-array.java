class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1,count=0;
        while(i<nums.length && j<nums.length){
            if(nums[i]==Integer.MAX_VALUE)      break;
            if(nums[i]==nums[j]){
                for(int k=j;k<nums.length-1;k++){
                    nums[k]=nums[k+1];
                }
                nums[nums.length-1]=Integer.MAX_VALUE;
            }
            else{
                i++;j++;
                count++;
            } 
        }
        if(nums[i]!=Integer.MAX_VALUE)  count+=1;
        // if(nums.length==1)          return 1;
        return count;
    }
}