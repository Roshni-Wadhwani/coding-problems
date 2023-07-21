class Solution {
    public static List<List<Integer>> op = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        op.clear();
        List<Integer> temp = new ArrayList<>();
        generateSubSeq(0, nums.length, nums, temp);
        return op;
    }
    
    public static void generateSubSeq(int s, int end, int[] nums, List<Integer> temp) {
        if (s == end) {
            op.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[s]);
        generateSubSeq(s + 1, end, nums, temp); 
        temp.remove(temp.size() - 1);
        generateSubSeq(s + 1, end, nums, temp); 
    }
}
