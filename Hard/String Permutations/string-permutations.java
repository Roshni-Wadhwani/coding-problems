//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public static ArrayList<String>ans=new ArrayList<>();
    public ArrayList<String> permutation(String s)
    {
        //Your code here
        ans.clear();
        generatePermutations(s,0,s.length());
        sort();
        return ans;
    }
	 public static void generatePermutations(String s,int start,int end){
	     if(start==end-1){
	         ans.add(s);return;
	     }
	     else{
	         for(int i=start;i<end;i++){
	             s=doSwap(s,i,start);
	             generatePermutations(s,start+1,end);
	             s=doSwap(s,i,start);
	         }
	     }
	 }
	 
	 public static String doSwap(String s,int i,int j){
	     char a[]=s.toCharArray();
	     char temp=a[i];
	     a[i]=a[j];
	     a[j]=temp;
	     return String.valueOf(a);
	 }
	 
	 public static void sort(){
	     Collections.sort(ans);
	 }
}
