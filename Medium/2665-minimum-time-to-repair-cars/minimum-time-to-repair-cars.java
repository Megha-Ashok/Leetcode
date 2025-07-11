class Solution {
    private boolean isPossible(int[] ranks, long mid, int cars) {
        long carsRepaired = 0;
        for (int rank : ranks) {
            carsRepaired += Math.sqrt(1.0 * mid / rank);
        }
        return carsRepaired >= cars;
    }

    public long repairCars(int[] ranks, int cars) {
        long l = 1;
        long r = 1L * cars * cars * Arrays.stream(ranks).max().orElse(Integer.MIN_VALUE);
        long result = -1;

        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (isPossible(ranks, mid, cars)) {
                result = mid;
                r = mid-1;
            } else
                l = mid + 1;
        }

        return result;
    }
}