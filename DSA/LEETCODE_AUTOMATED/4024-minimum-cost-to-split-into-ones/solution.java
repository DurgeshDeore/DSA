class Solution {
    public int minCost(int n) {
        if(n == 1 || n == 2) return n-1;
        int[] dp = new int[n+1];
        dp[2]=1;
        dp[3]=3;
        for(int i=4; i<n+1; i++){
            dp[i] = dp[i-1]+(i-1);
        }
        return dp[n];
    }
}
