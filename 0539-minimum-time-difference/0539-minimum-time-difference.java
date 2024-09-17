import java.util.*;

class Solution {

    public int doSub(int h1, int m1, int h2, int m2) {
        int diff = ((h2 - h1) * 60) + (m2 - m1);
        return Math.min(diff, 1440 - diff);  // 1440 minutes in a day
    }

    public int findMinDifference(List<String> timePoints) {
        int finAns = Integer.MAX_VALUE;

        // Convert time points to minutes and sort them
        List<int[]> times = new ArrayList<>();
        for (String time : timePoints) {
            String[] split = time.split(":");
            int hour = Integer.parseInt(split[0]);
            int minute = Integer.parseInt(split[1]);
            times.add(new int[]{hour, minute});
        }
        times.sort((a, b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]);

        // Compare adjacent time points
        for (int i = 1; i < times.size(); i++) {
            int[] time1 = times.get(i - 1);
            int[] time2 = times.get(i);
            finAns = Math.min(finAns, doSub(time1[0], time1[1], time2[0], time2[1]));
        }

        // Compare the first and last time points for the circular time case
        int[] firstTime = times.get(0);
        int[] lastTime = times.get(times.size() - 1);
        finAns = Math.min(finAns, doSub(lastTime[0], lastTime[1], firstTime[0] + 24, firstTime[1]));

        return finAns;
    }
}
