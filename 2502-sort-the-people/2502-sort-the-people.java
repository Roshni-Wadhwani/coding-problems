class Solution {
    public void sortArray(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String>mapping=new HashMap<>();

        for(int i=0;i<names.length;i++){
            mapping.put(heights[i],names[i]);
        }

        sortArray(heights);

        String[] ans=new String[names.length];

        for(int i=0;i<heights.length;i++){
            int h=heights[i];
            String val=mapping.get(h);
            ans[i]=val;
        }

        return ans;
    }
}