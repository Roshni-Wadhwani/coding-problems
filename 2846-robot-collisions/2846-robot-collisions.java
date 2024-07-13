import java.util.*;

class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] health, String directions) {
        // Map to store position to index mapping for easy lookup
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < positions.length; i++) {
            map.put(positions[i], i);
        }
        
        // Sort positions to process robots in the order of their positions
        Arrays.sort(positions);
        
        // Stack to manage robots during collision checks
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < positions.length; i++) {
            int ele = positions[i]; // Current position
            int getIndexCurrent = map.get(ele); // Index of the current position

            while (!stack.isEmpty()) {
                int peek = stack.peek(); // Previous position
                int getIndexPrev = map.get(peek); // Index of the previous position
                char getPrevDir = directions.charAt(getIndexPrev); // Direction of the previous robot
                char getCurrDir = directions.charAt(getIndexCurrent); // Direction of the current robot

                // Only resolve collision if they are moving towards each other
                if (getPrevDir == 'R' && getCurrDir == 'L') {
                    if (health[getIndexCurrent] == health[getIndexPrev]) {
                        health[getIndexPrev] = 0;
                        health[getIndexCurrent] = 0;
                        stack.pop();
                        break; // Both robots are destroyed
                    } else if (health[getIndexCurrent] < health[getIndexPrev]) {
                        health[getIndexCurrent] = 0;
                        health[getIndexPrev] -= 1;
                        break; // Current robot is destroyed
                    } else {
                        health[getIndexPrev] = 0;
                        health[getIndexCurrent] -= 1;
                        stack.pop();
                    }
                } else {
                    break; // No collision possible
                }
            }

            // Push current robot to stack if it's not destroyed
            if (health[getIndexCurrent] > 0) {
                stack.push(ele);
            }
        }

        // Collect the healths of the survived robots
        List<Integer> ans = new ArrayList<>();
        for (int h : health) {
            if (h > 0) {
                ans.add(h);
            }
        }
        return ans;
    }
}
