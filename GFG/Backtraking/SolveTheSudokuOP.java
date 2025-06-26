// User function Template for Java

class Solution {
    static boolean[][] rowUsed ;
    static boolean[][] colUsed ;
    static boolean[][] boxUsed ;
    
    static int getBoxIndx(int r, int c){
        return (r/3)*3+(c/3);
    }
    static boolean solve(int[][] mat, int r, int c){
        if(r==9) return true;
        int nxtR = r, nxtC = c+1;
        if(c+1 == 9){
            nxtR = r+1;
            nxtC = 0;
        }
        if (mat[r][c] != 0) return solve(mat, nxtR, nxtC);
        for(int i=1; i<=9; i++){
            int boxIndx = getBoxIndx(r,c);
            if(!rowUsed[r][i] && !colUsed[c][i] && !boxUsed[boxIndx][i]){
                mat[r][c] = i;
                rowUsed[r][i] = colUsed[c][i] = boxUsed[boxIndx][i] = true;
                if(solve(mat, nxtR, nxtC)) return true; 
                mat[r][c] = 0;
                rowUsed[r][i] = colUsed[c][i] = boxUsed[boxIndx][i] = false;
            }
        }
        return false;
    }
    static void solveSudoku(int[][] mat) {
        rowUsed=new boolean[9][10];
        colUsed=new boolean[9][10];
        boxUsed=new boolean[9][10];
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                int val = mat[r][c];
                if (val != 0) {
                    int boxIndx = getBoxIndx(r, c);
                    rowUsed[r][val] = true;
                    colUsed[c][val] = true;
                    boxUsed[boxIndx][val] = true;
                }
            }
        }
        solve(mat,0,0);
    }
}
