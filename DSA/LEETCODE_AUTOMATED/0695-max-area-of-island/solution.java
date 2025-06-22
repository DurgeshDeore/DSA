class Solution {
    public int helper(int[][] grid, int n, int m, int r, int c){
        if(r < 0 || r >= n || c < 0 || c >= m || grid[r][c] == 0){
            return 0;
        }
        grid[r][c] = 0;
        int ans = 1;
        ans += helper(grid,n,m,r,c-1);
        ans += helper(grid,n,m,r,c+1);
        ans += helper(grid,n,m,r+1,c);
        ans += helper(grid,n,m,r-1,c);
        return ans;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length, max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                max = Math.max(helper(grid,n,m,i,j), max);
            }
        }
        return max;
    }
}
