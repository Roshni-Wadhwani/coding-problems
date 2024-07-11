class Solution {
    public void reverseArr(int i1, int i2, String[] s) {
        int i = i1;
        int j = i2 - 1;

        while (i < j) {
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
    public String reverseParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] pairs = new int[s.length()];

        // Track the matching parentheses indices
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                int start = stack.pop();
                pairs[start] = i;
                pairs[i] = start;
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int direction = 1;

        while (i < s.length()) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = pairs[i];
                direction = -direction;
            } else {
                sb.append(s.charAt(i));
            }
            i += direction;
        }

        return sb.toString();
    }
}