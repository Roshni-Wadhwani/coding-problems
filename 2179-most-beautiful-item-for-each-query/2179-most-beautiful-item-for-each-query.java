class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        // Step 1: Sort `items` by a[0] ascending, and if same, by a[1] descending
        Arrays.sort(items, (a, b) -> {
            int first = Integer.compare(a[0], b[0]);
            if (first != 0) return first;
            return Integer.compare(b[1], a[1]);
        });

        // Step 2: Sort `queries` while remembering original indices
        int[][] indexedQueries = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            indexedQueries[i][0] = queries[i]; // Query value
            indexedQueries[i][1] = i;         // Original index
        }
        Arrays.sort(indexedQueries, Comparator.comparingInt(a -> a[0]));

        // Step 3: Use a two-pointer technique to match items to queries
        int[] result = new int[queries.length];
        int maxBeauty = 0;
        int itemIndex = 0;

        for (int[] query : indexedQueries) {
            int queryValue = query[0];
            int queryIndex = query[1];

            // Increment through `items` to find the maximum beauty for this query
            while (itemIndex < items.length && items[itemIndex][0] <= queryValue) {
                maxBeauty = Math.max(maxBeauty, items[itemIndex][1]);
                itemIndex++;
            }

            // Assign the best result for this query
            result[queryIndex] = maxBeauty;
        }

        return result;
    }
}