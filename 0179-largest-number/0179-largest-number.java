class Solution {
    public String largestNumber(int[] nums) {
       String ans="";

       String[] numStrings=new String[nums.length];
       for(int i=0;i<nums.length;i++){
            numStrings[i]=String.valueOf(nums[i]);
       }

       Arrays.sort(numStrings,(a,b)->(b+a).compareTo(a+b));
       if(numStrings[0].equals("0"))        return "0";

       for(int i=0;i<numStrings.length;i++)  ans+=numStrings[i];

       return ans;
    }
}