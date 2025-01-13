class Solution {
    public int minimumLength(String s) {
        int freq[] = new int[26];
        int countAns=0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int asciiVal = (int)ch - 97;

            freq[asciiVal]+=1;
            if(freq[asciiVal]==3)           freq[asciiVal]-=2;

        }

        for(int i=0;i<freq.length;i++)      countAns+=freq[i];

        for(int i=0;i<freq.length;i++)      System.out.println(freq[i]);

        return countAns;
    }
}