class Solution {
    public int[] singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        int ans[]=new int[2];
        int j=0;
       
        int k=0;
        while(k<nums.length-1){
            if(nums[k]==nums[k+1])      k+=2;
            else{
                ans[j]=nums[k];
                j++;
                k++;
            }
        }
        if(j==1)        ans[j]=nums[k];
        
        return ans;
    }
}
