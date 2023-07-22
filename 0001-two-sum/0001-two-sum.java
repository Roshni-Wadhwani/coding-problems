class Solution {
    public int[] twoSum(int[] nums, int target) {
        
//         Brute force
        // int[] ans=new int[2];
        // for(int i=0;i<nums.length;i++){
        //     int num1=nums[i];
        //     for(int j=i+1;j<nums.length;j++){
        //         int num2=nums[j];
        //         if(num1+num2==target){
        //             ans[0]=i;
        //             ans[1]=j;
        //             return ans;
        //         }
        //     }
        // }
        // return ans;
        
        
        
//         optimal
        HashMap<Integer,Integer>index=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(index.containsKey(diff)){
                ans[0]=index.get(diff);ans[1]=i;return ans;
            }
            else{
                index.put(nums[i],i);
            }
        }
        return ans;
    }
}