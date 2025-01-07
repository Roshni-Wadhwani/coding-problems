class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[]=new int[s.length()];
        List<Integer>indices = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)      indices.add(i);
        }

        for(int i=0;i<s.length();i++){
            int minAns=Integer.MAX_VALUE;
            for(int j=0;j<indices.size();j++){
                int diffOfIndices = Math.abs(indices.get(j)-i);
                minAns=Math.min(diffOfIndices,minAns);
            }
            ans[i]=minAns;
        }
        return ans;
    }
}