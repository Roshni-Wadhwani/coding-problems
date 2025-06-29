class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=i)              return i;
        // }

        // return nums.length;


        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)      set.add(nums[i]);

        int checkNum =0;
        while(set.contains(checkNum)){
            checkNum++;
        }

        return checkNum;
    }
}