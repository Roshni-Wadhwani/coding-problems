class Solution {
    public double averageWaitingTime(int[][] customers) {


        //5,2=max(7,0)=>7-5=2
        //5,4=max(11,9)=>11-5=6
        //10,3=max(14,13)=>14-10=4
        //20,1=max(15,21)=>21-20=1

        int n=customers.length;
        int[] sum=new int[n];
        sum[0]=customers[0][0]+customers[0][1];

        for(int i=1;i<n;i++){
            sum[i]=Math.max((customers[i][0]+customers[i][1]),(sum[i-1]+customers[i][1]));
        }
        double ans=0;
        for(int i=0;i<sum.length;i++){
            ans+=sum[i]-customers[i][0];
        }
        return (double)ans/n;
        
    }
}