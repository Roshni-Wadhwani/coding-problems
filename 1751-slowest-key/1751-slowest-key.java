class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int diff[]=new int[releaseTimes.length];
        diff[0]=releaseTimes[0];
        int maxDiff=diff[0];

        for(int i=1;i<releaseTimes.length;i++){
            diff[i]=releaseTimes[i]-releaseTimes[i-1];
            maxDiff=Math.max(maxDiff,diff[i]);
        }

        char ans='$';
        for(int i=0;i<diff.length;i++){
            if(diff[i]==maxDiff)        {
                if(ans=='$')        ans=keysPressed.charAt(i);
                else                {
                    if(ans<keysPressed.charAt(i))           ans=keysPressed.charAt(i);
                }
            }
        }
        return ans;
        

    }
}