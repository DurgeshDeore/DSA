class Solution {
    public int steps(int[] cost, int i){
        if(i >= cost.length) return 0;
        int one = cost[i] + steps(cost, i+1);
        int two = cost[i] + steps(cost, i+2);
        return Math.min(one, two);
    }
    public int helper(int[] cost, int st){
        int n=cost.length;
        int[] dp = new int[n+1];
        dp[0] = cost[st];
        dp[1] = cost[1];
        for(int i=2; i<n; i++){
            int val = cost[i];
            dp[i] = Math.min(dp[i-1]+val, dp[i-2]+val);
        }
        dp[n] = Math.min(dp[n-1], dp[n-2]);
        return dp[n];
    }
    public int minCostClimbingStairs(int[] cost) {
        return helper(cost, 0);
        // return Math.min(steps(cost, 0), steps(cost, 1));
    }
}
