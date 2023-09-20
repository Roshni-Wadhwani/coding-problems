class Solution {
    public int minOperations(int[] nums, int x) {
        HashMap<Integer,Integer>pSum=new HashMap<>();
        pSum.put(0,0);
        int prefixSum=0;

        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            pSum.put(prefixSum,(i+1));
        }

        HashMap<Integer,Integer>sSum=new HashMap<>();
        sSum.put(0,nums.length);
        int suffixSum=0;

        for(int i=nums.length-1;i>=0;i--){
            suffixSum+=nums[i];
            sSum.put(suffixSum,i);
        }

        // System.out.println(pSum);
        // System.out.println(sSum);

        if(prefixSum<x)              return -1;
        int minOp=Integer.MAX_VALUE;

        for(Integer key1:pSum.keySet()){            
            int val1=pSum.get(key1);//1
            if(sSum.containsKey(x-key1)){
                int val2=sSum.get(x-key1);
                minOp=Math.min(minOp,val1+(nums.length-val2));
            }
        }
        if(minOp==Integer.MAX_VALUE)            return -1;
        return minOp;
    }
}