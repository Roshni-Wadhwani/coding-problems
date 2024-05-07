import java.lang.Math;
class Solution {
    public boolean isPalindrome(int x) {
        // x=Math.abs(x);
        String given=String.valueOf(x);
        String made="";
        
        for(int i=given.length()-1;i>=0;i--){
            made+=given.charAt(i);
        }
        
        System.out.println(given);
        System.out.println(made);
        
        if(given.equals(made))          return true;
        return false;
    }
}