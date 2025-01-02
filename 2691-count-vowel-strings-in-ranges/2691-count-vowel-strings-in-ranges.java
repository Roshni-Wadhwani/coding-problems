class Solution {
    public boolean isVowel(Character ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')     return true;
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {

        int[] prefixSum = new int[words.length+1];
        int []ans = new int[queries.length];

        for(int i=0;i<words.length;i++){
            String word=words[i];
            boolean first=isVowel(word.charAt(0));
            boolean last=isVowel(word.charAt(word.length()-1));

            if(first && last)       prefixSum[i+1]=prefixSum[i]+1;
            else                    prefixSum[i+1]=prefixSum[i]+0;
        }

        for(int i=0;i<queries.length;i++){
            int startIndex = queries[i][0];
            int lastIndex = queries[i][1];

            ans[i]=prefixSum[lastIndex+1]-prefixSum[startIndex];

        }
        return ans;
    }
}