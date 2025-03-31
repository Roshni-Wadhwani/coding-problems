class Solution {
    public int searchZeroIndex(int nums[],int s,int e){
        for(int i=s;i<e;i++){
            if(nums[i]==0)              return i;
        }
        return -1;
    }

    public int searchNonZeroIndex(int n[],int s,int e){
        for(int i=s;i<e;i++){
            if(n[i]>0)                  return i;
        }
        return -1;
    }
    public int[] applyOperations(int[] nums) {
        int i=0;
        int j=1;
        int n=nums.length;

        while(i<n && j<n){
            if(nums[i]==nums[j]){
                nums[i]*=2;
                nums[j]=0;
            }
            i++;
            j++;
        }

        // for(int r=0;r<nums.length;r++)      System.out.print(nums[r]+"  ");

        for(int k=0;k<nums.length;k++){
            int zeroIndex=searchZeroIndex(nums,0,n);//2
            int nonZeroIndex=searchNonZeroIndex(nums,k,n);//3

            if(zeroIndex<0 || nonZeroIndex<0)       return nums;
            else if(nonZeroIndex>zeroIndex){
                int temp=nums[nonZeroIndex];
                nums[nonZeroIndex]=nums[zeroIndex];
                nums[zeroIndex]=temp;
            }
        }

        return nums;
    }
}
// [1,4,0,2,0,0]
// 2,4,5
// 0,1,3