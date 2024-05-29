import java.math.BigInteger;
import java.math.BigDecimal;
class Solution {
    
    public BigInteger convertToInteger(String s){
        BigInteger ans=BigInteger.ZERO;
        int n=s.length();
        
        for(int i=n-1;i>=0;i--){
            BigInteger temp=new BigInteger("2").pow(i);
            BigInteger num=new BigInteger(String.valueOf(s.charAt(n-1-i)));
            temp=temp.multiply(num);
            ans=ans.add(temp);
        }
        return ans;
           // return new BigInteger(s, 2);
    }
    
    public int numSteps(String s) {
        BigInteger bg1=convertToInteger(s);//13
        int count=0;
        
        while(!bg1.equals(BigInteger.ONE)){
            // System.out.println("bg1: "+bg1);
            BigInteger t=BigInteger.valueOf(2);
            BigInteger temp=bg1.mod(t);//13%2
        
            int compareEven=temp.compareTo(BigInteger.ZERO);
            int compareOdd=temp.compareTo(BigInteger.ONE);
            
 
            if(compareEven==0)                bg1=bg1.divide(t);
            else if(compareOdd==0)            bg1=bg1.add(BigInteger.ONE);
            count++;
        }
        return count;
    }
}