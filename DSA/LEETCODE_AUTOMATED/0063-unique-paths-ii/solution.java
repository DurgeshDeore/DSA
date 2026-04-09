class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];

        if(obstacleGrid[n-1][m-1] == 1 || obstacleGrid[0][0] == 1) return 0;

        // if(m == 1)
        // for(int i=1; i<n; i++) dp[i][0] = 1;
        // Arrays.fill(dp[0], 1);
        dp[0][0] = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i>0 && obstacleGrid[i-1][j] != 1)
                    dp[i][j] += dp[i-1][j];
                if(j > 0 && obstacleGrid[i][j-1] != 1)
                    dp[i][j] += dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
    }
}
