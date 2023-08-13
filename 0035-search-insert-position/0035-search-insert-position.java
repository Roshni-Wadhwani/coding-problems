class Solution {
    public int searchInsert(int[] nums, int target) {

        // linear search
    //    int i=0;
    //    int n=nums.length;
    //    while(i<n && nums[i]<target)        i++;
    //    return i;


        // binary search
        return binarySearch(0,nums.length-1,nums,target);
    }

    public static int binarySearch(int start,int end,int a[],int k){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==k)                   return mid;
            if(a[mid]<k)                    start=mid+1;
            else                            end=mid-1;
        }
        return start;
    }
}