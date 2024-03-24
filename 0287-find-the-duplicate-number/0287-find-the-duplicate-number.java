class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            if(freq.containsKey(number)){
                freq.put(number,freq.get(number)+1);
            }
            else{
                freq.put(number,1);
            }
        }
        
        int ans=0;
        for(Map.Entry<Integer,Integer>val:freq.entrySet()){
            int value=val.getValue();
            if(value!=1)        ans=val.getKey();
        }
        
        return ans;
    }
}