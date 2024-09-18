class Solution {
    public long smallestNumber(long num) {
        String numStr=String.valueOf(num);
        int flag=0;

        String str[]=numStr.split("");
        String ans="";
        if (str[0].equals("-")){
            ans+="-";
            flag=1;
        }
        Arrays.sort(str);//[0,1,3]

        if(flag==1){
            for(int i=str.length-1;i>0;i--)        ans+=str[i];
        }
        else{
            int cZeros=0;
            for(int i=0;i<str.length;i++){
                if(str[i].equals("0"))              cZeros++;
            }
            if(cZeros<str.length)               ans+=str[cZeros];
            for(int i=0;i<cZeros;i++)                    ans+="0";
            for(int i=cZeros+1;i<str.length;i++)         ans+=str[i];
        }
        return Long.parseLong(ans);
    }
}