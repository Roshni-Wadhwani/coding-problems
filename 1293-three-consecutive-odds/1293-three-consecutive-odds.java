class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int i=0;
        int j=1;
        int k=2;
        
        int n=arr.length;
        
        while(i<n && j<n && k<n){
            if(arr[i]%2==1 && arr[j]%2==1 && arr[k]%2==1) return true;
            else{
                i++;
                j++;
                k++;
            }
        }
        return false;
    }
}