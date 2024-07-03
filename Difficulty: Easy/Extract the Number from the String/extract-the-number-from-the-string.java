//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    boolean check(String s){
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            if(ascii<48 || ascii>56)            return false;
        }
        return true;
    }
    long ExtractNumber(String sentence) {
        // code here
        
        String[] str=sentence.split(" ");
        
        long ans=-1;
        
        for(int i=0;i<str.length;i++){
            String s=str[i];
            
            if(check(s))        ans=Math.max(ans,Long.parseLong(s));
        }
        
        return ans;
    }
}