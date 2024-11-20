import java.util.HashSet;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        long sum = 0, maxSum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            // Ensure the window only contains unique elements
            while (set.contains(nums[end])) {
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }

            // Add current element to the window
            set.add(nums[end]);
            sum += nums[end];

            // Check if the window size equals k
            if (end - start + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                // Slide the window by removing the leftmost element
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
        }

        return maxSum;
    }
}
