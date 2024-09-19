class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer>ans=new ArrayList<>();

        if(expression.length()==0)          return ans;
        if(expression.length()==1)      {
            ans.add(Integer.parseInt(expression));
            return ans;
        }
        if(expression.length()==2 && Character.isDigit(expression.charAt(0))){
            ans.add(Integer.parseInt(expression));
            return ans;
        }

        for(int i=0;i<expression.length();i++){
            char currentChar=expression.charAt(i);

            if(Character.isDigit(currentChar))      continue;
            List<Integer>leftResults=diffWaysToCompute(expression.substring(0,i));
            List<Integer>rightResults=diffWaysToCompute(expression.substring(i+1));

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