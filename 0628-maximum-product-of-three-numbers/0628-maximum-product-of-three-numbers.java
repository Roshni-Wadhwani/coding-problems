class Solution {
    public int maximumProduct(int[] nums) {
        
//         o(nlogn)
        // Arrays.sort(nums);
        // int n=nums.length;
        // return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-3]*nums[n-2]*nums[n-1]);
        
        
        
        
//         o(nlogn)
//         int min1=Integer.MAX_VALUE;
//         int min2=Integer.MAX_VALUE;
        
//         int max1=Integer.MIN_VALUE;
//         int max2=Integer.MIN_VALUE;
//         int max3=Integer.MIN_VALUE;
        
//         PriorityQueue<Integer>q1=new PriorityQueue<>();
//         PriorityQueue<Integer>q2=new PriorityQueue<>(Collections.reverseOrder());
        
//         for(Integer elem:nums)      {
//             q1.add(elem);
//             q2.add(elem);
//         }
        
//         min1=q1.remove();
//         min2=q1.remove();
        
//         max1=q2.remove();
//         max2=q2.remove();
//         max3=q2.remove();
        
//         return Math.max(min1*min2*max1,max1*max2*max3);
        
        
        
//         o(n)
        
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num>max1){
                max3=max2;
                max2=max1;
                max1=num;
            }
            else if(num>max2){
                max3=max2;
                max2=num;
            }
            else if(num>max3){
                max3=num;
            }
            if(num<min1){
                min2=min1;
                min1=num;
            }
            else if(num<min2){
                min2=num;
            }
        }
        return Math.max(max1*min1*min2,max1*max2*max3);
    }
}