class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        
        long addSum=0;
        
        int n=happiness.length;
        
        for(int i=0;i<k;i++){
            long temp=happiness[n-1-i]-i;
            if(temp>=0)      addSum+=temp;
        }
        
        return addSum;
    }
}