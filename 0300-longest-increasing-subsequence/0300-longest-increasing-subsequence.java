class Solution {
//     public static List<List<Integer>>op=new ArrayList<>();
//     public static int max=Integer.MIN_VALUE;
    
//     public int lengthOfLIS(int[] nums) {
//         op.clear();
//         max=Integer.MIN_VALUE;
//         ArrayList<Integer>temp=new ArrayList<>();
//         printSubsequences(nums,0,nums.length,temp);
//         // System.out.println(op);
//         return max;
//     }
//     public static void printSubsequences(int[] n,int s,int end,List<Integer>temp){
//         if(s==end){
//             List<Integer>t=new ArrayList<>();
//             t.addAll(temp);
//             if(increasing(t))           op.add(t);
//             return;
//         }
//         temp.add(n[s]);
//         printSubsequences(n,s+1,end,temp);
//         temp.remove(temp.size()-1);
//         printSubsequences(n,s+1,end,temp);
//     }
    
//     public static boolean increasing(List<Integer>temp){
//         int i=0;int j=1;
//         while(i<temp.size() && j<temp.size()){
//             if(temp.get(i)>=temp.get(j))                     return false;
//             i++;j++;
//         }
//         max=Math.max(max,temp.size());
//         return true;
//     }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n][n+1];
        for(int[] row:dp)           Arrays.fill(row,-1);
        return callRec(0,-1,nums,dp);
    }
    // public static int callRec(int cI,int pI,int[] n){
    //     if(cI==n.length)            return 0;
    //     int len=0+callRec(cI+1,pI,n);
    //     if(pI==-1||n[cI]>n[pI])   
    //         len=Math.max(len,1+callRec(cI+1,cI,n));
    //     return len;
    // }
    public static int callRec(int cI,int pI,int[] n, int[][]dp){
        if(cI==n.length)            return 0;
        if(dp[cI][pI+1]!=-1)        return dp[cI][pI+1];
        int len=0+callRec(cI+1,pI,n,dp);
        if(pI==-1||n[cI]>n[pI]){
            len=Math.max(len,1+callRec(cI+1,cI,n,dp));
        }
        return dp[cI][pI+1]=len;
    }
   
}