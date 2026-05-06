class Solution {
    public int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
    public boolean isValid(int[][] grid, int i, int j){
        int m=grid.length, n=grid[0].length;
        if(i < 0 || j < 0 || i >= m || j >= n) return true;
        return (grid[i][j] == 1)? false: true;
    }
    public int helper(int[][] grid, int i, int j){
        int m=grid.length, n=grid[0].length;
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) return 0;
        int cur = 0;
        grid[i][j] = 0;
        for(int[] d: dir){
            if(isValid(grid, i+d[0], j+d[1])) cur += 1;
        }
        for(int[] d: dir){
            cur += helper(grid, i+d[0], j+d[1]);
        }
        return cur;
    }
    public int islandPerimeter(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int res=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                // if(grid[i][j] == 1) return helper(grid, i, j);
                if(grid[i][j] == 1){
                    for(int d[]: dir){
                        if(isValid(grid, i+d[0], j+d[1])) res += 1;
                    }
                }
            }
        }
        return res;
    }
}
