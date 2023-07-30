class Solution {
    public String reverseOnlyLetters(String s) {
        char b[]=s.toCharArray();
        String ans="";
        int i=0;
        int j=b.length-1;
        while(i<j){
            char ch1=b[i];
            char ch2=b[j];
            int ascii_one=ch1;
            int ascii_two=ch2;
            if(ascii_one>=65 && ascii_one<=90||ascii_one>=97 && ascii_one<=122){
                if(ascii_two>=65 && ascii_two<=90||ascii_two>=97 && ascii_two<=122){
                    char temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else{
                if(ascii_two>=65 && ascii_two<=90||ascii_two>=97 && ascii_two<=122){
                    i++;
                }
                else{
                    i++;j--;
                }
            }
        }
        for(int k=0;k<b.length;k++)         ans=ans+b[k];
        return ans;
    }
}