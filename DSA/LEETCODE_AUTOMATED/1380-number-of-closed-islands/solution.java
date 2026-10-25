class Solution {
    public int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public boolean isValid(int[][] grid, int i, int j) {
        int n = grid.length, m = grid[0].length;
        if (i < 0 || i == n || j < 0 || j == m)
            return false;
        if (grid[i][j] == 1)
            return true;
        grid[i][j] = 1;
        for (int[] d : dir) {
            if (!isValid(grid, i + d[0], j + d[1]))
                return false;
        }
        return true;
    }

    public void fill(int[][] grid, int i, int j) {
        int n = grid.length, m = grid[0].length;
        if (i < 0 || i == n || j < 0 || j == m || grid[i][j] == 1)
            return;
        grid[i][j] = 1;
        for (int[] d : dir) {
            fill(grid, i + d[0], j + d[1]);
        }
    }

    public int closedIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length, isLands = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 || i == n - 1 || j == 0 || j == m - 1) && grid[i][j] == 0) { //fll invalid land
                    fill(grid, i, j);
                } 
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) { 
                    fill(grid, i, j);
                    isLands += 1;
                } 
            }
        }
        return isLands;
    }
}
