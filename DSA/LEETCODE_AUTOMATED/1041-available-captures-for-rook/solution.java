class Solution {
    public int numRookCaptures(char[][] board) {
        int res = 0;
        int[] pos = new int[2];
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(board[i][j] == 'R'){
                    pos[0] = i;
                    pos[1] = j;
                    break;
                }
            }
        }
        //right
        for(int j=pos[1]; j<8; j++){
            if(board[pos[0]][j] == 'B') break;
            if(board[pos[0]][j] == 'p'){
                res += 1;
                break;
            }
        }
        for(int j=pos[1]; j>=0; j--){
            if(board[pos[0]][j] == 'B') break;
            if(board[pos[0]][j] == 'p'){
                res += 1;
                break;
            }
        }
        for(int i=pos[0]; i<8; i++){
            if(board[i][pos[1]] == 'B') break;
            if(board[i][pos[1]] == 'p'){
                res += 1;
                break;
            }
        }
        for(int i=pos[0]; i>=0; i--){
            if(board[i][pos[1]] == 'B') break;
            if(board[i][pos[1]] == 'p'){
                res += 1;
                break;
            }
        }
        return res;
    }
}
