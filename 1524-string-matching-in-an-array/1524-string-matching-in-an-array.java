class Solution {
    
    public List<String> stringMatching(String[] words) {
        List<String>ans=new ArrayList<>();

        for(int i=0;i<words.length;i++){
            String word1=words[i];//od
            boolean included = false;
            for(int j=0;j<words.length;j++){
                String word2= words[j];//leetcoder
                if(word1.length()<word2.length()){
                    int p1=0 ;
                    while(p1<=(word2.length()-word1.length())){
                        if(word2.substring(p1,p1+word1.length()).equals(word1))  {
                            ans.add(word1);
                            included = true;
                            break;
                        }
                        else                                                     p1++;
                    }
                    if(included)                    break;
                }
            }              
            System.out.println(ans);
        }
        return ans;
    }
}