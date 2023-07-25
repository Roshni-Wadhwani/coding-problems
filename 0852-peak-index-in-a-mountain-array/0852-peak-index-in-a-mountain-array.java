class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
//         linear search
        // int i=0;
        // while(arr[i]<arr[i+1]) {
        //     i++;
        // }
        // return i;
        
//         binary search
        int left=0;
        int right=arr.length-1;
        
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]>arr[mid+1])     right=mid;
            else                        left=mid+1;
        }
        return left;
    }
}

