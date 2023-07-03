class Solution {
    public String longestCommonPrefix(String[] strs) {
        int maxLength=strs[0].length();
        for(int i=0;i<strs.length;i++)  
            maxLength=Math.min(maxLength,strs[i].length());//4
        
        String ans="";
        for(int i=0;i<maxLength;i++){
            char temp=strs[0].charAt(i);//f
            boolean flag=true;
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=temp){
                    flag=false;break;
                }
            }
            if(flag)                ans+=temp;
            else                    break;
        }
        return ans;
    }
}