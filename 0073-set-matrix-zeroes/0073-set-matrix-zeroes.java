class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;

        List<Integer>indexes=new ArrayList<>();
        for(int i=0;i<rows;i++){
            int temp[]=matrix[i];
            int countZeros=0;
            for(int j=0;j<temp.length;j++){
                if(temp[j]==0)          {
                    countZeros++;
                    indexes.add(j);
                }
            }
            if(countZeros>=1) {
                for(int j=0;j<temp.length;j++){
                    temp[j]=0;
                }
            }
        }

        for(Integer index:indexes){
            for(int i=0;i<rows;i++){
                matrix[i][index]=0;
            }
        }
    
    }
}