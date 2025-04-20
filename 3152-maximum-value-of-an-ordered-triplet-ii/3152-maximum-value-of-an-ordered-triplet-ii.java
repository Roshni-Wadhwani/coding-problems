class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], nums[i - 1]);
            rightMax[n - 1 - i] = Math.max(rightMax[n - i], nums[n - i]);
        }
        // for(int i=0;i<leftMax.length;i++)   System.out.print(leftMax[i]+"  ");
        // System.out.println();
        // for(int i=0;i<rightMax.length;i++)   System.out.print(rightMax[i]+"  ");
        // System.out.println();

        long ans = 0;
        for (int j = 1; j < n - 1; j++) {
            ans = Math.max(ans, (long) (leftMax[j] - nums[j]) * rightMax[j]);
        }
        return ans;
    }
}

