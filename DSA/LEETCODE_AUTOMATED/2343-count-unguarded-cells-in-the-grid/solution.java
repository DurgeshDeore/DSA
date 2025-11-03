class Solution {
    public void fillGrid(int[][] grid, int row, int col, int m, int n) {
        for (int i = row + 1; i < m; i++) {
            if (grid[i][col] == 2 || grid[i][col] == 3) break;
            if (grid[i][col] == 0) grid[i][col] = 1;
        }
        for (int i = row - 1; i >= 0; i--) {
            if (grid[i][col] == 2 || grid[i][col] == 3) break;
            if (grid[i][col] == 0) grid[i][col] = 1;
        }
        for (int j = col + 1; j < n; j++) {
            if (grid[row][j] == 2 || grid[row][j] == 3) break;
            if (grid[row][j] == 0) grid[row][j] = 1;
        }
        for (int j = col - 1; j >= 0; j--) {
            if (grid[row][j] == 2 || grid[row][j] == 3) break;
            if (grid[row][j] == 0) grid[row][j] = 1;
        }
    }

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {

        int[][] grid = new int[m][n];

        for (int[] w : walls) grid[w[0]][w[1]] = 2;
        for (int[] g : guards) grid[g[0]][g[1]] = 3;

        for (int[] g : guards) {
            fillGrid(grid, g[0], g[1], m, n);
        }
        int res = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 0)
                    res++;
            }
        } 
        return res;
    }
}
