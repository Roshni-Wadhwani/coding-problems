class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }
            else        freq.put(nums[i],1);
        }
        for(Map.Entry<Integer,Integer>map:freq.entrySet()){
            if(map.getValue()==1)       return map.getKey();
        }
        return 0;
    }
}