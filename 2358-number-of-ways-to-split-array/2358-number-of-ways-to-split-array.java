class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] prefixSum = new long[nums.length+1];
        long[] suffixSum = new long[nums.length+1];
        int validSplit = 0;

        //putting values for prefixSum
        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }

        //putting values for suffixSum
        for(int i=suffixSum.length-2;i>=0;i--){
            suffixSum[i] = suffixSum[i+1] + nums[i];
        }

        // for(int i=0;i<prefixSum.length;i++) System.out.print(prefixSum[i]+" ");
        // System.out.println();
        // for(int i=0;i<suffixSum.length;i++) System.out.print(suffixSum[i]+" ");


        for(int i=1;i<prefixSum.length-1;i++){
            if(prefixSum[i] >= suffixSum[i])         validSplit++;
        }

        return validSplit;
    }
}