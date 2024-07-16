class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] change=new int[3];//this will keep count of change of 5rs,10rs and 20rs

        for(int i=0;i<bills.length;i++){
            if(bills[i]==5)     change[0]++;
            else if(bills[i]==10){
                if(change[0]<1)             return false;
                else{
                    change[1]++;
                    change[0]--;
                }
            }
            else{
                if(change[0]>=1 && change[1]>=1){
                    change[0]--;
                    change[1]--;
                    change[2]++;
                }
                else if(change[0]>=3){
                    change[0]-=3;
                    change[2]++;
                }
                else                return false;
            }
        }
        return true;
    }
}