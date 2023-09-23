class Solution {
    public int lastOccurrence(int[] a,int low,int high,int target){
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]<target)              low=mid+1;
            else if(a[mid]>target)         high=mid-1;
            else    {
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }
    public int firstOccurrence(int a[],int low,int high,int target){
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(a[mid]<target)      low=mid+1;
            else                        high=mid-1;
        }
        return ans;
    }
    // public int[] searchRange(int[] nums, int target) {
        // int op[]=new int[2];
        // int min=Integer.MAX_VALUE;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         min=Math.min(i,min);
        //         max=Math.max(i,max);
        //     }
        // }
        // op[0]=min;op[1]=max;
        // if(min==Integer.MAX_VALUE && max==Integer.MIN_VALUE){
        //     op[0]=-1;
        //     op[1]=-1;
        // }
        // return op;
// }

        public int[] searchRange(int[] nums, int target){
            int ans[]=new int[2];
            ans[0]=firstOccurrence(nums,0,nums.length-1,target);
            ans[1]=lastOccurrence(nums,0,nums.length-1,target);
            return ans;
        }
}