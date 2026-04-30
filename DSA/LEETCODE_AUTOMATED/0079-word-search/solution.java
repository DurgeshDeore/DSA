class Solution {
    public int dir[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public boolean isValid(int x, int y, int m, int n){
        if(x<0 || y<0 || x>=m || y>=n) return false;
        return true;
    }
    public boolean isFound(char[][] board, boolean[][] vis, String word, int indx, int i, int j){
        int m=board.length, n=board[0].length;
        if(indx == word.length()) return true;
        if(vis[i][j] || board[i][j] != word.charAt(indx)) return false; 
        if(indx ==  word.length()-1 && board[i][j] == word.charAt(indx)) return true;
        vis[i][j] = true;
        for(int[] d: dir){
            int x=i+d[0], y=j+d[1];
            if(isValid(x,y,m,n)){
                if(isFound(board, vis, word, indx+1, x, y)) return true;
            }
        }
        vis[i][j] = false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int m=board.length, n=board[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!vis[i][j] && word.charAt(0) == board[i][j]){
                    if(isFound(board, vis, word, 0, i, j)) return true;
                }
            }
        }
        return false;
    }
}
