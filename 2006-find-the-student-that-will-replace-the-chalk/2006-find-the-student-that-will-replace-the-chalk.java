class Solution {
    public int chalkReplacer(int[] chalk, int k) {

        // brute force
        // int diff    =   k;
        // int stud    =   0;

        // while(diff>0){
        //     if(stud>=chalk.length)      stud=stud%chalk.length;
        //     diff-=chalk[stud];
        //     stud++;
        // }

        // if(diff<0)                      {
        //     stud--;
        // }

        // return stud%chalk.length;


        //
        long sumArray=0;
        for(int i=0;i<chalk.length;i++)             sumArray+=chalk[i];

        long mod=k%sumArray;
        long div=k/sumArray;
        long nearestMultiple=sumArray*div;
        k-=nearestMultiple;

        int stud=0;
        while(k>0){
            k-=chalk[stud];
            if(k<0)                     return stud;
            stud++;
        }

        return stud;

    }
}