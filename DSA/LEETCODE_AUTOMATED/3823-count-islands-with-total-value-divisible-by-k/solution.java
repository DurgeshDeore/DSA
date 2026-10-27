class Solution {
    // public int mod = 1_000_000_007;
    public int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public long getSum(int[][] grid, int i, int j) {
        int n = grid.length, m = grid[0].length;
        if (i < 0 || i == n || j < 0 || j == m || grid[i][j] == 0)
            return 0;
        long sum = grid[i][j];
        grid[i][j] = 0; // mark vis
        for (int[] d : dir) {
            // int cur = getSum(grid, i+d[0], j+d[1]);
            // sum = (sum+cur) % mod;
            sum += getSum(grid, i+d[0], j+d[1]);
        }
        return sum;
    }

    public int countIslands(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length, isLands = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] != 0) { 
                    long val = getSum(grid, i, j);
                    if(val%k == 0) isLands += 1;
                } 
            }
        }
        return isLands;
    }
}
