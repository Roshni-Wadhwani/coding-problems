class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq1=new int[51];
        int[] freq2=new int[51];
        int n=A.length;
        int[] arrC=new int[n];

        for(int i=0;i<n;i++){
            int countAns=0;
            int num1=A[i];
            int num2=B[i];

            freq1[num1]++;
            freq2[num2]++;

            for(int j=1;j<=50;j++){
                if(freq1[j]!=0 && freq1[j]==freq2[j])          countAns++;
            }
            arrC[i]=countAns;
        }

        return arrC;
    }
}