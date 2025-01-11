//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java



class Solution {
    

    public int longestUniqueSubstr(String s) {
        int[] index = new int[26]; // For 'a' to 'z'
        int start = 0, maxCount = 0;
    
        // Initialize all indices to -1
        for (int i = 0; i < index.length; i++) {
            index[i] = -1;
        }
    
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asciiMod = ch - 'a';
    
            // If the character was seen before and is within the current substring
            if (index[asciiMod] >= start) {
                start = index[asciiMod] + 1; // Move the start to exclude the repeated character
            }
    
            // Update the character's last seen index
            index[asciiMod] = i;
    
            // Calculate the length of the current substring
            maxCount = Math.max(maxCount, i - start + 1);
        }
    
        return maxCount;

    }
}