class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int ans=numBottles;//15

        while(numBottles>=numExchange){
            ans+=(numBottles/numExchange);//+3=18+1=19
            numBottles=(numBottles/numExchange)+(numBottles%numExchange);//3+3=6  1+2=3
        }
        return ans;
    }

}