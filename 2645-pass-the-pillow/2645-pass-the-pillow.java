class Solution {
    public int passThePillow(int n, int time) {

        int ptr=0;
        int cntr=0;
        int flag=0;


        while(cntr<=time){
            if(flag==0){
                if(ptr<n)          ptr++;
                else if(ptr==n){
                    flag=1;
                    ptr--;
                }
            }
            else{
                if(ptr<=1){
                    flag=0;
                    ptr++;
                }
                else            ptr--;        
            }
            cntr++;
        }
        return ptr;
    }
}