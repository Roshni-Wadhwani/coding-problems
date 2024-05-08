class Solution {
    public String[] findRelativeRanks(int[] score) {
        int c=0;
        
        String str[]=new String[score.length];
        
        
        for(int i=0;i<score.length;i++){ 
            //take out maximum
            int index=-1;
            int maxElem=-1;
            for(int j=0;j<score.length;j++){
                if(score[j]>maxElem){
                    maxElem=score[j];
                    index=j;
                }
            }
            score[index]=-1;
            c++;
            if(c==1)        str[index]="Gold Medal";
            else if(c==2)   str[index]="Silver Medal";
            else if(c==3)   str[index]="Bronze Medal";
            else            str[index]=String.valueOf(c);
        }
        return str;
    }
}