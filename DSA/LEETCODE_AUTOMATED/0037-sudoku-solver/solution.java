class Solution {
    public boolean isSafe(char[][] board, int r, int c, char num){
        for (int i = 0; i < 9; i++) {
            if(board[r][i] == num) return false;
            if(board[i][c] == num) return false;
        }
        int bR = (r/3)*3, bC = (c/3)*3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[bR+i][bC+j] == num) return false;
            }
        }
        return true;        
    }
    public boolean solve(char[][] board, int r, int c){
        if(r == 9) return true; // solved
        if(c == 9) return solve(board, r+1, 0);
        if(board[r][c] != '.') return solve(board, r, c+1);
        for(char num = '1'; num <= '9'; num++){
            if(isSafe(board, r, c, num)){
                board[r][c] = num;
                if(solve(board, r, c+1)) return true;
                board[r][c] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
}
