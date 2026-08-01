class Solution {
    public int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};

    public void fillSafeRegion(char[][] board, int i, int j){
        int n=board.length, m=board[0].length;
        if(i<0 || j<0 || i>n-1 || j>m-1){
            return;
        }
        board[i][j] = 'S'; // make it safe
        for(int[] d: dir){
            int r = i+d[0], c= j+d[1];
            if(r>=0 && r<=n-1 && c>=0 && c<=m-1 && board[r][c] == 'O'){
                fillSafeRegion(board, r, c);
            }
        }
    }
    
    public void fillRegion(char[][] board, int i, int j){
        int n=board.length, m=board[0].length;
        if(i<0 || j<0 || i>n-1 || j>m-1){
            return;
        }
        board[i][j] = 'X';
        for(int[] d: dir){
            int r = i+d[0], c= j+d[1];
            if(r>=0 && r<=n-1 && c>=0 && c<=m-1 && board[r][c] == 'O'){
                fillRegion(board, r, c);
            }
        }
    }

    public void solve(char[][] board) {
        int n=board.length, m=board[0].length;

        for(int i=0; i<n; i++){ // fill the safe boundry
            if(board[i][0] == 'O')
                fillSafeRegion(board, i, 0);
            if(board[i][m-1] == 'O')
                fillSafeRegion(board, i, m-1);
        }
        for(int j=0; j<m; j++){ // fill the safe boundry
            if(board[0][j] == 'O')
                fillSafeRegion(board, 0, j);
            if(board[n-1][j] == 'O')
                fillSafeRegion(board, n-1, j);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == 'O') 
                    fillRegion(board, i, j);
            }
        }

        for(int i=0; i<n; i++){     // exchange S to 0
            for(int j=0; j<m; j++){
                if(board[i][j] == 'S') 
                    board[i][j] = 'O';
            }
        }
    }
}
