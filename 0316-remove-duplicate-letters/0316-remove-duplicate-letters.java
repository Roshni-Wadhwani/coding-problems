class Solution {
    // public static List<String>ans=new ArrayList<>();
    // public String removeDuplicateLetters(String s) {
    //     ans.clear();
    //     HashSet<String>set1=setAdd(s);
    //     getAllSubsequences(s,"",0,s.length(),set1);
    //     Collections.sort(ans);
    //     Collections.sort(ans,(s1,s2)->s1.length()-s2.length());
    //     // System.out.println("ans: "+ans);
    //     return ans.get(0);
    // }
    
    // public static void getAllSubsequences(String s,String subseq,int start,int end,HashSet<String>set){
    //     if(start==end){
    //         HashSet<String>set_2=setAdd(subseq);
    //         if(set.equals(set_2))               {
    //             ans.add(subseq);
    //         }
    //         return;
    //     }
    //     getAllSubsequences(s,subseq+s.charAt(start),start+1,end,set);
    //     getAllSubsequences(s,subseq,start+1,end,set);
    // }
    
    // public static HashSet<String> setAdd(String str){
    //     HashSet<String>set=new HashSet<>();
    //     for(int i=0;i<str.length();i++)         set.add(""+str.charAt(i));
    //     return set;
    // }

    public String removeDuplicateLetters(String s){
        //calculating last index
        int[] lastIndex = new int[26];
        for(int i=0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        boolean[] visited=new boolean[26];
        Deque<Character>stack=new ArrayDeque<>();

        //bcabc
        // stack=[bc]
        // visited=[b:true,c:true]
        // lastIndex={b:3,c:4}
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);//a
            Character top=stack.peek();//c
            if(stack.isEmpty())   {
                stack.push(ch);
                visited[ch-'a']=true;
            }
            else{
                if(visited[ch-'a']==true)             continue;
                while(!stack.isEmpty() && ch<top && lastIndex[top-'a']>=i){
                    Character temp=stack.pop();
                    visited[temp-'a']=false;
                    top=stack.peek();
                }
                stack.push(ch);
                visited[ch-'a']=true;
            }  
        }
        String ans="";
        while(!stack.isEmpty()){
            ans=stack.pop()+ans;
        }
        return ans;
    }
}