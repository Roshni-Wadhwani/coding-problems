class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer>ans=new ArrayList<>();

        for(int i=0;i<grid.length;i++){
            if(i%2==0){
                for(int j=0;j<grid[i].length;j+=2)          ans.add(grid[i][j]);
            }
            else{
                if(grid[i].length %2==0){
                    for(int j=grid[i].length-1;j>=0;j-=2)       ans.add(grid[i][j]);
                }
                else{
                    for(int j=grid[i].length-2;j>=0;j-=2)       ans.add(grid[i][j]);
                }
            }
        }

        return ans;
    }
}