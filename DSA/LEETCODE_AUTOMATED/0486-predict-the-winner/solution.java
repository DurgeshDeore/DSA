class Solution {
    public boolean predictTheWinner(int[] nums) {
        // copy 
        int n = nums.length;
        if(n%2 == 0) return true;
        int[] dp = Arrays.copyOf(nums, n);
        for(int diff=1; diff<n; diff++){
            for(int i=0; i<n-diff; i++){
                int j=i+diff;
                dp[i] = Math.max(nums[i] - dp[i + 1], nums[j] - dp[i]);
            }
        }
        return dp[0] >= 0;
    }
}
