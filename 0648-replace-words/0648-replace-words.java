class Solution {
    public boolean check(String w1,String w2){
        int i=0,j=0;
        while(i<w1.length() && j<w2.length()){
            if(w1.charAt(i)==w2.charAt(j)){
                i++;j++;
            }
            else        return false;
        }
        if(w1.length()<w2.length())     return false;
        return true;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        String [] words=sentence.split(" ");
        HashMap<String,String>dict=new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            String word1=words[i];//cattle
            for(int j=0;j<dictionary.size();j++){
                String word2=dictionary.get(j);//cat
                if(check(word1,word2))  {
                    if(dict.containsKey(word1)){
                        if(dict.get(word1).length()<word2.length()){
                            dict.put(word1,dict.get(word1));
                        }
                        else{
                            dict.put(word1,word2);
                        }
                    }
                    else        dict.put(word1,word2);
                }
            }
        }
        
        String ans="";
        for(int i=0;i<words.length;i++){
            if(dict.containsKey(words[i]))      ans+=dict.get(words[i]);
            else                                ans+=words[i];
            ans+=" ";
        }
        
        return ans.strip();
    }
}