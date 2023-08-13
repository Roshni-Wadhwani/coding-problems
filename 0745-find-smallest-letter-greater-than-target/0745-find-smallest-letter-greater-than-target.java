class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return binarySearch(0,letters.length-1,letters,target);
    }

    public static char binarySearch(int start,int end,char ch[],char var){
        while(start<=end){
            int mid=start+(end-start)/2;
            // if(ch[mid]==var)                    return mid;
            if(ch[mid]<=var)                     start=mid+1;
            else                                end=mid-1;
        }
        int n=ch.length;
        return ch[start%n];
    }
}