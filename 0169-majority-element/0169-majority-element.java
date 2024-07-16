class Solution {
    public int majorityElement(int[] nums) {


        int ans=0;
        HashMap<Integer,Integer>freq=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i]))   {
                freq.put(nums[i],freq.get(nums[i])+1);
            }
            else{
                freq.put(nums[i],1);
            }
        }

        int n=nums.length;
        for(Map.Entry<Integer,Integer>map:freq.entrySet()){
            int key=map.getKey();
            int val=map.getValue();

            if(val>n/2)       {
                ans=key;
                break;
            }
        }

        return ans;
    }
}