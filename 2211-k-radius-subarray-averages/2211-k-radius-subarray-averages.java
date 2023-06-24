class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        //System.out.println(n);
        int op[]=new int[nums.length];
        long cdf[]=new long[n+1];
        cdf[0]=0;
        for(int i=1;i<cdf.length;i++){
            cdf[i]=cdf[i-1]+nums[i-1];
        }
        int div=(2*k)+1;
        if(k==0)                    return nums;
        if(n<=k)  {
            for(int i=0;i<n;i++)            op[i]=-1;
        }
        else{
            for(int i=0;i<k;i++)            op[i]=-1;
            for(int i=k;i<n-k;i++){
                op[i]=(int)((cdf[i+k+1]-cdf[i-k])/div);
                //op[i]=((int)temp)/div;
            }
            for(int i=n-k;i<n;i++)          op[i]=-1;
            return op;
        }
        return op;
    }
}