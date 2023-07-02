class Solution {
    public double myPow(double x, int n) {
        // double ans=1;
        // if(n>=0){
        //     for(int i=1;i<=n;i++)           ans*=x;
        // }
        // else{
        //     n=-n;
        //     for(int i=1;i<=n;i++)           ans*=(1/x);
        // }
        // return ans;

        double ans=1;
        long tempN=n;
        if(tempN<0)                 tempN=tempN*(-1);
        while(tempN>0){
            if(tempN%2==0){
                x=x*x;
                tempN=tempN/2;
            }
            else{
                ans*=x;
                tempN-=1;
            }
        }
        if(n<0)                     ans=1/ans;
        return ans;   
    }
}