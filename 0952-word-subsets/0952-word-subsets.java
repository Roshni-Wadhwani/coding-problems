class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String>ans=new ArrayList<>();
        HashMap<String,int[]>map1=new HashMap<>();

        for(int i=0;i<words1.length;i++){
            String w=words1[i];
            int[]freqWords=new int[26];

            for(int j=0;j<w.length();j++){
                char ch=w.charAt(j);
                int asciiVal=(int)ch-97;
                freqWords[asciiVal]+=1;
            }
            map1.put(w,freqWords);
        }

        int[]freqArr=new int[26];
        for(int i=0;i<words2.length;i++){
            String w=words2[i];
            int[]freq=new int[26];

            for(int j=0;j<w.length();j++){
                char ch=w.charAt(j);
                int asciiVal=(int)ch-97;
                freq[asciiVal]+=1;
                freqArr[asciiVal]=Math.max(freqArr[asciiVal],freq[asciiVal]);
            }

        }

        for (Map.Entry<String, int[]> entry : map1.entrySet()) {
            boolean flag=true;
            String key = entry.getKey();       // Get the key
            int[] value1 = entry.getValue();    // Get the value

            for(int i=0;i<value1.length;i++){
                if(value1[i]<freqArr[i])    {
                    flag=false;
                    break;
                }
            }

            if(flag)                                    ans.add(key);
        }
        return ans;
    }
}