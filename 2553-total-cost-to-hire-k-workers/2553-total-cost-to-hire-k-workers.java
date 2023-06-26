class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        // Brute force
        // List<Integer>temp=new ArrayList<>();
        // for(int i=0;i<costs.length;i++)     temp.add(costs[i]);
        // long ans=0;
        // for(int i=0;i<k;i++){
        //     int xmin=Integer.MAX_VALUE;
        //     int index=0;
        //     for(int j=0;j<temp.size() && j<candidates;j++){
        //         if(temp.get(j)<xmin){
        //             xmin=temp.get(j);
        //             index=j;
        //         }
        //     }
        //     for(int j=temp.size()-1;j>=0 && j>temp.size()-1-candidates;j--){
        //         if(temp.get(j)<xmin){
        //             xmin=temp.get(j);
        //             index=j;
        //         }
        //     }
        //     temp.remove(index);
        //     ans+=xmin;
        // }
        // return ans;




        //optimized using heap
        long ans=0;
        int l=0,r=costs.length-1;
        PriorityQueue<Integer>left=new PriorityQueue<>();
        PriorityQueue<Integer>right=new PriorityQueue<>();
        for(l=0;l<candidates;l++){
            left.add(costs[l]);
        }
        for(r=costs.length-1;r>costs.length-1-candidates && l<=r;r--){
            right.add(costs[r]);
        }
        int round=0;
        while(l<=r && round<k){
            int leftPeek=left.peek();
            int rightPeek=right.peek();
            if(leftPeek<=rightPeek){
                int tempCost=left.poll();
                left.add(costs[l]);
                l++;
                ans+=tempCost;
            }
            else{
                int tempCost=right.poll();
                right.add(costs[r]);
                r--;
                ans+=tempCost;
            }
            round++;
        }
        while(round<k){
            if(left.size()==0)  ans+=right.poll();
            else if(right.size()==0)      ans+=left.poll();
            else if(left.peek()<=right.peek())ans+=left.poll();
            else        ans+=right.poll();
            round++;
        }
        return ans;
    }
}