class Solution {
    public int findTheWinner(int n, int k) {

        int flag[]=new int[n+1];
        // 0 0 0 0 0 0 0

        int temp=n;//6
        int i=1;//4
        int cZeros=n+1;

        while(temp>1){

            int cntIndex=0;//ek bi index nhi mili hai 
            int index=1;

            while(cntIndex<k && cZeros>2){
                if(flag[i]==0){
                    cntIndex++;//3
                    index=i;//3
                }
                i++;
                if(i>n)         i=i%n;
            }
            flag[index]=-1;
            temp--;
            cZeros--;
        }

        int ans=0;
        for(int j=1;j<flag.length;j++){
            if(flag[j]==0)      {
                ans=j;
                break;
            }
        }
        return ans;
    }
}