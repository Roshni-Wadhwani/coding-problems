class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i=0;i<target.length;i++){
            int elem1=target[i];
            int elem2=arr[i];

            if(elem1!=elem2)                    return false;         
        }
        return true;
    }
}