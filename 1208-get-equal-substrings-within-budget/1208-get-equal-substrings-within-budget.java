class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int i=0;
        int diffAscii[]=new int[s.length()];
        
        while(i<s.length()){
            int ascii1=s.charAt(i);
            int ascii2=t.charAt(i);
            int diff=Math.abs(ascii1-ascii2);
            
            diffAscii[i]=diff;
            
            i++;
        }
        
        for(int j=0;j<diffAscii.length;j++) System.out.print(diffAscii[j]+" ");
        
        int maxLength=0;
        for(int j=0;j<diffAscii.length;j++){
            int k=j;//0
            int cost=0;//1
            while(k<diffAscii.length && cost<=maxCost){
                cost+=diffAscii[k];
                if(cost<=maxCost)   k++;
                else                break;
            }
            
            maxLength=Math.max(maxLength,(k-j));
        }
        return maxLength;
    }
        
}