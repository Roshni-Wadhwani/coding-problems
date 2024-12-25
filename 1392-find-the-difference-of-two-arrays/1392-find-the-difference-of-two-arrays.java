class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>firstList=new ArrayList<>();
        List<Integer>secondList=new ArrayList<>();

        for(int i=0;i<nums1.length;i++)             set1.add(nums1[i]);
        for(int i=0;i<nums2.length;i++)             set2.add(nums2[i]);

        for(Integer num:set1){
            if(set2.contains(num))                  {}
            else                                    firstList.add(num);
        }
        ans.add(firstList);

        for(Integer num:set2){
            if(set1.contains(num))                  {}
            else                                    secondList.add(num);
        }
        ans.add(secondList);


        return ans;
    }
}