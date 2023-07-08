class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        HashMap<Integer,Integer>index=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            index.put(nums2[i],i);
        }
        // {1:0;3:1;4:2;2:3}
        for(int i=0;i<nums1.length;i++){
            int elem=nums1[i];//1
            if(index.containsKey(elem)){
                int indexx=index.get(elem);//0
                int maxi=elem;//1
                for(int j=indexx+1;j<nums2.length;j++){
                    if(nums2[j]>maxi)    {
                        maxi=nums2[j];break;
                    }
                }
                ans[i]=(maxi==elem)?-1:maxi;
            }
        }
        return ans;
    }
}