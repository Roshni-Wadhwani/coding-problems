class Solution {
    public int[] arrayRankTransform(int[] arr) {
        List<Integer>nums=new ArrayList<>();

        for(Integer num:arr)        nums.add(num);

        Collections.sort(nums);

        // [10,20,30,40]
        HashMap<Integer,Integer>index=new HashMap<>();
        int ptr=0;

        for(int i=0;i<nums.size();i++){
            if(!index.containsKey(nums.get(i)))     {
                index.put(nums.get(i),ptr);
                ptr++;
            }
        }
        // System.out.println(nums);
        // System.out.println(index);
        // {10:1, 20:2, 30:3. 40:4}
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
