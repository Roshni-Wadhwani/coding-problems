class Solution {
    public boolean checkParity(Integer num1,Integer num2){
        if(num1%2==0 && num2%2==0)          return true;
        else if(num1%2!=0 && num2%2!=0)     return true;
        return false;
    }

    public String getSmallestString(String s) {
        int i=0;
        int j=1;
        int flag=0;

        String[] str=s.split("");

        int[] strInt=new int[str.length];

        for(int k=0;k<str.length;k++)   strInt[k]=Integer.parseInt(str[k]);

        while(i<strInt.length && j<strInt.length){
           
            if(checkParity(strInt[i],strInt[j])){
                if(strInt[i]>strInt[j])           {
                    int temp=strInt[i];
                    strInt[i]=strInt[j];
                    strInt[j]=temp;
                    flag=1;
                }
            }

            if(flag==1)                 break;            
            i++;
            j++;
        }

        String ans="";
        for(int k=0;k<strInt.length;k++)           ans+=strInt[k];
        return ans;
    }
}