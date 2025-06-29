class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=i)              return i;
        // }

        // return nums.length;


        // Set<Integer> set = new HashSet<>();
        // for(int i=0;i<nums.length;i++)      set.add(nums[i]);

        // int checkNum =0;
        // while(set.contains(checkNum)){
        //     checkNum++;
        // }

        // return checkNum;

        // int n = nums.length;
        // long sum = ((long)n*(n+1))/2;
        // long tempSum=0;

        // for(int i=0;i<n;i++)        tempSum+=nums[i];

        // return (int)((int)sum)-(int)tempSum;


        int xor1 = 0; // all xor from 0 to n
        int xor2 = 0;// all xor -> all elements 

        for(int i=0;i<nums.length;i++){
            xor1=xor1^(i+1);
            xor2=xor2^nums[i];
        }
        return xor1^xor2;
    }
}