class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character,Integer>freq=new HashMap<>();
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(freq.containsKey(ch)){
               freq.put(ch,freq.get(ch)+1);
           }
           else{
               freq.put(ch,1);
           }
       }
        int odd_c=0,final_c=0;
        for(Map.Entry<Character,Integer>map:freq.entrySet()){
            int val=map.getValue();
            if(val%2==1)        {
                odd_c++;
                if(odd_c>1)      final_c+=(val-1);
                else              final_c+=val;
            }
            else                  final_c+=val;
        }
        return final_c;
    }
}