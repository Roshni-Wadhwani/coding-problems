class Solution {
    public String shiftingLetters(String s, int[][] shifts) {

        int temp[] = new int[s.length() + 1];
        String ans="";

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];
            if (direction == 0) {
                temp[start]--;
                temp[end + 1]++;
            } else {
                temp[start]++;
                temp[end + 1]--;
            }
        }

        // to calculate prefixSum
        int sum = 0;
        for(int i=0;i<temp.length;i++){
            sum+=temp[i];
            temp[i]=sum;
        }

        for(int i=0;i<temp.length-1;i++){
            int normalizedShift = (temp[i] % 26) ;
            char ch = (char) ((s.charAt(i)-'a'+normalizedShift+26)%26 + 'a');
            ans+=ch;
        }
        return ans;
    }
}