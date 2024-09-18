class Solution {
    public int generateKey(int num1, int num2, int num3) {

        String str1="";
        String str2="";
        String str3="";

        int len1=String.valueOf(num1).length();
        for(int i=0;i<4-len1;i++)       str1+="0";
        str1+=String.valueOf(num1);

        int len2=String.valueOf(num2).length();
        for(int i=0;i<4-len2;i++)       str2+="0";
        str2+=String.valueOf(num2);

        int len3=String.valueOf(num3).length();
        for(int i=0;i<4-len3;i++)       str3+="0";
        str3+=String.valueOf(num3);

        String ans="";
        for(int i=0;i<4;i++){
            if(str1.charAt(i)<str2.charAt(i) && str1.charAt(i)<str3.charAt(i))  {
                ans+=str1.charAt(i);
            }
            else if(str2.charAt(i)<str3.charAt(i)){
                ans+=str2.charAt(i);
            }
            else            ans+=str3.charAt(i);
        }

        String finAns="";
        int c=0;
        for(int i=0;i<ans.length();i++)     {
            if(ans.charAt(i)!='0')      break;
            else                        c++;        
        }
        for(int i=c;i<ans.length();i++) finAns+=ans.charAt(i);

        if(finAns.equals(""))      return 0;
        return Integer.parseInt(finAns);
    }
}