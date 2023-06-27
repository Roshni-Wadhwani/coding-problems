class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length==0)             return;
        if(nums1.length==0){
            for(int i=0;i<nums2.length;i++)     nums1[i]=nums2[i];
            return;
        }
        int j=0;
        for(int i=0;i<m;i++){
            if(nums1[i]>nums2[j]){
                int temp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
                Arrays.sort(nums2);
            }
        }
        int k=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[k];
            k++;
        } 
    }
}