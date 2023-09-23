class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->(a.length()-b.length()));
        HashMap<String,Integer>map=new HashMap<>();
        int res=0;

        for(String word:words){
            int len=0;
            for(int i=0;i<word.length();i++){
                String part1=word.substring(0,i);
                String part2=word.substring(i+1);
                String w=part1+part2;
                //skips one character and takes remaining ones

                int temp=1;
                if(map.containsKey(w))      temp=map.get(w)+1;
                //if map contains any take it and add 1 

                len=Math.max(len,temp);
            }
            res=Math.max(res,len);
            map.put(word,len);
        }
        return res;
    }
}