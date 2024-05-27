class Solution {
    public int returnXor(List<Integer>temp){
        int result=0;
        if(temp.isEmpty())          result= 0;
        for(int i=0;i<temp.size();i++){
            result=result^temp.get(i);
        }
        return result;
    }
    public int duplicateNumbersXOR(int[] nums) {
        
        HashMap<Integer,Integer>freq=new HashMap<>();
        List<Integer>li=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(freq.containsKey(num)){
                freq.put(num,freq.get(num)+1);
            }
            else    freq.put(num,1);
        }
        
        for(Map.Entry<Integer,Integer>map:freq.entrySet()){
            if(map.getValue()==2)      li.add(map.getKey());
        }
        return returnXor(li);
    }
}