class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer>freq=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int numb=nums[i];
            if(freq.containsKey(numb))  freq.put(numb,freq.get(numb)+1);
            else                        freq.put(numb,1);
        }

        int pairsFormed=0;
        int leftOver=0;

        for(Map.Entry<Integer,Integer>map:freq.entrySet()){
            int v=map.getValue();
            pairsFormed+=(v/2);
            if(v%2==1)              leftOver+=1;
        }

        int ans[]=new int[2];
        ans[0]=pairsFormed;
        ans[1]=leftOver;

        return ans;
    }
}