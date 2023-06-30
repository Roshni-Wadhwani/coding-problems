class Solution {
    public List<List<Integer>> generate(int numRows) {
        // brute force
        List<List<Integer>>ans=new ArrayList<>();
        if(numRows>=1){
            ans.add(Arrays.asList(1));
            if(numRows>=2){
                ans.add(Arrays.asList(1,1));
                for(int i=2;i<numRows;i++){
                    List<Integer>temp=new ArrayList<>();
                    temp.add(1);
                    List<Integer>tempRow=ans.get(i-1);
                    for(int j=0;j<(tempRow.size())-1;j++){
                        int sum=tempRow.get(j)+tempRow.get(j+1);
                        temp.add(sum);
                    }
                    temp.add(1);
                    ans.add(temp);
                }
            }
        }
        // System.out.println(ans);
        return ans;
    }
}