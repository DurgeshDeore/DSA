class Solution {
    public int countServers(int[][] grid) {
        // JP Morgan
        int res = 0, m = grid[0].length, n = grid.length;
        int[] rows = new int[n];
        int[] cols = new int[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    rows[i] += 1;
                    cols[j] += 1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1 && (rows[i] > 1 || cols[j] > 1)){
                    res += 1;
                }
            }
        }

        return res;
    }
}
