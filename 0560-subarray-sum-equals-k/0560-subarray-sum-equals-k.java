class Solution {
    public int subarraySum(int[] nums, int k) {
        // int[]prefixSum=new int[nums.length+1];
        // prefixSum[0]=0;
        // for(int i=1;i<prefixSum.length;i++){
        //     prefixSum[i]=prefixSum[i-1]+nums[i-1];
        // }

        // int count=0;
        // for(int i=0;i<prefixSum.length;i++){
        //     for(int j=i+1;j<prefixSum.length;j++){
        //         int sum=prefixSum[j]-prefixSum[i];
        //         if(sum==k)              count++;
        //     }
        // }
        // return count;


        int prefixSum=0,count=0;//1
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];//0
            int diff=prefixSum-k;//1
            if(map.containsKey(diff))       count+=map.get(diff);
            if(map.containsKey(prefixSum))                                 
                map.put(prefixSum,map.get(prefixSum)+1);
            else
                map.put(prefixSum,1);
        }
        return count;
    }
}