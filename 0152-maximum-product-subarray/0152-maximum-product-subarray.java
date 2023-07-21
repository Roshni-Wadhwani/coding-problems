class Solution {
    public int maxProduct(int[] nums) {
        
//         o(N2)
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int pr=1;
        //     for(int j=i;j<nums.length;j++){
        //         pr*=nums[j];
        //         max=Math.max(pr,max);
        //     }
        // }
        // return max;
        
        
//         O(N)
        int prefix=1;
        int suffix=1;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(prefix==0)           prefix=1;
            if(suffix==0)           suffix=1;
            prefix=prefix*nums[i];
            suffix=suffix*nums[nums.length-1-i];
            max=Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}