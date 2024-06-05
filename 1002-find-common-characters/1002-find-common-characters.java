class Solution {
    public List<String> commonChars(String[] words) {
        
        HashMap<String,Integer>freq_fWord=new HashMap<>();
        String fString=words[0];
        HashMap<String,Integer>freq=new HashMap<>();
       
        
        for(int i=0;i<fString.length();i++){
            String ch=String.valueOf(fString.charAt(i));
            if(freq_fWord.containsKey(ch)){
                freq_fWord.put(ch,freq_fWord.get(ch)+1);
            }
            else{
                freq_fWord.put(ch,1);
            }
        }
        
         // System.out.println(freq_fWord);
        
        for(int i=1;i<words.length;i++){
            String word=words[i];
            HashMap<String,Integer>freq_word=new HashMap<>();
            
            for(int j=0;j<word.length();j++){
                String c=String.valueOf(word.charAt(j));
                if(freq_word.containsKey(c)){
                    freq_word.put(c,freq_word.get(c)+1);
                }
                else{
                    freq_word.put(c,1);
                }
            }
             // System.out.println(freq_word);
            
            for(Map.Entry<String,Integer>temp:freq_fWord.entrySet()){
                String key=temp.getKey();//a
                int val1=temp.getValue();//2
                
                if(freq_word.containsKey(key)) {
                    int val2=freq_word.get(key);
                    
                    if(freq.containsKey(key)){
                        freq.put(key,Math.min(freq.get(key),val2));
                    }  
                    else{
                        if(i==1)    freq.put(key,Math.min(val1,val2));
                    }
                    
                }
                else{
                    freq.remove(key);
                }
                // System.out.println("freq: "+freq);
            }
        }
        
        // System.out.println(freq);
        int n=words.length-1;
        List<String>ans=new ArrayList<>();
        
        for(Map.Entry<String,Integer>temp:freq.entrySet()){
            String k=temp.getKey();
            int v=temp.getValue();
            for(int i=0;i<v;i++)        ans.add(k);
        }
        return ans;
        
    }
}