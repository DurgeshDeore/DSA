// User function Template for Java

class Solution {
    static boolean isSafe(int[][] mat, int r, int c, int digit){
        for(int i=0; i<9; i++){
            if(mat[r][i] == digit) return false;
            if(mat[i][c] == digit) return false;
        }
        int curR = (r/3)*3;
        int curC = (c/3)*3;
        for(int i=curR; i<curR+3; i++){
            for(int j=curC; j<curC+3; j++){
                if(mat[i][j] == digit) return false;
            }
        }
        return true;
    }
    static boolean util(int[][] mat, int r, int c) {
        if(r==9){
            return true;
        }
        int nxtR = r, nxtC = c+1;
        if(c+1 == 9){
            nxtR=r+1;
            nxtC=0;
        }
        if(mat[r][c] != 0){
            return util(mat, nxtR, nxtC);
        }
        for(int i=1; i<10; i++){
            if(isSafe(mat,r,c,i)){
                mat[r][c] = i;
                if(util(mat, nxtR, nxtC)) return true;
                mat[r][c] = 0;
            }
        }
        return false;
    }
    static void solveSudoku(int[][] mat) {
        util(mat, 0, 0);
    }
}
