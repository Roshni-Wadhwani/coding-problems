class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        HashMap<Double,String>frac=new HashMap<>();
        List<Double>li=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            int num1=arr[i];
            
            for(int j=i+1;j<arr.length;j++){
                int num2=arr[j];
                double ansDiv=(double)num1/num2;
                String temp=String.valueOf(num1)+"/"+String.valueOf(num2);
                frac.put(ansDiv,temp);
                li.add(ansDiv);
            }
        }
        
        Collections.sort(li);
        double ansFinal=li.get(k-1);
        
        //get key
        String ansKey=frac.get(ansFinal);
        
        
        int a[]=new int[2];
        
        String ansArray[]=ansKey.split("/");
        
        a[0]=Integer.parseInt(ansArray[0]);
        a[1]=Integer.parseInt(ansArray[1]);
        
        return a;
    }
}