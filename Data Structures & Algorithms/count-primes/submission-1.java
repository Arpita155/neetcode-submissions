class Solution {
    public int countPrimes(int n) {
        boolean[] sieve = new boolean[n];
        int res = 0;
        for (int num = 2; num < n; num++) {
            if (!sieve[num]) {
                res++;
                for (long i = num * 1L * num; i < n; i += num) {
                    sieve[(int) i] = true;
                }
            }
        }
        return res;
    }
}