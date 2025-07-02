// User function Template for Java

class Solution {
    public int permutationCoeff(int n, int k) {
        int[] dp = new int[n+1];
        // dp[0] =0;
        // dp[1] = 1;
        // for(int i=2; i<=n; i++) dp[i] = i*dp[i-1];
        // return dp[n]/dp[n-k];
        int mod = 1_000_000_007;
        long ans = 1;
        for(int i=0; i<k; i++) ans = (ans*(n-i) % mod);
        return (int) ans;
    }
}
