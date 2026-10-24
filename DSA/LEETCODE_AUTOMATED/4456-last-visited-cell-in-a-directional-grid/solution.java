class Solution {
    public int[] dfs(char[][] grid, int[] lstVis, int i, int j){
        int n = grid.length, m = grid[0].length;
        if(i < 0  || j < 0 || i >= n || j >= m || grid[i][j] == '.') return lstVis;
        int curChar = grid[i][j];
        grid[i][j] = '.';
        if(curChar == 'L') lstVis = dfs(grid, new int[]{i, j}, i, j-1);
        if(curChar == 'R') lstVis =  dfs(grid, new int[]{i, j}, i, j+1);
        if(curChar == 'U') lstVis =  dfs(grid, new int[]{i, j}, i-1, j);
        if(curChar == 'D') lstVis = dfs(grid, new int[]{i, j}, i+1, j);
        return lstVis;
    }
    public int[] lastVisitedCell(char[][] grid) {
        return dfs(grid, new int[]{0, 0}, 0, 0);
    }
}
