class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int ans=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0)            ans+=customers[i];
        }
        
        int maxAns=0;
        for(int i=0;i<=customers.length-minutes;i++){
            int tempAns=0;
            for(int j=i;j<i+minutes;j++)   {
                if(grumpy[j]==1){
                    tempAns+=customers[j];
                }
            }
            
            maxAns=Math.max(tempAns,maxAns);
        }
        ans+=maxAns;
        
        return ans;
    }
}
/*
n=8
customers = [1,0,1,2,1,1,7,5], 
grumpy =    [0,1,0,1,0,1,0,1], 
minutes = 3

1+1+1+7+6=16
*/
// jabi wo grumpy hai mtlb array m 1 hai tabi customers are not satisfied matlab 0 pe customers are satisfied
