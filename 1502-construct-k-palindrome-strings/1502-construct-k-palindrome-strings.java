class Solution {
    public boolean canConstruct(String s, int k) {
        int freq[]  =   new int[26];
        for(int i=0;i<s.length();i++){
            char ch =   s.charAt(i);
            int asciiMod    =   (int)ch-97;
            freq[asciiMod]  +=  1;
        }

        int oddC=0, evenC=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0)  {
                if(freq[i]%2==0)            evenC++;
                else                        oddC++;
            }
        }

        if(s.length()<k)            return false;
        if(oddC<=k)                 return true;
        else{
            if(s.length()%k==0){
                for(int i=0;i<freq.length;i++)  {
                    if(freq[i]!=k)              return false;
                }
                return true;
            }
        }
        return false;
    }
}