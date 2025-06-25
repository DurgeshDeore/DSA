class Solution {
    public void util(List<List<String>> res, char[][] board, int n, int r){
        if(r == n){
            addRes(res, board, n);
            return;
        }
        for(int c=0; c<n; c++){
            if(isSafe(board, r, c)){
                board[r][c] = 'Q';
                util(res, board, n, r+1);
                board[r][c] = '.';
            }
        }
    }
    public void addRes(List<List<String>> res, char[][] board,  int n){
        ArrayList<String> cur = new ArrayList<>();
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append(board[i][j]);
            }
            cur.add(sb.toString());
        }
        res.add(cur);
    }
    public boolean isSafe(char[][] board, int r, int c){
        for(int i=0; i<board.length; i++){
            if(board[i][c] == 'Q') return false; 
        }
        for(int i=r, j=c; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q') return false; 
        }
        for(int i=r, j=c; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q') return false; 
        }
        for(int i=0; i<board.length; i++){
            if(board[r][i] == 'Q') return false; 
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        util(res, board, n, 0);
        return res;
    }
}
