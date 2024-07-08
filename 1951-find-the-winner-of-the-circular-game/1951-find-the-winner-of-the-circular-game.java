class Solution {
    public int findTheWinner(int n, int k) {

        int flag[]=new int[n+1];
        // 0 0 0 0 0 0 0

        int temp=n;// to ensure n-1 times loop chalna chahiye
        int i=1;//to keep record of starting point

        while(temp>1){

            int cntIndex=0;//to take into account how many elements covered so far 
            int index=1;//to keep record of index which should be removed

            while(cntIndex<k ){
                if(flag[i]==0){
                    cntIndex++;//3
                    index=i;//3
                }
                i++;
                if(i>n)         i=i%n;//for clockwise rotation
            }
            flag[index]=-1;
            temp--;
        }

        int ans=0;
        //to find out one index where flag=0
        for(int j=1;j<flag.length;j++){
            if(flag[j]==0)      {
                ans=j;
                break;
            }
        }
        return ans;
    }
}