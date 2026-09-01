class Solution {
    public void dfsHorizonatal(char[][] board, int x, int y){
        int n = board.length, m = board[0].length;
        for(int i=x-1; i>=0 && board[i][y] == 'X'; i--) board[i][y] = '.'; // left 
        for(int i=x+1; i<n && board[i][y] == 'X'; i++) board[i][y] = '.';   //right
    }
    public void dfsVertcal(char[][] board, int x, int y){
        int n = board.length, m = board[0].length;
        for(int j=y-1; j>=0 && board[x][j] == 'X'; j--) board[x][j] = '.'; // up 
        for(int j=y+1; j<m && board[x][j] == 'X'; j++) board[x][j] = '.';   // down
    }
    public int countBattleships(char[][] board) {
        int n = board.length, m = board[0].length, battleships = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == 'X') {
                    dfsHorizonatal(board, i, j);
                    dfsVertcal(board, i, j);
                    board[i][j] = '.';
                    battleships += 1;
                }
            }
        }
        return battleships;
    }
}
