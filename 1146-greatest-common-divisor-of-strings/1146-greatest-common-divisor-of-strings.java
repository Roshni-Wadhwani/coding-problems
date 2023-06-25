class Solution {
    public String gcdOfStrings(String s1,String s2) {
        String res="";
        List<String>op=new ArrayList<>();
        int i=0;
        while(i<s2.length()){
            res+=s2.charAt(i);
            if(makeEqual(res,s2))  {
                op.add(res);
            }
            i++;
        }
        int maxLength=-1;
        String ans="";
        for(String r:op){
            if(makeEqual(r,s1)) {
                maxLength=Math.max(maxLength,ans.length());
                if(maxLength==ans.length())         ans=r;
            }
        }             
        return ans;
    }

    public static boolean makeEqual(String res,String s){
        String temp="";
        int div=s.length()/res.length();
        for(int i=0;i<div;i++)          temp=temp+res;
        if(temp.equals(s))      return true;
        return false;
    }
}