class Solution {
    public int[] arrayRankTransform(int[] arr) {
        List<Integer>nums=new ArrayList<>();
        for(Integer num:arr)        nums.add(num);
        Collections.sort(nums);

        HashMap<Integer,Integer>index=new HashMap<>();
        int ptr=0;

        for(int i=0;i<nums.size();i++){
            if(!index.containsKey(nums.get(i)))     {
                index.put(nums.get(i),ptr);
                ptr++;
            }
        }
        int ans[]=new int[arr.length];

        int k=0;
        for(Integer elem:arr){
            int val=index.get(elem);   
            ans[k]=(val+1);
            k++;
        }

        return ans;
    }
}
