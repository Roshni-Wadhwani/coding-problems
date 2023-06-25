class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int xmax=-1;
        List<Boolean>res=new ArrayList<>();
        for(int i=0;i<candies.length;i++)   xmax=Math.max(xmax,candies[i]);

        for(int i=0;i<candies.length;i++){
            int tempSum=candies[i]+extraCandies;
            if(tempSum>=xmax)   res.add(true);
            else                res.add(false);
        }
        return res;

    }
}