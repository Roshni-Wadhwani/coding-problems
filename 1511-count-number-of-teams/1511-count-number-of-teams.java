class Solution {
    public int numTeams(int[] rating) {

        int ansCount=0;
        for(int i=0;i<rating.length;i++){
            int r1=rating[i];
            for(int j=i+1;j<rating.length;j++){
                int r2=rating[j];

                for(int k=j+1;k<rating.length;k++){
                    int r3=rating[k];

                    if((r1<r2 && r2<r3) || (r1>r2 && r2>r3))            ansCount++;
                }
            }
        }
        return ansCount;
    }
}