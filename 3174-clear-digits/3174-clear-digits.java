class Solution {
    
    public int getIndexDig(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'a' || s.charAt(i)>'z')  return i;
        }
        return -1;
    }
    
    public int getIndexChar(String s, int index){
        for(int i=index-1;i>=0;i--){
            if(s.charAt(i)>='a' && s.charAt(i)<='z')    return i;
        }
        return -1;
    }
    
    public String clearDigits(String s) {
        int digIndex=0;
        int charIndex=0;
        
        while(digIndex>=0 && charIndex>=0){
            digIndex=getIndexDig(s);//0
            
            if(digIndex==-1)        return s;
            else{
                charIndex=getIndexChar(s,digIndex);//1
                
                if(charIndex==-1)       return s;
                else{
                    String temp="";
                    for(int i=0;i<s.length();i++){
                        if(i!=charIndex && i!=digIndex)     temp+=s.charAt(i);
                    }
                    s=temp;
                }
                System.out.println(digIndex+" "+charIndex+" "+s);
            }
        }
        
        return s;
    }
}