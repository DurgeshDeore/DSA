class Solution {
    public boolean isValid(char[][] board, int r, int c, char num){
        for (int i = 0; i < 9; i++) {
            if(board[r][i] == num && (i!=c)) return false;
            if(board[i][c] == num && (i!=r)) return false;
        }
        int bR = (r/3)*3, bC = (c/3)*3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if((bR+i) == r && (bC+j) == c) continue;
                if(board[bR+i][bC+j] == num) return false;
            }
        }
        return true;        
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.') continue;
                if(!(isValid(board, i, j, board[i][j]))) return false;
            }
        }
        return true;
    }
}
