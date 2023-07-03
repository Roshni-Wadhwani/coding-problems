class Solution {
    public String reverseWords(String str) {
        ArrayDeque<String>stack=new ArrayDeque<>();
        int i=0,j=0;
        while(i<str.length()){
            while(j<str.length() && str.charAt(j)!=' '){
                stack.push(""+str.charAt(j));
                j++;
            }
            i=j;j++;//3//4
            if(!stack.isEmpty()&& !stack.peek().equals(" "))
                stack.push(" ");
        }
        while(stack.peek().equals(" ")){
            stack.pop();
        }
        System.out.println("stack: "+stack);
        String ans="";
        String temp="";
        while(!stack.isEmpty()){
            if(!stack.peek().equals(" ")){
                temp+=stack.pop();
            }       
            else{
                ans+=reverse(temp);//blue
                ans+=stack.pop();
                temp="";
            }
        }
        ans+=reverse(temp);//blue
        System.out.println("ans: "+ans);
        return ans;
    }
    public static String reverse(String s){
        String ans="";
        for(int i=0;i<s.length();i++)               ans=s.charAt(i)+ans;
        return ans;
    }
}