class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = potions.length;
        int m = spells.length;
        int[] res = new int[m];
        
        for (int i = 0; i < m; i++) {
            int idx = binarySearch(spells[i], potions, 0, n, success);
            res[i] = n - idx;
        }
        
        return res;
    }

    public static int binarySearch(int prod, int[] potions, int l, int r, long success) {
        while (l < r) {
            int mid = l + (r - l) / 2;
            if ((long) potions[mid] * prod < success) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}