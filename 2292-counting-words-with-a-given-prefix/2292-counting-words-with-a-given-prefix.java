class Solution {
    public boolean isPrefix(String word,String pref){
        if(pref.length()>word.length())         return false;
        for(int i=0;i<pref.length();i++){
            if(word.charAt(i)!=pref.charAt(i))          return false;
        }
        return true;
    }
    public int prefixCount(String[] words, String pref) {
        int ansCount=0;
        for(int i=0;i<words.length;i++){
            if(isPrefix(words[i],pref))            ansCount++;
        }
        return ansCount;
    }
}