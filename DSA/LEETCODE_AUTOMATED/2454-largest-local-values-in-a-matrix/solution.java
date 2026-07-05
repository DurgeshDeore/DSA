class Solution {
    public int getMax(int[][] grid, int r, int c){
        int curMax = Integer.MIN_VALUE;
        for(int i=r; i<r+3; i++){
            for(int j=c; j<c+3; j++){
                curMax = Math.max(curMax, grid[i][j]);
            }
        }
        return curMax;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] res = new int[n-2][n-2];
        for(int i=0; i<n-2; i++){
            for(int j=0; j<n-2; j++){
                res[i][j] = getMax(grid, i, j);
            }
        }
        return res;
    }
}
