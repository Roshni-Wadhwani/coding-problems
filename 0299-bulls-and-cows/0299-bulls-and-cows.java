class Solution {
    public String getHint(String secret, String guess) {
        int cBulls=0;
        int cCows=0;

        List<Integer>s=new ArrayList<>();
        List<Integer>g=new ArrayList<>();


        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i))   cBulls++;
            else{
                s.add(Integer.parseInt(String.valueOf(secret.charAt(i))));
                g.add(Integer.parseInt(String.valueOf(guess.charAt(i))));
            }
        }
        
        Collections.sort(s);
        Collections.sort(g);
        
        int sPtr=0;
        int gPtr=0;

        while(sPtr<s.size() && gPtr<g.size()){
            if(s.get(sPtr)==g.get(gPtr)){
                sPtr++;
                gPtr++;
                cCows++;
            }
            else if(s.get(sPtr)<g.get(gPtr))        sPtr++;
            else                                    gPtr++;
        }

        String ans=String.valueOf(cBulls)+"A"+String.valueOf(cCows)+"B";
        return ans;
    }
}