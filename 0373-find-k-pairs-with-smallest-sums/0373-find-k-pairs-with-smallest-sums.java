class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        // brute force->memory limit exceeded
        // List<List<Integer>>op=new ArrayList<>();
        // for(int i=0;i<nums1.length;i++){
        //     int elemFirst=nums1[i];
        //     for(int j=0;j<nums2.length;j++){
        //         int elemSecond=nums2[j];
        //         List<Integer>temp=new ArrayList<>();
        //         temp.add(elemFirst);
        //         temp.add(elemSecond);
        //         op.add(temp);
        //     }
        // }
        // Collections.sort(op,(o1,o2)->(o1.get(0)+o1.get(1))-(o2.get(0)+o2.get(1)));
        // List<List<Integer>>finalOp=new ArrayList<>();
        // if(op.size()<=k)             return op;
        // for(int i=0;i<k;i++){
        //     finalOp.add(op.get(i));
        // }
        // return finalOp;

        // another brute force giving TLE
        // List<List<Integer>>op=new ArrayList<>();
        // HashMap<Integer,List<List<Integer>>>map=new HashMap<>();
        // HashSet<Integer>sortedSum=new HashSet<>();

        // for(int i=0;i<nums1.length;i++){
        //     int elemOne=nums1[i];
        //     for(int j=0;j<nums2.length;j++){
        //         int elemTwo=nums2[j];
        //         int sum=elemOne+elemTwo;
        //         sortedSum.add(sum);
        //         List<Integer>temp=new ArrayList<>();
        //         temp.add(elemOne);
        //         temp.add(elemTwo);
        //         if(map.containsKey(sum)){
        //             List<List<Integer>>temp2D=map.get(sum);
        //             temp2D.add(temp);
        //             map.put(sum,temp2D);
        //         }
        //         else{
        //             List<List<Integer>>temp2D=new ArrayList<>();
        //             temp2D.add(temp);
        //             map.put(sum,temp2D);
        //         }
                
        //     }
        // }
        // List<Integer>tempSortedSum=new ArrayList<>();
        // tempSortedSum.addAll(sortedSum);
        // Collections.sort(tempSortedSum);

        // // System.out.println(map);
        // // System.out.println(tempSortedSum);

        // int count=0;
        // for(Integer elem:tempSortedSum){
        //     boolean flag=true;
        //     List<List<Integer>>temp=map.get(elem);
        //     for(List<Integer> ele:temp)  {
        //         op.add(ele);
        //         if(op.size()==k)   {
        //             flag=false;break;
        //         }
        //     }
        //     if(!flag)           break;
        // }
        // return op;

        List<List<Integer>>op=new ArrayList<>();
        PriorityQueue<int[]>pq=new PriorityQueue<>(
            (obj1,obj2)->((obj1[0]+obj1[1])-(obj2[0]+obj2[1]))
        );

        for(int i=0;i<nums1.length;i++){
            pq.add(new int[]{nums1[i],nums2[0],0});
        }

        while(!pq.isEmpty() && k>0){
            int arr[]=pq.poll();
            List<Integer>temp=new ArrayList<>();
            temp.add(arr[0]);
            temp.add(arr[1]);
            op.add(temp);

            if(arr[2]+1<nums2.length)   
                pq.add(new int[]{arr[0],nums2[arr[2]+1],arr[2]+1});
            k--;
        }
        return op;
    }
}