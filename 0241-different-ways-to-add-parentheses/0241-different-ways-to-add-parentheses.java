class Solution {
    public List<Integer>diffWaysToCompute(String expression){
        List<Integer>[][] arr=new ArrayList[expression.length()][expression.length()];

        return compute(expression,arr,0,expression.length()-1);
    }
    public List<Integer> compute(String expression,List<Integer>[][] arr,int start,int end) {
        List<Integer>ans=new ArrayList<>();

        if(arr[start][end]!=null)              return arr[start][end];

        if(start==end)      {
            ans.add(expression.charAt(start)-'0');
            return ans;
        }
        if(end-start==1 && Character.isDigit(expression.charAt(start))){
            int st=expression.charAt(start)-'0';
            int en=expression.charAt(end)-'0';
            ans.add(10*st + en);
            return ans;
        }

        for(int i=start;i<=end;i++){
            char currentChar=expression.charAt(i);

            if(Character.isDigit(currentChar))      continue;
            List<Integer>leftResults=compute(expression,arr,start,i-1);
            List<Integer>rightResults=compute(expression,arr,i+1,end);

            for(int leftVal:leftResults){
                for(int rightVal:rightResults){
                    int computedResult=0;
                    switch(currentChar){
                        case '+': computedResult=leftVal+rightVal;break;
                        case '-': computedResult=leftVal-rightVal;break;
                        case '*': computedResult=leftVal*rightVal;break;
                    }
                    ans.add(computedResult);
                }
            }
        }
        return ans;
    }
}