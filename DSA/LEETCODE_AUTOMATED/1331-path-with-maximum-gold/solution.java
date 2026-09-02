class Solution {
    public int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public int maxGold(int[][] grid, boolean[][] vis, int i, int j, int curGold){
        int m = grid.length, n = grid[0].length;
        if(i<0 || j<0 || i == m || j == n || grid[i][j] == 0 || vis[i][j]) return curGold;
        vis[i][j] = true;
        int localMax = curGold+grid[i][j];
        for(int[] d: dir) localMax = Math.max(localMax, maxGold(grid, vis, i+d[0], j+d[1], curGold+grid[i][j]));
        vis[i][j] = false;
        return localMax;
    }
    public int getMaximumGold(int[][] grid) {
        int m = grid.length, n = grid[0].length, maxRes = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] != 0) maxRes = Math.max(maxRes, maxGold(grid, new boolean[m][n], i, j, 0));
            }
        }
        return maxRes;
    }
}
