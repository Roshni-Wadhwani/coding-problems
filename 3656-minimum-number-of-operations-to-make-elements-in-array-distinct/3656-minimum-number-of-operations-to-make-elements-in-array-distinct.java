class Solution {
    public boolean checkUnique(int a[],int index){
        HashSet<Integer>s=new HashSet<>();
        List<Integer>l=new ArrayList<>();
        for(int i=index;i<a.length;i++){
            s.add(a[i]);
            l.add(a[i]);
        }
        if(s.size()==l.size())              return true;
        return false;
    }

    public int minimumOperations(int[] nums) {
        int index=0;
        int c=0;
        while(!checkUnique(nums,index)){
            index+=3;
            c++;
        }
        return c;
    }
}