class Solution {
    public List<Integer> lexicalOrder(int n) {

        List<Integer>ans=new ArrayList<>();
        for(int i=1;i<=9;i++){
            getNos(i,n,ans);
        }
        return ans;
    }
    public void getNos(int currNo,int n,List<Integer>arr){
        if(currNo>n)                     return;
        arr.add(currNo);

        for(int i=0;i<=9;i++){
            int nxtNo=((currNo*10)+i);
            if(nxtNo>n)            break;
            else                    getNos(nxtNo,n,arr);
        }
    }
}