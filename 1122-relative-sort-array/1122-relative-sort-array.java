class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        //finding max element
        int maxEle=-1;
        for(int i=0;i<arr1.length;i++)      maxEle=Math.max(maxEle,arr1[i]);
        
        int freq[]=new int[maxEle+1];
        
        for(int i=0;i<arr1.length;i++){
            int num=arr1[i];
            freq[num]++;
        }
        
        int ans[]=new int[arr1.length];
        int cntr=0;
        
        for(int i=0;i<arr2.length;i++){
            int num=arr2[i];//2
            int temp=freq[num];//3
            
            for(int j=0;j<temp;j++){
                ans[cntr]=num;
                cntr++;
                freq[num]--;
            }
        }
       
        
        for(int i=0;i<=maxEle;i++){
            int f=freq[i];
            
            for(int j=0;j<f;j++){
                ans[cntr]=i;
                cntr++;
                freq[i]--;
            }
        }
        
        
        return ans; 
        
    }
}