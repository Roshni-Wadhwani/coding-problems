class Solution {
    public int maximumProduct(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-3]*nums[n-2]*nums[n-1]);
        
        
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        
        PriorityQueue<Integer>q1=new PriorityQueue<>();
        PriorityQueue<Integer>q2=new PriorityQueue<>(Collections.reverseOrder());
        
        for(Integer elem:nums)      {
            q1.add(elem);
            q2.add(elem);
        }
        
        // for(Integer elem:q1){
            min1=q1.remove();
            min2=q1.remove();
        // }
        
        // for(Integer elem:q2){
            max1=q2.remove();
            max2=q2.remove();
            max3=q2.remove();
        // }
         return Math.max(min1*min2*max1,max1*max2*max3);
    }
}