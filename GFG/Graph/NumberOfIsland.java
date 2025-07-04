class Solution {
    public void util(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 'W'){
            return;
        }
        grid[i][j] = 'W';
        util(grid, i-1, j);
        util(grid, i+1, j);
        util(grid, i, j-1);
        util(grid, i, j+1);
        util(grid, i+1, j+1);
        util(grid, i+1, j-1);
        util(grid, i-1, j+1);
        util(grid, i-1, j-1);
    }
    public int countIslands(char[][] grid) {
        int island = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] != 'W'){
                    util(grid, i, j);
                    island+=1;
                }
            }
        }
        return island;
    }
}
