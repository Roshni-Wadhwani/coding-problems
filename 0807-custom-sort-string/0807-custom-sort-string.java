class Solution {
    public String customSortString(String order, String s) {
        String str[]=s.split("");

        String ans="";
        for(int i=0;i<order.length();i++){
            String one=""+order.charAt(i);

            for(int j=0;j<str.length;j++){
                if(str[j].equals(one))      {
                    str[j]="&";
                    ans+=one;
                }
            }
        }

        for(int i=0;i<str.length;i++){
            if(!str[i].equals("&"))         ans+=str[i];
        }

        return ans;
    }
}