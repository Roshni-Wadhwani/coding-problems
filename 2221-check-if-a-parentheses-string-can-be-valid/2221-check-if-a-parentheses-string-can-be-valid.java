class Solution {

    public boolean canBeValid(String s, String locked) {
        int length = s.length();

        // If length of string is odd, return false.
        if (length % 2 == 1) {
            return false;
        }

        int openC=0,closeC=0,temp=0;
        for(int i=0;i<length;i++){
            if(locked.charAt(i)=='1'){
                if(s.charAt(i)=='(')        openC++;
                else                        openC--;
            }
            else                            temp++;

            if(openC<0) {
                temp--;
                openC++;
            }

            if(temp<0)                      return false;

        }
        temp=0;
        for(int i=length-1;i>=0;i--){
            if(locked.charAt(i)=='1'){
                if(s.charAt(i)==')')        closeC++;
                else                        closeC--;
            }
            else                            temp++;

            if(closeC<0) {
                temp--;
                closeC++;
            }

            if(temp<0)                      return false;

        }

        return true;
        
    }
}