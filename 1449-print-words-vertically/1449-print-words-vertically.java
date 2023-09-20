class Solution {
    public List<String> printVertically(String ss) {
        String [] arr=ss.split(" ");
        int maxLength=0;
        for(String s:arr){
            maxLength=Math.max(maxLength,s.length());
        }
        
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            int diff=maxLength-s.length();
            String temp="";
            for(int j=0;j<diff;j++)     temp+=" ";
            arr[i]=s+temp;
        }

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i].length()+arr[i]);
        // }
        List<String>ans=new ArrayList<>();
        for(int i=0;i<maxLength;i++){
            String tempAns="";
            for(String temp:arr){
                tempAns+=temp.charAt(i);
            }
            tempAns=tempAns.stripTrailing();
            ans.add(tempAns);
        }
        
        return ans;
    }
}