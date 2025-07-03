class Solution {
    int ans=Integer.MAX_VALUE;
    int[] x={2,2,-2,-2,1,1,-1,-1};
    int[] y={-1,1,-1,1,-2,2,-2,2};
    public void util(int[][] board, boolean[][] vis, int m, int n, int i, int j, int steps){
        if(i<=0 || j<=0 || i>=board.length || j>=board[0].length){
            return;
        }
        if(vis[i][j]) return;
        if(i==m && j==n){
            ans = Math.min(ans, steps);
            return;
        }
        vis[i][j] = true;
        for(int k=0; k<8; k++){
            util(board, vis, m, n, i+x[k], j+y[k], steps+1);
        }
        vis[i][j] = false;
    }
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n) {
        int[][] board = new int[n+1][n+1];
        boolean[][] vis = new boolean[n+1][n+1];
        util(board, vis, targetPos[0], targetPos[1], knightPos[0], knightPos[1], 0);
        return (ans == Integer.MAX_VALUE)? -1: ans;
    }
}
