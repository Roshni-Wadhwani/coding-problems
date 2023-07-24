//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.isCircular(s));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String isCircular(String s)
    {
        //code here
        int x=0;
        int y=0;
        int dir=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='G'){
                if(dir==0)              y++;
                else if(dir==1)         x++;
                else if(dir==2)         y--;
                else                    x--;
            }
            else if(ch=='L')            dir=(4+dir-1)%4;
            else                        dir=(1+dir)%4;
        }
        if(x==0 && y==0)                return "Circular";
        else                            return "Not Circular";
    }
}