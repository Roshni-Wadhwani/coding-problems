class Solution {
    public void sortColors(int[] nums) {
        List<Integer>indexZeros=new ArrayList<>();
        List<Integer>indexOnes=new ArrayList<>();
        int indexCounter=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)          indexZeros.add(i);
            else if(nums[i]==1)     indexOnes.add(i);
        }
        for(Integer elem:indexZeros){
            nums=swap(nums,indexCounter,elem);
            indexCounter++;
        }
        indexZeros.clear();
        indexOnes.clear();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)          indexZeros.add(i);
            else if(nums[i]==1)     indexOnes.add(i);
        }
        for(Integer elem:indexOnes){
            nums=swap(nums,indexCounter,elem);
            indexCounter++;
        }
    }

    public static int[] swap(int a[],int index,int elem){
        int temp=a[index];
        a[index]=a[elem];
        a[elem]=temp;
        return a;
    }


}