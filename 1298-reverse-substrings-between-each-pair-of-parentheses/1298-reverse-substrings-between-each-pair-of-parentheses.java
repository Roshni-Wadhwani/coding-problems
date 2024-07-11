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
        // (ed(et(oc))el)
        // strt=[0,2,4]
        // end=[5,5,7]

        // string="edetocel"
        // string.split=[e,d,e,t,o,c,e,l]


        // 4 to 5 reverse=>[e,d,e,t,c,o,e,l]
        // 2 to 5 reverse=>[e,d,o,c,t,e,e,l]
        // 0 to 7 reverse=>[]

        Deque<Integer> stack = new ArrayDeque<>();
        List<Integer> pairs = new ArrayList<>(Collections.nCopies(s.length(), 0));

        // Track the matching parentheses indices
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                int start = stack.pop();
                pairs.set(start, i);
                pairs.set(i, start);
            }
        }

        StringBuilder sb = new StringBuilder();
        int direction = 1; // 1 for forward, -1 for backward
        for (int i = 0; i < s.length(); i += direction) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = pairs.get(i); // jump to the matching parenthesis
                direction = -direction; // reverse the direction
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }    
}