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
       int odd_c=0,temp=0,c=0;
       for(int val:freq.values()){
           if(val%2==0){
               c+=val;
           }
           else{
               odd_c=val/2;
               odd_c=odd_c*2;
               c+=odd_c;
               temp+=1;
           }
       }
       if(temp>=1)          c+=1;
       return c;

    }
}