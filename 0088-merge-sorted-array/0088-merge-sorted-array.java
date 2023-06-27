class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length==0)             return;
        if(nums1.length==0){
            for(int i=0;i<nums2.length;i++)     nums1[i]=nums2[i];
            return;
        }
        int j=0;
        for(int i=0;i<m;i++){
            //checking whether elem of nums1 is greater than nums2[0]
            //if greater swap such that we get elements in nums1 sorted
            if(nums1[i]>nums2[j]){
                int temp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
                //after swap, the elements are not in sorted order in nums2
                Arrays.sort(nums2);
            }
        }
        int k=0;
        //adding all elements of nums2 to nums1 as they are sorted
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[k];
            k++;
        } 
    }
}