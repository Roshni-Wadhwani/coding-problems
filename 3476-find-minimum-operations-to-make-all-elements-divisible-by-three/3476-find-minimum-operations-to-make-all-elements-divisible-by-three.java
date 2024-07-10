class Solution {
    public int minimumOperations(int[] nums) {

        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            if((number+1)%3==0 || (number-1)%3==0)          cnt++;
        }
        return cnt;
    }
}