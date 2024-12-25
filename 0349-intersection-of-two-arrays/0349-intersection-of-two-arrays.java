class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int[] freqArr1 = new int[1001];
        int[] freqArr2 = new int[1001];

        for(int i=0;i<nums1.length;i++){
            int num=nums1[i];
            freqArr1[num]++;
        }

        for(int i=0;i<nums2.length;i++){
            int num=nums2[i];
            freqArr2[num]++;
        }

        List<Integer>li=new ArrayList<>();
        for(int i=0;i<=1000;i++){
            if(freqArr1[i]>0 && freqArr2[i]>0)          li.add(i);
        }

        int[] ans=new int[li.size()];
        for(int i=0;i<ans.length;i++)       ans[i]=li.get(i);

        return ans;
    }
}