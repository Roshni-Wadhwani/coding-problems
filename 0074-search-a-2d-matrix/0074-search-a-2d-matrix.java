class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // brute force
        // for(int i=0;i<matrix.length;i++){
        //     int temp[]=matrix[i];
        //     for(int j=0;j<temp.length;j++){
        //         if(matrix[i][j]==target)              return true;
        //     }
        // }
        // return false;


        // little efficient
        for(int i=0;i<matrix.length;i++){
            int temp[]=matrix[i];
            int firstEle=temp[0];
            int lastEle=temp[temp.length-1];
            if(target>=firstEle && target<=lastEle){
                for(int j=0;j<temp.length;j++){
                    if(matrix[i][j]==target)            return true;
                }
            }
        }
        return false;
    }
}