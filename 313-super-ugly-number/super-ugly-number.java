class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int[] idx = new int[k]; 
        for (int i = 1; i < n; i++) 
        {
            long next = Long.MAX_VALUE;
            for (int j = 0; j < k; j++) 
            {
                next = Math.min(next, (long) primes[j] * dp[idx[j]]);
            }
            dp[i] = (int) next;
            for (int j = 0; j < k; j++) 
            {
                if ((long) primes[j] * dp[idx[j]] == next) 
                {
                    idx[j]++;
                }
            }
        }
        return dp[n - 1];
    }
}