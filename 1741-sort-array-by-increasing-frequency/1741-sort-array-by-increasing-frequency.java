class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>freq=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num=nums[i];

            if(freq.containsKey(num))       freq.put(num,freq.get(num)+1);
            else                            freq.put(num,1);
        }

        List<Map.Entry<Integer,Integer>>li=new ArrayList<>(freq.entrySet());
        Collections.sort(li,(a,b)->{
            if(a.getValue().equals(b.getValue()))   return b.getKey()-a.getKey();
            else                                    return a.getValue()-b.getValue();
        });

        int[] ans=new int[nums.length];

        // System.out.println(li);
        int index=0;
        for(Map.Entry<Integer,Integer>temp:li){
            int k=temp.getKey();//3
            int c=temp.getValue();//1

            while(c>0){
                ans[index]=k;
                c--;
                index++;
            }
        }
        return ans;
    }
}