class Solution {
    public String doSort(String s){
        String[] str=s.split("");
        Arrays.sort(str);

        String ans="";
        for(int i=0;i<str.length;i++)       ans+=str[i];
        return ans;
    }
    public List<String> removeAnagrams(String[] words) {
        int i=0;
        int j=1;

        List<String>ans=new ArrayList<>();

        while(i<words.length && j<words.length){
            while(words[i].equals(" "))           i++;
            String str1=words[i];
            String str2=words[j];

            String sortStr1=doSort(str1);
            String sortStr2=doSort(str2);

            if(sortStr1.equals(sortStr2))   {
                words[j]=" ";
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        for(int k=0;k<words.length;k++) System.out.println(words[k]);

        for(int k=0;k<words.length;k++)             {
            if(words[k].equals(" "))             {}
            else                            ans.add(words[k]);
        }
        return ans; 
    }
}