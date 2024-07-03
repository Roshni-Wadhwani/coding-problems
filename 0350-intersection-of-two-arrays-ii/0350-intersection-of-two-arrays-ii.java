class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0;
        int j=0;
        int k=0;
        
        int n1=nums1.length;
        int n2=nums2.length;
        
        int ans[]=new int[n2];
        
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
                ans[k]=nums1[i];
                k++;i++;j++;
            }
            else{
                if(nums1[i]<nums2[j])   i++;
                else                    j++;
            }
        }
        
        int finalAns[]=new int[k];
        
        for(int r=0;r<k;r++)    finalAns[r]=ans[r];
        
        return finalAns;
        
    }
}