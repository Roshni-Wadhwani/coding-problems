class Solution {
    List<Integer>li=new ArrayList<>();
    public boolean buddyStrings(String s, String goal) {
        int i=0;
        if(s.length()!=goal.length())       return false;
        Set<String>temp=new HashSet<>();
        if(s.equals(goal)){
            for(int r=0;r<s.length();r++){
                temp.add(""+s.charAt(r));
            }
            if(s.length()==temp.size())     return false;
            return true;
        }
        Set<String>temp1=new HashSet<>();
        Set<String>temp2=new HashSet<>();
        while(i<s.length()){
            if(s.charAt(i)!=goal.charAt(i)){
                li.add(i);
                temp1.add(""+s.charAt(i));
                temp2.add(""+goal.charAt(i));
            }
            i++;
        }
        // li keeps records of indexes which are not equal and if only 2 indices are there in li meaning it is a buddy string
        if(li.size()==2 && temp1.equals(temp2))      return true;
        return false;   
    }
}