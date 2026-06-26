class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];
        String[] res = new String[m];
        for(int i=0; i<m; i++) Arrays.fill(grid[i], '#');

        for(int j=0; j<n; j++) grid[0][j] = '.';
        for(int i=0; i<m; i++) grid[i][n-1] = '.';
        
        for(int i=0; i<m; i++) res[i] = new String(grid[i]);
        return res;
    }
}
