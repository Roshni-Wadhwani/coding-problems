class Solution {
    public int maxProfit(int[] prices) {
        int diffMax=0;
        int i=0,j=1;
        while(i<prices.length && j<prices.length){
            int shouldBeSmall=prices[i];
            int shouldBeBig=prices[j];
            if(shouldBeBig>shouldBeSmall){
                diffMax=Math.max(diffMax,(shouldBeBig-shouldBeSmall));
                j++;
            }
            else{
                i=j;j++;
            }
        }
        return diffMax;  
    }
}