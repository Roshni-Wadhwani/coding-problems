class Solution {
    public long dividePlayers(int[] skill) {
        long ans=0;
        Arrays.sort(skill);

        int tempProd=skill[0]+skill[skill.length-1];
        for(int i=1;i<skill.length/2;i++){
            int tempPr=skill[i]+skill[skill.length-1-i];
            if(tempPr!=tempProd)          return -1;
        }
        for(int i=0;i<skill.length/2;i++){
            ans+=(skill[i]*skill[skill.length-1-i]);
        }

        return ans;
    }
}