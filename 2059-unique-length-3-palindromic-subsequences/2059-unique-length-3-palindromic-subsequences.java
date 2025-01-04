class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] firstIndex = new int[26];
        int[] lastIndex = new int[26];
        int[] flag = new int[26];

        for(int i=0;i<firstIndex.length;i++)    firstIndex[i] = -1;
        for(int i=0;i<lastIndex.length;i++)     lastIndex[i] = -1;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int ascii =(int) ch;
            int calVal = ascii-97;

            if(firstIndex[calVal]==-1)      firstIndex[calVal]=i;

            lastIndex[calVal]=i;
        }

        for(int i=0;i<firstIndex.length;i++)    System.out.print(firstIndex[i]+" ");
        System.out.println();
        for(int i=0;i<lastIndex.length;i++)     System.out.print(lastIndex[i]+" ");

        int cntAns = 0;
        for(int i=0;i<firstIndex.length;i++){
            int startIndex = firstIndex[i];
            int lIndex = lastIndex[i];

            HashSet<Character>set = new HashSet<>();
            for(int j=startIndex+1;j<lIndex;j++){
                // System.out.println("j: "+j);
                set.add(s.charAt(j));    
            }
            // System.out.println(set);
            cntAns+=set.size();
        }

        return cntAns;
    }
}
