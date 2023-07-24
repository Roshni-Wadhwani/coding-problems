class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer>freq1=new HashMap<>();
        for(Integer elem:nums){
            if(freq1.containsKey(elem)) 
                freq1.put(elem,freq1.get(elem)+1);
            else    freq1.put(elem,1);
        }
        int max=0;
        for(Map.Entry<Integer,Integer>map:freq1.entrySet()){
            int val=map.getValue();
            max=Math.max(max,val);       
        }
        HashMap<Integer,Integer>left=new HashMap<>();
        HashMap<Integer,Integer>right=new HashMap<>();
        HashMap<Integer,Integer>count=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            if(!left.containsKey(number))   left.put(number,i);
            right.put(number,i);
            count.put(number,count.getOrDefault(number,0)+1);
        }
        
        int ans=nums.length;
        for(int key:count.keySet()){
            if(count.get(key)==max){
                ans=Math.min(ans,right.get(key)-left.get(key)+1);
            }
        }
        return ans;
    }
}