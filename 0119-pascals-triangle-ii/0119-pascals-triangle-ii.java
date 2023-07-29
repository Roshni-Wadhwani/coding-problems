class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>>finalAns=new ArrayList<>();
        
        List<Integer>a=new ArrayList<>();
        a.add(1);
        finalAns.add(a);
        
        List<Integer>a2=new ArrayList<>();
        a2.add(1);
        a2.add(1);
        finalAns.add(a2);
        
        for(int i=2;i<=rowIndex;i++){
            List<Integer>temp=finalAns.get(i-1);
            List<Integer>newTemp=new ArrayList<>();
            newTemp.add(temp.get(0));
            for(int j=0;j<temp.size()-1;j++){
                int sum=temp.get(j)+temp.get(j+1);
                newTemp.add(sum);
            }
            newTemp.add(temp.get(temp.size()-1));
            finalAns.add(newTemp);
            // System.out.println("newTemp: "+newTemp);
        }
        
        return finalAns.get(rowIndex);
    }
}