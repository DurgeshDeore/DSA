class Solution {
    public int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public int helper(int[][] grid, boolean[][] vis, int empty,  int i, int j, int x, int y){
        int m = grid.length, n = grid[0].length;
        if(i < 0 || i == m || j < 0 || j == n || vis[i][j] || grid[i][j] == -1) return 0;
        if(i == x && j == y && empty == 0) return 1;
        int paths = 0;
        vis[i][j] = true;
        empty -= 1;
        for(int[] d: dir){
            paths += helper(grid, vis, empty, i+d[0], j+d[1], x, y);
        }
        vis[i][j] = false;
        empty += 1;
        return paths;
    }
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length, n = grid[0].length, empty = 0, uniquePaths = 0;
        int[] start = new int[2];
        int[] finish = new int[2];
        boolean[][] vis = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1) start = new int[]{i, j};
                else if(grid[i][j] == 2) finish = new int[]{i, j};
                else if(grid[i][j] == 0) empty += 1;
            }
        }
        uniquePaths = helper(grid, vis, empty+1, start[0], start[1], finish[0], finish[1]);
        return uniquePaths;
    }
}
