class Solution {
    public int longestSubarray(int[] nums) {
        int arr[]=new int[nums.length];
        List<Integer>li=new ArrayList<>();
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==0){
                arr[i]=0;
                li.add(i);
            }
            else        arr[i]=arr[i-1]+nums[i];
        }

        // for(int i=0;i<nums.length;i++)   System.out.print(nums[i]+" ");
        // System.out.println();
        // for(int i=0;i<arr.length;i++)   System.out.print(arr[i]+" ");
        // System.out.println("li: "+li);

        int temp=-1;
        int xmax=-1;
        
        for(int i=0;i<li.size()-1;i++){
            if(li.get(i)==0)            temp=li.get(i)+arr[li.get(i+1)-1];
            else{
                temp=arr[li.get(i)-1]+arr[li.get(i+1)-1];
                if(arr[li.get(i)-1]==0)  temp=0;
            }
            xmax=Math.max(xmax,temp);
        }
        if(li.size()==0)            return nums.length-1;
        else if(li.size()==nums.length)     return 0;
        else if(li.get(li.size()-1)==0) 
            xmax=Math.max(xmax,arr[li.get(li.size()-1)]+arr[arr.length-1]);
        else    
            xmax=Math.max(xmax,arr[li.get(li.size()-1)-1]+arr[arr.length-1]);
        return xmax;
    }
}