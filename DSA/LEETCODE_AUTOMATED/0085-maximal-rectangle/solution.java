class Solution {
    public int getRect(int[][] mat, int r, int c){
        int n=mat.length, m=mat[0].length, res = 0, curMin = mat[r][c]; 
        for(int i=r; i<n; i++){
            int width = (i-r)+1;
            curMin = Math.min(curMin, mat[i][c]);
            res = Math.max(res, curMin * width);
        }
        return res;
    }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length, m=matrix[0].length, res = 0;
        // aproach 1: prefix cal fails TC(67/76)
        int cnt =0 ;
        int[][] mat = new int[n][m];
        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                if(matrix[i][j] == '1') cnt += 1;
                else cnt = 0;
                mat[i][j] = cnt; 
                res = Math.max(res, cnt);
            }
            cnt = 0;
        }
        mat = new int[n][m]; //reset
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == '1') cnt += 1;
                else cnt = 0;
                mat[i][j] = cnt; 
                res = Math.max(res, cnt);
            }
            cnt = 0;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] >= 1){
                    if(mat[i][j] == 1) res = Math.max(res, 1);
                    else res = Math.max(res, getRect(mat, i, j));
                }
            }
        }
        return res;
    }
}
