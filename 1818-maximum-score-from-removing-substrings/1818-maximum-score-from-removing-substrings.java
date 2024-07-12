class Solution {
    public int giveAns(String s,int first,int second,Character ch1,Character ch2){
        int ans=0;
        String newString="";
        Deque<Character>stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty())         stack.push(s.charAt(i));
            else{
                Character ch=stack.peek();//a
                Character toBePushed=s.charAt(i);//b

                if(toBePushed==ch1 && ch==ch2){
                    stack.pop();
                    ans+=first;//10
                }
                else                stack.push(toBePushed);
            }
        }
        while(!stack.isEmpty())         newString=stack.pop()+newString;

        for(int i=0;i<newString.length();i++){
            if(stack.isEmpty())         stack.push(newString.charAt(i));
            else{
                Character ch=stack.peek();//a
                Character toBePushed=newString.charAt(i);//b

                if(toBePushed==ch2 && ch==ch1){
                    stack.pop();
                    ans+=second;//10
                }
                else                stack.push(toBePushed);
            }
        }
        return ans;
    }
    public int maximumGain(String s, int x, int y) {
        int ans=0;

       
        if(x>y)         ans=giveAns(s,x,y,'b','a');
        else            ans=giveAns(s,y,x,'a','b');
        
        
        return ans;  
    }
}