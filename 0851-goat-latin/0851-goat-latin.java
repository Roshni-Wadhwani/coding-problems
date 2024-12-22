class Solution {
    public boolean isVowel(Character ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')                    return true;

        return false;
    }
    public String toGoatLatin(String sentence) {
        String[] words=sentence.split(" ");
        String finalAns="";

        for(int j=0;j<words.length;j++){
            String word=words[j];
            int flag=1;
            String ans="";

            if(isVowel(word.charAt(0)))         {
                ans+=word.charAt(0);    
                flag=0;
            }       
            for(int i=1;i<word.length();i++){
                ans+=word.charAt(i);           
            }
            if(flag==1)                         ans+=word.charAt(0);
            ans+="ma";

            for(int k=0;k<=j;k++)               ans+="a";

            finalAns+=ans+" ";
        }

        return finalAns.trim();
    }
}