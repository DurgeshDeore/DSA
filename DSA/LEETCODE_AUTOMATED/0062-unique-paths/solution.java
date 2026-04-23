class Solution {
    // public int helper(int[][] dp, int m, int n, int i, int j){
    //     if(i >= m || j>=n) return 0; 
    //     else if(i == m-1 && j==n-1) return 1;
    //     if(dp[i][j] != -1) return dp[i][j]; 
    //     int r = helper(dp,m,n,i,j+1);
    //     int d = helper(dp,m,n,i+1,j);
    //     return dp[i][j]=r+d;
    // }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        // for(int[] row: dp) Arrays.fill(row, -1);
        // return helper(dp,m,n,0,0);

        Arrays.fill(dp[0], 1);
        for(int i=1; i<m; i++) dp[i][0] = 1;

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}
