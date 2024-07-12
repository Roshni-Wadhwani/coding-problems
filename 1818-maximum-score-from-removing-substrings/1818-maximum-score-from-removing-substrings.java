class Solution {
    public int maximumGain(String s, int x, int y) {
        int ans=0;

        Deque<Character>stack=new ArrayDeque<>();
        if(x>y){
            String newString="";
            for(int i=0;i<s.length();i++){
                if(stack.isEmpty())         stack.push(s.charAt(i));
                else{
                    Character ch=stack.peek();//a
                    Character toBePushed=s.charAt(i);//b

                    if(toBePushed=='b' && ch=='a'){
                        stack.pop();
                        ans+=x;//10
                    }
                    else                stack.push(toBePushed);
                }
            }
            while(!stack.isEmpty())         newString=stack.pop()+newString;
            // System.out.println(newString);

            for(int i=0;i<newString.length();i++){
                if(stack.isEmpty())         stack.push(newString.charAt(i));
                else{
                    Character ch=stack.peek();//a
                    Character toBePushed=newString.charAt(i);//b

                    if(toBePushed=='a' && ch=='b'){
                        stack.pop();
                        ans+=y;//10
                    }
                    else                stack.push(toBePushed);
                }
            }
        }
        else{
            String newString="";
            for(int i=0;i<s.length();i++){
                if(stack.isEmpty())         stack.push(s.charAt(i));
                else{
                    Character ch=stack.peek();//a
                    Character toBePushed=s.charAt(i);//b

                    if(toBePushed=='a' && ch=='b'){
                        stack.pop();
                        ans+=y;//10
                    }
                    else                stack.push(toBePushed);
                }
            }
            while(!stack.isEmpty())         newString=stack.pop()+newString;
            // System.out.println(newString);

            for(int i=0;i<newString.length();i++){
                if(stack.isEmpty())         stack.push(newString.charAt(i));
                else{
                    Character ch=stack.peek();//a
                    Character toBePushed=newString.charAt(i);//b

                    if(toBePushed=='b' && ch=='a'){
                        stack.pop();
                        ans+=x;//10
                    }
                    else                stack.push(toBePushed);
                }
            }
        }
        
        return ans;  
    }
}