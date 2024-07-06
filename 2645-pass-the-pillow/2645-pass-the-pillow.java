class Solution {
    public int passThePillow(int n, int time) {

        List<Integer>arr=new ArrayList<>();

        for(int i=1;i<=n;i++)       arr.add(i);

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
        // n=4 time=5
        // ptr=0
        // cntr=0

        // 0<=5            true
        // flag=0  true    
        // 0<4         ptr=1       cntr=1

        // 4<=5        true
        // flag=0 true
        // 4<4         
        // 4==4        flag=1      ptr=3       cntr=5

        // 5<=5 true flag=1    ptr=2       cntr=6
    }
}