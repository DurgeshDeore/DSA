class Solution {
    public int helper(int[][] grid, int i, int j){ //memo
        int m= grid.length, n=grid[0].length;
        if(i >= m || j >= n || i<0 || j <0) return 0;
        if(i == m-1 && j == n-1) return grid[m-1][n-1];
        int r = grid[i][j] + helper(grid, i, j+1);
        int d = grid[i][j] + helper(grid, i+1, j);
        return Math.min(r, d);
    }
    public int minPathSum(int[][] grid) {
        int m= grid.length, n=grid[0].length;
        // int[][] dp = new int[m+1][n+1];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i>0 && j>0)
                    grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
                else if(i > 0)
                    grid[i][j] += grid[i-1][j];
                else if(j > 0)
                    grid[i][j] += grid[i][j-1];
            }
        }
        // return helper(grid, 0, 0);
        return grid[m-1][n-1];
    }
}
