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
        int j= s.length();//6
        int ans=0;

        while(i<j && i<s.length()){
            int left=countZeros(0,i,s);
            int right=countOnes(i+1,j-1,s);

            // System.out.println("left: "+left);
            // System.out.println("right: "+right);

            ans=Math.max(ans,left+right);
            // System.out.println("ans: "+ans);
            i++;

            if(i==j-1)              break;
        }

        return ans;
    }
}