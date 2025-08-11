import java.util.*;

class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length, m = moveTime[0].length;
        int[][] visit = new int[n][m];
        for (int i = 0; i < n; i++) Arrays.fill(visit[i], Integer.MAX_VALUE);

        PriorityQueue<int[]> que = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));
        que.add(new int[]{0, 0, 0}); // row, col, time
        visit[0][0] = 0;

        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int row = cur[0], col = cur[1], time = cur[2];

            if (row == n - 1 && col == m - 1) return time;

            for (int[] d : dirs) {
                int nr = row + d[0];
                int nc = col + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    int arrival = time; // move takes 1 sec
                    if (arrival < moveTime[nr][nc]) {
                        arrival = moveTime[nr][nc]; // wait if not open
                    }
                    arrival++;
                    if (visit[nr][nc] > arrival) {
                        visit[nr][nc] = arrival;
                        que.add(new int[]{nr, nc, arrival});
                    }
                }
            }
        }
        return -1;
    }
}
