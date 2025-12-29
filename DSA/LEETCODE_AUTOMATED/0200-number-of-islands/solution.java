class Solution {
    public void backtrack(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i>= grid.length || j >= grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        backtrack(grid, i+1, j);
        backtrack(grid, i-1, j);
        backtrack(grid, i, j+1);
        backtrack(grid, i, j-1);
    }
    public int numIslands(char[][] grid) {
        int res = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    res += 1;
                    backtrack(grid, i, j);
                }
            }
        }
        return res;
    }
}
