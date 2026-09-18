class Solution {
    public int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
    public int findPath(int[][] matrix, int[][] memo, int prev, int i, int j){
        int n = matrix.length, m = matrix[0].length;
        if(i<0 || j<0 || i>=n || j>=m || matrix[i][j] <= prev) return 0;
        // vis[i][j] = true;
        if(memo[i][j] != 0) return memo[i][j];

        // curLen += 1;  
        // int maxLen = curLen; 
        int maxLen = 0;
        for(int[] d: dir){
            int x = i+d[0], y=j+d[1];
            int len = findPath(matrix, memo, matrix[i][j], x, y);
            maxLen = Math.max(maxLen, len);
        }
        // vis[i][j] = false;
        memo[i][j] = 1+maxLen;
        return memo[i][j];
    }
    public int longestIncreasingPath(int[][] matrix) {
        // try all the paths
        int n = matrix.length, m = matrix[0].length, maxLen = 1;
        int[][] memo = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int curLen = findPath(matrix, memo, -1, i, j);
                maxLen = Math.max(maxLen, curLen);
            }
        }
        return maxLen;
    }
}
