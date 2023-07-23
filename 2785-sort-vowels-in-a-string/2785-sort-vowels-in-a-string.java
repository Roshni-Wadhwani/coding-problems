class Solution {
    public String sortVowels(String s) {
        List<Character>vowels=new ArrayList<>();
        char a[]=new char[s.length()];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!checkVowel(ch))                 a[i]=ch;
            else{
                vowels.add(ch);
                a[i]='#';
            }
        }
        
        Collections.sort(vowels,(e1,e2)->e1.compareTo(e2));
       
        
        int j=0;
        for(int i=0;i<a.length && j<vowels.size();i++){
            if(a[i]=='#')           {
                a[i]=vowels.get(j);j++;
            }
            
        }
        String ans="";
        for(int i=0;i<a.length;i++){
            ans=ans+a[i];
        }
        return ans;
    }
    public static boolean checkVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')  return true;
        return false;   
    }
}