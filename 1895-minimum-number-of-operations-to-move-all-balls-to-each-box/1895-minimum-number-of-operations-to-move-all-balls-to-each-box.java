class Solution {
    public int[] minOperations(String boxes) {
        int[]   ansArr  =   new int[boxes.length()];
        String[] boxArr =   boxes.split("");
        List<Integer>oneIndex   =   new ArrayList<>();
        List<Integer>zeroIndex  =   new ArrayList<>();

        for(int i=0;i<boxArr.length;i++){
            if(boxArr[i].equals("1"))   oneIndex.add(i);
            else                        zeroIndex.add(i);
        }

        // System.out.println(oneIndex);
        // System.out.println(zeroIndex);

        for(int i=0;i<oneIndex.size();i++){
            int index1   =   oneIndex.get(i);
            int tempSum =   0;
            for(int j=0;j<oneIndex.size();j++){
                int index2  =   oneIndex.get(j);
                tempSum+=Math.abs(index2-index1);
                // System.out.println(index1+" "+index2+" "+tempSum);
            }
            ansArr[index1]=tempSum;
        }
        for(int i=0;i<zeroIndex.size();i++){
            int index1   =   zeroIndex.get(i);
            int tempSum =   0;
            for(int j=0;j<oneIndex.size();j++){
                int index2  =   oneIndex.get(j);
                tempSum+=Math.abs(index2-index1);
                // System.out.println(index1+" "+index2+" "+tempSum);
            }
            ansArr[index1]=tempSum;
        }
        return ansArr;

    }
}