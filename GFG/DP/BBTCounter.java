class Solution {
    public int countBT(int h) {
        if( h ==1) return h;
        int dp[] = new int[h+1];
        dp[0] = 1;
        dp[1] = 1;
        int mod = 1_000_000_007;
        for(int i=2; i<=h; i++){
            dp[i] = (dp[i-1]*((2*dp[i-2]) %mod + dp[i-1]))%mod;
        }
        return dp[h];
    }
}
