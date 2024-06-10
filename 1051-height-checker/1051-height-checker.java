class Solution {
    public int heightChecker(int[] heights) {
        
        int[] tempHeight=new int[heights.length];
        
        for(int i=0;i<heights.length;i++)   tempHeight[i]=heights[i];
        
        Arrays.sort(tempHeight);
        
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=tempHeight[i])           count++;    
        }
        
        return count;
    }
}