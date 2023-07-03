class Solution {
    public String reverseWords(String str) {
        ArrayDeque<String>stack=new ArrayDeque<>();
        int i=0,j=0;
        while(i<str.length()){
            while(j<str.length() && str.charAt(j)!=' '){
                stack.push(""+str.charAt(j));
                j++;
            }
            i=j;j++;
            // this ensures extra spaces not alwd at start or at middle
            if(!stack.isEmpty()&& !stack.peek().equals(" "))
                stack.push(" ");
        }
        // removes extra spaces from end if any
        while(stack.peek().equals(" ")){
            stack.pop();
        }
        // System.out.println("stack: "+stack);
        String ans="";
        String temp="";
        while(!stack.isEmpty()){
            // getting word 
            if(!stack.peek().equals(" ")){
                temp+=stack.pop();
            }       
            else{
                // reverse word and add to string 
                ans+=reverse(temp);
                ans+=stack.pop();
                temp="";
            }
        }
        ans+=reverse(temp);
        return ans;
    }
    public static String reverse(String s){
        String ans="";
        for(int i=0;i<s.length();i++)               ans=s.charAt(i)+ans;
        return ans;
    }
}