class Solution {
    class Pair implements Comparable<Pair>{
        int absDiff;
        int index;
        Pair(int absDiff,int index){
            this.absDiff=absDiff;
            this.index=index;
        }
        public int compareTo(Pair obj){
            if(obj.absDiff==absDiff){
                return index-obj.index;
            }
            return absDiff-obj.absDiff;
        }
        
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>ans=new ArrayList<>();
        List<Integer>indexes=new ArrayList<>();
        PriorityQueue<Pair>maxHeap=new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++){
            int diff=Math.abs(arr[i]-x);
            maxHeap.add(new Pair(diff,i));
        }
        
        int count=0;
        while(count!=k){
            Pair temp=maxHeap.poll();
            count++;
            indexes.add(temp.index);
        }
        System.out.println("indexes: "+indexes);
        Collections.sort(indexes);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        for(int i=0;i<indexes.size();i++){
            int tempIndex=indexes.get(i);
            ans.add(arr[tempIndex]);
        }
        return ans;
    }
}