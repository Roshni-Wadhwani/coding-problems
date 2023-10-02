class Solution {
    public boolean winnerOfGame(String colors) {
        int i=0;int j=1;int k=2;
        int n=colors.length();
        
        int cA=0;
        int cB=0;
        
        while(i<n && j<n && k<n){
            if(colors.charAt(i)==colors.charAt(j) && colors.charAt(j)== colors.charAt(k) && colors.charAt(j)=='A'){
                cA++;
                k++;
            }
            else if(colors.charAt(i)==colors.charAt(j) && colors.charAt(j) ==colors.charAt(k) && colors.charAt(j)=='B'){
                cB++;
                k++;
            }
            else{
                i=j;
                j=k;
                k++;
            }
            // System.out.println("i: "+i+"j: "+j+"k: "+k+"cA: "+cA+"cB: "+cB);
        }
        
        if(cA>cB)           return true;
        return false;
    }
}