class Solution {
    // public int util(int i, int j, int m, int n){
    //     if(i==m-1 && j==n-1) return 1;
    //     if(i>m-1 || j>n-1) return 0;
    //     int d=util(i+1, j, m, n);
    //     int r=util(i, j+1, m, n);
    //     return d+r;
    // }
    public int util(int i, int j, int m, int n, int[][] memo){
        if(i==m-1 && j==n-1) return 1;
        if(i>m-1 || j>n-1) return 0;
        if(memo[i][j] != -1) return memo[i][j];
        int d=util(i+1, j, m, n, memo);
        int r=util(i, j+1, m, n, memo);
        return memo[i][j] = d+r;
    }
    public int uniquePaths(int m, int n) {
        int memo[][] = new int[m+1][n+1];
        for(int[] r: memo) Arrays.fill(r, -1);
        // memo[1][1] = 1;
        // for(int i=0; i<=m ;i++){
        //     for(int j=0; j<=n; j++){
        //         if(i>0 && j>0) memo[i][j] = memo[i-1][j]+memo[i][j-1];
        //     }
        // }
        return util(0, 0, m, n, memo);
        // return memo[m][n];
    }
}
