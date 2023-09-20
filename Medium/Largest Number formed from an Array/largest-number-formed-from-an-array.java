//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(String[] arr) {
        // code here
        Arrays.sort(arr,new Comparator<String>(){
            public int compare(String X,String Y){
                String temp1=X+Y;
                String temp2=Y+X;
                
                if(temp1.compareTo(temp2)>0)      return -1;
                return 1;
            }
        });
        
        String ans="";
        for(String str:arr)         ans+=str;
        
        return ans;
    }
}