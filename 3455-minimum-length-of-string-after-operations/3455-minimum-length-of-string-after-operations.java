class Solution {
    public int minimumLength(String s) {
        int freq[] = new int[26];
        int countAns=0;

        for(int i=0;i<s.length();i++){

            int index = (int)s.charAt(i)-'a';

            freq[index]+=1;
            if(freq[index]==3)           freq[index]-=2;

        }

        for(int i=0;i<freq.length;i++)      countAns+=freq[i];

        return countAns;
    }
}