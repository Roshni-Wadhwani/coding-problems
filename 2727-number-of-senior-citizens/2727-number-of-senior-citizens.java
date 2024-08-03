class Solution {
    public int countSeniors(String[] details) {
        // age is at 11th and 12th index

        int count=0;
        for(int i=0;i<details.length;i++){
            String str=details[i];
            String makeStr="";
            for(int j=11;j<=12;j++)         makeStr+=str.charAt(j);

            int age=Integer.parseInt(makeStr);
            if(age>60)              count++;
        }
        return count;
    }
}