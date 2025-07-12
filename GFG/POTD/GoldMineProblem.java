class Solution {
    // public void util(int[][] mat,int[][] dp, int i, int j, int n, int m){
    //     if(i>=n || j>=m || i<0 || j<0){
    //         return ;
    //     } 
    //     int dUp=0, r=0, dDn=0;
    //     if(i-1 >= 0 && j-1 >= 0) dUp = dp[i-1][j-1];
    //     if(j-1 >= 0) r=dp[i][j-1];
    //     if(i+1 < n && j-1>= 0) dDn = dp[i+1][j-1];
        
    //     int prev = Math.max(dUp, Math.max(r, dDn));
    //     dp[i][j] = mat[i][j] + prev;
        
    //     util(mat,dp, i-1, j+1, n, m);
    //     util(mat,dp, i, j+1, n, m);
    //     util(mat,dp, i+1, j+1, n, m);
    // }
    public int maxGold(int[][] mat) {
        int n=mat.length, m=mat[0].length;
        int dp[][] = new int[n][m];
        
        for(int i=0; i<n; i++){
            dp[i][0] = mat[i][0];
        }
        
        for(int j=1; j<m; j++){
            for(int i=0; i<n; i++){
                int dUp=0, r=0, dDn=0;
                if(i-1 >= 0 && j-1 >= 0) dUp = dp[i-1][j-1];
                if(j-1 >= 0) r=dp[i][j-1];
                if(i+1 < n && j-1>= 0) dDn = dp[i+1][j-1];
                int prev = Math.max(dUp, Math.max(r, dDn));
                dp[i][j] = mat[i][j] + prev;
            }
        }
        
        // util(mat, dp, 0, 0,n,m);
        
        int max = 0;
        for(int i=0; i<n; i++) max = Math.max(dp[i][m-1], max);
        return max;
    }
}
