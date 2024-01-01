class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int[] flag = new int[s.length];
        int count = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (flag[j] == 0) {
                    if (s[j] >= g[i]) {
                        count++;
                        flag[j] = 1;
                        break;
                    }
                }
            }
        }

        return count;
    }
}