class Solution {
    public int countZeros(int i,int j, String s){
        int c=0;
        for(int p=i;p<=j;p++){
            if(s.charAt(p)=='0')        c++;
        }
        return c;
    }
    public int countOnes(int i,int j, String s){
        int c=0;
        for(int p=i;p<=j;p++){
            if(s.charAt(p)=='1')        c++;
        }
        return c;
    }
    public int maxScore(String s) {
        int i=0;
        int ans=0;

        // since empty string is not accepted so taken less than s.length()-1
        while(i<s.length()-1){
            int left=countZeros(0,i,s);
            int right=countOnes(i+1,s.length()-1,s);

            ans=Math.max(ans,left+right);
            i++;
        }

        return ans;
    }
}