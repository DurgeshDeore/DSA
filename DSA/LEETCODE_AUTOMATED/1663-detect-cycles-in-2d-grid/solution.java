class Solution {
    public int dir[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public boolean isCycle(char[][] grid, boolean[][] vis, char prev, int i, int j, int pi, int pj){
        int n=grid.length, m=grid[0].length;
        if(grid[i][j] != prev) return false;
        if(vis[i][j]) return true;
        vis[i][j] = true;
        for(int[] d: dir){
            int x=i+d[0], y=j+d[1];
            if(x>=0 && y>=0 && x<n && y<m){
                if((x != pi || y != pj) && isCycle(grid, vis, grid[i][j], x, y, i, j)) return true;
            }
        }
        // vis[i][j] = false;
        return false;
    }
    public boolean containsCycle(char[][] grid) {
        // dfs praent tracking
        int n=grid.length, m=grid[0].length;
        boolean[][] vis =new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!vis[i][j]){
                    if(isCycle(grid, vis, grid[i][j], i, j, -1, -1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
