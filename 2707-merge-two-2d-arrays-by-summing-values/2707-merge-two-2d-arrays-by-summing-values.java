class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i][0],nums1[i][1]);
        }

        for(int i=0;i<nums2.length;i++){
            int k=nums2[i][0];
            if(map.containsKey(k)){
                int v=map.get(k);
                map.put(k,v+nums2[i][1]);
            }
            else                            map.put(nums2[i][0],nums2[i][1]);
        }

        System.out.println(map);

        int[][] ans=new int[map.size()][2];
        int k=0;

        for(Map.Entry<Integer,Integer>m:map.entrySet()){
            ans[k][0]=m.getKey();
            ans[k][1]=m.getValue();
            k++;
        }

        Arrays.sort(ans, (a,b)->Integer.compare(a[0],b[0]));
        return ans;
    }
}