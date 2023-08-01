class Solution {
    public static List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        ans.clear();
        List<Integer>input=new ArrayList<>();
        for(int i=1;i<=n;i++)         input.add(i);
        
        List<Integer>temp=new ArrayList<>();
        getCombinations(input,0,input.size(),temp,k);
        return ans;
    }
    
    public static void getCombinations(List<Integer>ip,int s,int e,List<Integer>t,int k){
        if(s==e){
            List<Integer>temp=new ArrayList<>();
            temp.addAll(t);
            if(temp.size()==k)          ans.add(temp);
            return;
        }
        t.add(ip.get(s));
        getCombinations(ip,s+1,e,t,k);
       
        t.remove(t.size()-1);
        getCombinations(ip,s+1,e,t,k);
    }
}