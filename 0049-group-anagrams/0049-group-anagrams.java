class Solution {
    public String doSort(String s){
        String[] str=s.split("");
        Arrays.sort(str);

        String ans="";
        for(int i=0;i<str.length;i++)       ans+=str[i];

        return ans;     
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map= new HashMap<>();

        for(String str1:strs){
            String str2=doSort(str1);
            if(map.containsKey(str2)){
                List<String>li= map.get(str2);
                li.add(str1);
                map.put(str2,li);
            }
            else    {
                List<String> li = new ArrayList<>();
                li.add(str1);
                map.put(str2,li);
            }
        }

        for(Map.Entry<String,List<String>>m:map.entrySet()){
            List<String>val=m.getValue();
            ans.add(val);
        }

        return ans;
    }
}