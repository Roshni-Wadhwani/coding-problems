import java.math.BigInteger;
class Solution {
    
    public BigInteger convertToInteger(String s){
//         BigInteger ans=BigInteger.ZERO;
//         int n=s.length();
        
//         for(int i=n-1;i>=0;i--){
//             BigInteger temp=new BigInteger("2").pow(i);
//             BigInteger num=new BigInteger(String.valueOf(s.charAt(n-1-i)));
//             temp=temp.multiply(num);
//             ans=ans.add(temp);
//         }
//         return ans;
           return new BigInteger(s, 2);
    }
    
    public int numSteps(String s) {
        BigInteger bg1=convertToInteger(s);//13
        int count=0;
        
        while(!bg1.equals(BigInteger.ONE)){
            BigInteger temp=bg1.mod(BigInteger.TWO);//13%2
            
            if(temp.equals(BigInteger.ZERO))  bg1=bg1.divide(BigInteger.TWO);
            else                              bg1=bg1.add(BigInteger.ONE);
            
            count++;
        }
        return count;
    }
}