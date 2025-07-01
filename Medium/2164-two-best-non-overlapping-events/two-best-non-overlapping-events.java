class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));  // Sort by start time
        
        int n = events.length;
        int[][] dp = new int[n][2];
        for (int[] row : dp) Arrays.fill(row, -1);
        
        return callfun(events, 0, 0, dp);
    }

    public static int callfun(int[][] events, int idx, int count, int[][] dp) {
        if (idx == events.length || count == 2) return 0;
        if (dp[idx][count] != -1) return dp[idx][count];

        int nextIdx = findNext(events, events[idx][1]);
        int take = events[idx][2] + callfun(events, nextIdx, count + 1, dp);
        int skip = callfun(events, idx + 1, count, dp);

        return dp[idx][count] = Math.max(take, skip);
    }

    public static int findNext(int[][] events, int endTime) {
        int low = 0, high = events.length - 1;
        int ans = events.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (events[mid][0] > endTime) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
