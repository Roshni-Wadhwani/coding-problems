class Solution {
    public int search(int[] nums, int target) {
        HashMap<Integer,Integer>index=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            index.put(nums[i],i);
        }
        
        if(index.containsKey(target))        return index.get(target);
        return -1;
    }
}