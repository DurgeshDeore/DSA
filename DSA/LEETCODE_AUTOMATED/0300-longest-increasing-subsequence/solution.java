class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length, res = 1;
        // int prev=0;
        // for(int i=1; i<n; i++){
        //     if(nums[i-1]<nums[i]){
        //         prev++;
        //     }
        // }
        // return prev+1;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
                res = Math.max(res, dp[i]);
            }
        }
        return res;
    }
}
