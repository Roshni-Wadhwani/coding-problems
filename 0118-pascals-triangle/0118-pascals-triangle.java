import java.math.BigInteger;
class Solution {
    public static List<BigInteger>factorial=new ArrayList<>();
    public static List<List<Integer>>ans=new ArrayList<>();

    public List<List<Integer>> generate(int numRows) {
        // brute force
        // List<List<Integer>>ans=new ArrayList<>();
        // if(numRows>=1){
        //     ans.add(Arrays.asList(1));
        //     if(numRows>=2){
        //         ans.add(Arrays.asList(1,1));
        //         for(int i=2;i<numRows;i++){
        //             List<Integer>temp=new ArrayList<>();
        //             temp.add(1);
        //             List<Integer>tempRow=ans.get(i-1);
        //             for(int j=0;j<(tempRow.size())-1;j++){
        //                 int sum=tempRow.get(j)+tempRow.get(j+1);
        //                 temp.add(sum);
        //             }
        //             temp.add(1);
        //             ans.add(temp);
        //         }
        //     }
        // }
        // return ans;

        // little optimised
        factorial.clear();
        ans.clear();
        calculateFactorialUptoN(numRows);
        ans.add(Arrays.asList(1));
        for(int i=1;i<numRows;i++){
            List<Integer>temp=new ArrayList<>();
            for(int r=0;r<=i;r++)   {
                System.out.println("fact: "+factorial.get(i));
                int op=calculateNCR(i,r,i-r);
                temp.add(op);
            }
            ans.add(temp);
        }
        return ans;
    }
    public static void calculateFactorialUptoN(int num){
        BigInteger fact=BigInteger.ONE;
        factorial.add(fact);
        for(int i=1;i<=num;i++){
            fact=fact.multiply(BigInteger.valueOf(i));
            factorial.add(fact);
        }
    }
    public static int calculateNCR(int n,int r,int diff){
        BigInteger factN=factorial.get(n);
        BigInteger factR=factorial.get(r);
        BigInteger factDiff=factorial.get(diff);
        return (factN.divide((factR.multiply(factDiff)))).intValue();
    }

}