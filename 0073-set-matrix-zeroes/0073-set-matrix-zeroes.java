class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        List<Integer>row=new ArrayList<>();
        List<Integer>col=new ArrayList<>();
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int i=0;i<row.size();i++){
            int first=row.get(i);
            int len=matrix[first].length;
            for(int j=0;j<len;j++)  matrix[first][j]=0;
        }

        for(int i=0;i<col.size();i++){
            int first=col.get(i);
            for(int j=0;j<n;j++)    matrix[j][first]=0;
        }
    }
}