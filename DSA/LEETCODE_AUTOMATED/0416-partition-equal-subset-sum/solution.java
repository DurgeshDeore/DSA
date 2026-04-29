class Solution {
    public boolean helper(int[] nums, int sum, int target, int i){
        if(i>=nums.length) return false;
        if(sum+nums[i] == target) return true;
        if(sum+nums[i] < target){
            if(helper(nums, sum+nums[i], target, i+1)) return true;
        }
        if(helper(nums, sum, target, i+1)) return true;
        return false;
    }
    public boolean canPartition(int[] nums) {
        int sum=0, n=nums.length;
        for(int i: nums) sum+=i;
        if(sum%2!=0) return false;
        // return helper(nums, 0, sum/2, 0); 
        boolean[][] dp = new boolean[n+1][(sum/2)+1];
        for(int i=0; i<=n; i++) dp[i][0] = true;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<(sum/2)+1; j++){
                int val = nums[i-1];
                if(val <= j && dp[i-1][j-val]) dp[i][j] = true;
                else if(dp[i-1][j]) dp[i][j] = true;
            }
        }
        return dp[n][(sum/2)];
    }
}
