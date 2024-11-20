class Solution {// 
    public int calculateSumPos(int index,int limit,int a[]){
        int ans=0;//7
        int n=a.length;
        for(int i=0;i<limit;i++){
            ans+=a[index];
            index=(index+1)%n;
        }
        return ans;
    }
    public int calculateSumNeg(int index,int limit,int a[]){
        int ans=0;//3
        int n=a.length;
        for(int i=0;i<limit;i++){
            ans+=a[index];
            if(index==0)            index=a.length-1;
            else                    index=(index-1)%n;
        }
        return ans;
    }
    public int[] decrypt(int[] code, int k) {
        int ans[]=new int[code.length];
        if(k==0)                return ans;
        else if(k>0){
            for(int i=0;i<ans.length;i++){
                ans[i]=calculateSumPos((i+1)%code.length,k,code);
            }
        }
        else{
            k=Math.abs(k);
            for(int i=0;i<ans.length;i++){
                ans[i]=calculateSumNeg((code.length-1+i)%code.length,k,code);
            }
        }
        return ans;
    }
}