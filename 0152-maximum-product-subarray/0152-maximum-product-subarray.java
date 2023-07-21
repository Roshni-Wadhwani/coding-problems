class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int pr=1;
            for(int j=i;j<nums.length;j++){
                pr*=nums[j];
                max=Math.max(pr,max);
            }
        }
        return max;
    }
}