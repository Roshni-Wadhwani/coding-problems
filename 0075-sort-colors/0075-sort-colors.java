class Solution {
    public void sortColors(int[] nums) {
    //     List<Integer>indexZeros=new ArrayList<>();
    //     List<Integer>indexOnes=new ArrayList<>();
    //     int indexCounter=0;

    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==0)          indexZeros.add(i);
    //         else if(nums[i]==1)     indexOnes.add(i);
    //     }
    //     // no need to maintain 2s list of indexes.. since if 1s and 0s falls into their places.. 2s will automatically fall into their respective places
    //     for(Integer elem:indexZeros){
    //         nums=swap(nums,indexCounter,elem);
    //         indexCounter++;
    //     }
    //     // positions of 0s, 1s and 2s changed.. therefore claering and adding again by looping through current modified nums array
    //     indexZeros.clear();
    //     indexOnes.clear();
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==0)          indexZeros.add(i);
    //         else if(nums[i]==1)     indexOnes.add(i);
    //     }
    //     for(Integer elem:indexOnes){
    //         nums=swap(nums,indexCounter,elem);
    //         indexCounter++;
    //     }
    // }

    // public static int[] swap(int a[],int index,int elem){
    //     int temp=a[index];
    //     a[index]=a[elem];
    //     a[elem]=temp;
    //     return a;
    // }





    // Without using extra space
        int indexCounter=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)   {
                nums=swap(nums,indexCounter,i);
                indexCounter++;
            }
        }
        for(int i=indexCounter;i<nums.length;i++){
            if(nums[i]==1)   {
                nums=swap(nums,indexCounter,i);
                indexCounter++;
            }
        }
    }

    public static int[] swap(int a[],int index,int elem){
        int temp=a[index];
        a[index]=a[elem];
        a[elem]=temp;
        return a;
    }

}