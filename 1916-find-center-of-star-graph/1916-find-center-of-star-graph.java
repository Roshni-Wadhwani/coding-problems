class Solution {
    public int findCenter(int[][] edges) {

        int i=0;
        int j=1;

        if(edges[i][0]==edges[j][0] || edges[i][0]==edges[j][1])  return edges[i][0];
        else                    return edges[i][1];
        
    }
}