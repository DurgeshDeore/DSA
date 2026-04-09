class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length, m=grid[0].length;

        // for(int i=1; i<n; i++) grid[i][0] += grid[i-1][0];
        // for(int j=1; j<n; j++) grid[0][j] += grid[0][j-1];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i == 0 && j > 0)
                    grid[i][j] += grid[i][j-1];
                else if(j == 0 && i > 0)
                    grid[i][j] += grid[i-1][j];
                else if(j > 0 && i > 0)
                    grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }

        return grid[n-1][m-1];
    }
}
