class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n==1) return true;
        // boolean[] dp = new boolean[n];
        // dp[0] = true;
        // for(int i=0; i<n; i++){
        //     if(dp[i]){
        //         for(int j=i; j<Math.min(i+nums[i]+1, n); j++) dp[j] = true;
        //     }
        // }
        int max=nums[0];
        for(int i=0; i<n; i++){
            if(i > max) return false;
            max = Math.max(nums[i]+i, max);
        }
        // return dp[n-1];
        return true;
    }
}
