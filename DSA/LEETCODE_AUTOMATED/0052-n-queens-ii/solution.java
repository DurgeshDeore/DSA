class Solution {
    public int res;
    public int[][] board;
    public boolean isSafe(int r, int c){
        int n = board.length;
        for(int i=0; i<r; i++) if(board[i][c] == 1) return false; //up
        // for(int i=r+1; i<n; i++) if(board[i][c] == 1) return false; // no need for down sides
        for(int i=r-1, j=c-1; i>=0 && j >=0; i--, j--) if(board[i][j] == 1) return false; // dia left
        for(int i=r-1, j=c+1; i>=0 && j <n; i--, j++) if(board[i][j] == 1) return false; // dia right
        return true;
    }
    public void solve(int r){
        int n = board.length;
        if(r == n) res += 1;
        for(int c=0; c<n; c++){
            if(isSafe(r, c)) {
                board[r][c] = 1;
                solve(r+1);
                board[r][c] = 0;
            }
        }
    }
    public int totalNQueens(int n) {
        // if(n <= 2) return 1;
        res = 0;
        board = new int[n][n];
        solve(0);
        return res;
    }
}
