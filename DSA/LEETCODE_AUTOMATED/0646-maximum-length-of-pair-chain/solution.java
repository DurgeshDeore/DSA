class Solution {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length, maxChain = 1;
        // approach 1: sorting + dp
        Arrays.sort(pairs, (a,b)-> a[0]-b[0]); // based on start time
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i=1; i<n; i++){
            // if(pairs[i][0] > pairs[i-1][1]) dp[i] += dp[i-1];
            // else dp[i] = dp[i-1];
            for(int j=0; j<i; j++){
                if(pairs[i][0] > pairs[j][1]) dp[i] = Math.max(dp[i], dp[j]+1);
                else dp[i] = Math.max(dp[i], dp[j]);
                maxChain = Math.max(maxChain, dp[i]);
            }
        }
        return maxChain;
    }
}
