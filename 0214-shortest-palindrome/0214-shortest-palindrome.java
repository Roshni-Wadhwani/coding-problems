class Solution { 

    //brute force approach-1

    // // Method to check if a given string is a palindrome
    // public boolean isPalindrome(String s) {
    //     int i = 0;                    // Start pointer from the beginning
    //     int j = s.length() - 1;       // End pointer from the last character
        
    //     // Loop while the start pointer is less than the end pointer
    //     while (i < j) {
    //         // If characters at start and end are equal, move pointers inward
    //         if (s.charAt(i) == s.charAt(j)) {
    //             i++;  // Move start pointer to the right
    //             j--;  // Move end pointer to the left
    //         }
    //         // If characters are not equal, the string is not a palindrome
    //         else                    return false;
    //     }
    //     // If the loop completes, the string is a palindrome
    //     return true;
    // }

    // // Method to create a new string by inserting a character from the end at a specific index
    // public String makeString(String s, int i, int index) {
    //     String temp = "";              // Temporary string to store the result
    //     int flag = 0;                  // Flag to indicate whether the character has been inserted

    //     // Loop through all characters of the original string
    //     for(int j=0;j<=s.length();j++){
    //         // If the current index matches the insertion point, insert the character from position 'i'
    //         if (j == index) {
    //             temp += s.charAt(i);    // Append the character from the end (position 'i')
    //             flag = 1;               // Set flag to indicate the insertion has occurred
    //         } 
    //         else {
    //             // If insertion has not happened yet, append current character from original string
    //             if (flag == 0)                  temp += s.charAt(j); 
    //             // If insertion has happened, append the previous character
    //             else {
    //                 temp += s.charAt(j - 1);   // Adjust index to account for the inserted character
    //             }
    //         }
    //     }
    //     // Return the newly constructed string with the inserted character
    //     return temp;
    // }

    // // Method to find the shortest palindrome by adding characters in front of the original string
    // public String shortestPalindrome(String s) {
    //     // If the original string is already a palindrome, return it as is
    //     if (isPalindrome(s)) {
    //         return s;
    //     } 
    //     else {
    //         int i = s.length() - 1;   // Start from the last character of the string
    //         int index = 0;            // Start insertion at the front (index 0)

    //         // Loop through characters starting from the last one, moving backward
    //         while (i >= 0) {
    //             // Insert the character from the end of the string at the front and form a new string
    //             s = makeString(s, i, index);
    //             index++;               // Move the insertion point one position further to the right
                
    //             // Check if the modified string is a palindrome
    //             if (isPalindrome(s)) {
    //                 return s;          // If it is a palindrome, return the newly formed string
    //             }
    //         }
    //     }
    //     return s;                      // Return the modified string as the result




    // brute force appraoch-2
    /*
        basically a palindrome is when the string remains same when reversed.
        so, consider s=aacecaaa so reversedString=aaacecaa
        here, we try to compare both original string and reversed string.. 
        if they are same we can return that string..
        else we compare the strings by taking their substrings ..
            for this we will loop through a string and 
            check if substring of s from 0 to len-i = substring of reversed string from i till last
            if equal return concatenation(reversedSubstring(i) and s);

            example:-s=aacecaaa , reversedstring->aaacecaa
                i=0 substring_s=aacecaaa    substring_reversed=aaacecaa
                both are not equal, lets increment i
                i=1 substring_s=aacecaa     substring_reversed=aacecaa
                as you can clearly see both are equal..
                so we will just return concatenation (a+aacecaaa)= aaacecaaa
                and this is our required ans.

    */
    public String shortestPalindrome(String s){
        int len=s.length();
        String reversedString="";
        for(int i=len-1;i>=0;i--)         reversedString+=s.charAt(i);

        for(int i=0;i<len;i++){
            if(s.substring(0,len-i).equals(reversedString.substring(i))){
                return reversedString.substring(0,i)+s;
            }
        }
        return "";
    }
}
