class Solution {
    public int minOperations(String[] logs) {
        
        int cnt=0;
        for(int i=0;i<logs.length;i++){
            String str=logs[i];
            if(str.endsWith("../"))         cnt--;
            else if(str.endsWith("./"))     {}
            else if(str.endsWith("/"))      {
                if(cnt<0)       cnt=0;
                cnt++;
            }
        }

        if(cnt<0)               cnt=0;
        return cnt;
    }
}