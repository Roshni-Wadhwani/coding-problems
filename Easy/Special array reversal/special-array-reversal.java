//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.reverse(s));                        
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverse(String str)
    {
        //complete the function here
        String ans="";
        char a[]=str.toCharArray();
        int n=a.length;
        int i=0;
        int j=n-1;
        
        while(i<n && j>=0 && i<j){
            // System.out.println("i: "+i+"j: "+j);
            char first=a[i];
            char last=a[j];
            // System.out.println("first: "+first+"last: "+last);
            
            if(checkValid(first) && checkValid(last)){
                swap(a,i,j);
                i++;
                j--;
            }
            else if(checkValid(first))          j--;
            else if(checkValid(last))           i++;    
            else{
                i++;
                j--;
            }
            
        }
        return String.valueOf(a);
    }
    
    public static boolean checkValid(char ch){
        if(ch>='a' && ch<='z' ||ch>='A' && ch<='Z' || ch>='0' && ch<='9')       return true;
        return false;
    }
    
    public static void swap(char a[],int i,int j){
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}