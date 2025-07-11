class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);
        long start = 0;
        long end = (long) ranks[ranks.length - 1] * (long) cars * (long) cars;
        long result = end;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (checkPossible(ranks, mid, cars)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static boolean checkPossible(int[] ranks, long mid, int cars) {
        long carsRepaired = 0;
        for (int rank : ranks) {
            long low = 0, high = cars;
            while (low <= high) {
                long m = (low + high) / 2;
                if ((long) rank * m * m <= mid) {
                    low = m + 1;
                } else {
                    high = m - 1;
                }
            }
            carsRepaired += high;
            if (carsRepaired >= cars) return true;
        }
        return false;
    }
}
