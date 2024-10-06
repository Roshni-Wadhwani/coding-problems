class Solution {
    public long dividePlayers(int[] skill) {
        // long ans=0;
        // Arrays.sort(skill);

        // int tempProd=skill[0]+skill[skill.length-1];
        // for(int i=1;i<skill.length/2;i++){
        //     int tempPr=skill[i]+skill[skill.length-1-i];
        //     if(tempPr!=tempProd)          return -1;
        // }
        // for(int i=0;i<skill.length/2;i++){
        //     ans+=(skill[i]*skill[skill.length-1-i]);
        // }

        // return ans;


        int totalSum=0;
        int n=skill.length;
        int skillFreq[]=new int[10001];
        long ans=0;

        for(int i=0;i<skill.length;i++)     {
            skillFreq[skill[i]]+=1;
            totalSum+=skill[i];
        }

        if(totalSum % (n/2) !=  0)          return -1;
        int expectSum   =   totalSum/(n/2);//8

        for(int i=0;i<skill.length;i++){
            int selfSkill=skill[i];//5

            int partnerSkill=expectSum-selfSkill;

            if(skillFreq[partnerSkill]==0)      return -1;
            else                                skillFreq[partnerSkill]--;

            ans+=((long)selfSkill*(long)partnerSkill);
        }

        return ans/2;
    }
}