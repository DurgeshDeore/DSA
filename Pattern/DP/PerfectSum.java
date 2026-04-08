class Solution {
    // public int helper(int[] nums, int target, int i) {
    //     if( i>= nums.length) return target==0 ?1: 0;
    //     int include = 0;
    //     if(nums[i] <= target)
    //         include = helper(nums, target-nums[i], i+1);
    //     int exclude = helper(nums, target, i+1);
    //     return include+exclude;
    // }
    public int perfectSum(int[] nums, int target) {
        // return helper(nums, target, 0);
        int n=nums.length;
        int[][] dp = new int[n+1][target+1];
        dp[0][0] =1;
        for(int i=1; i<n+1; i++){
            for(int j=0; j<target+1; j++){
                int val = nums[i-1];
                dp[i][j] = dp[i-1][j];
                if(val <= j) dp[i][j] += dp[i-1][j-val];
            }
        }
        return dp[n][target];
    }
}
