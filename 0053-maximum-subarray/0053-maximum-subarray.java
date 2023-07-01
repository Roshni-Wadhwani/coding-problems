class Solution {
    public int maxSubArray(int[] a) {
        int sum=0;
        int xmax=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            int one=a[i];
            int two=sum+a[i];

            sum=Math.max(one,two);
            xmax=Math.max(sum,xmax);
        }
        return xmax;
    }
}