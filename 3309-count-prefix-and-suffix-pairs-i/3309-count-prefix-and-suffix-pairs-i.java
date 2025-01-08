class Solution {
    public boolean prefixWord(String w1, String w2){
        for(int i=0;i<w1.length();i++){
            if(w2.charAt(i)!=w1.charAt(i))          return false;
        }
        return true;
    }
    public boolean suffixWord(String w1,String w2){
        int j=w2.length()-1;
        for(int i=w1.length()-1;i>=0;i--){
            if(w2.charAt(j)!=w1.charAt(i))          return false;
            else                                    j--;
        }
        return true;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String word1=words[i];
            for(int j=i+1;j<words.length;j++){
                String word2=words[j];
                if(word1.length()<=word2.length()){
                    if(prefixWord(word1,word2) && suffixWord(word1,word2))      count++;
                }
            }
        }
        return count;
    }
}