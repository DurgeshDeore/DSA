class Solution {
    public int getMaxSqr(int[][] mat, int r, int c){    // func. for find square
        int n=mat.length, m=mat[0].length, res = 1, upLimit = r-mat[r][c], downLimit = r+mat[r][c];
        boolean validUp = true, validDown = true;
        for(int i=r; i<downLimit; i++){
            if( i>=n|| (mat[i][c] < mat[r][c])){
                validUp = false;
                break;
            }
        }
        for(int i=r; i>upLimit; i--){
            if(i<0 || (mat[i][c] < mat[r][c])){
                validDown = false;
                break;
            }
        }
        if(validUp || validDown) res = Math.max(res, (mat[r][c]*mat[r][c]));
        return res;
    }
    public int maximalSquare(char[][] matrix) {
        // approach 1: use prefix fails at TC 78
        int n=matrix.length, m=matrix[0].length, res = 0;
        // int cnt =0 ;
        // int[][] mat = new int[n][m];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(matrix[i][j] == '1') cnt += 1;
        //         else cnt = 0;
        //         mat[i][j] = cnt; 
        //     }
        //     cnt = 0;
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(mat[i][j] >= 1){
        //             if(mat[i][j] == 1) res = Math.max(res, 1);
        //             else res = Math.max(res, getMaxSqr(mat, i, j));
        //         }
        //     }
        //     cnt = 0;
        // }

        // approach 2: use two prefix not working 
        // int cnt =0 ;
        // int[][] mat1 = new int[n][m];
        // int[][] mat2 = new int[n][m];
        // for(int i=0; i<n; i++){         // for left to right
        //     for(int j=0; j<m; j++){
        //         if(matrix[i][j] == '1') cnt += 1;
        //         else cnt = 0;
        //         mat1[i][j] = cnt; 
        //     }
        //     cnt = 0;
        // }
        // cnt = 0;
        // for(int j=0; j<m; j++){         // for up to down
        //     for(int i=0; i<n; i++){
        //         if(matrix[i][j] == '1') cnt += 1;
        //         else cnt = 0;
        //         mat2[i][j] = cnt; 
        //     }
        //     cnt = 0;
        // }
        // for(int j=0; j<m; j++){         // find min to get max sqr
        //     for(int i=0; i<n; i++){
        //         if(matrix[i][j] == '1') {
        //             int minVal = Math.min(mat1[i][j], mat2[i][j]);
        //             res = Math.max(res, minVal * minVal);
        //         }
        //     }
        // }

        // approach 3: use dp 
        int width = 0;
        int[][] dp = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                dp[i][j] = matrix[i][j] == '1'? 1: 0;
                if(matrix[i][j] == '1') width = 1;
            }
        }
        if(width == 0) return 0;
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(dp[i][j] != 0){
                    if((dp[i-1][j-1] >= 1) && (dp[i-1][j] >= 1) && (dp[i][j-1] >= 1)){
                        dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1]);
                        width = Math.max(width, dp[i][j]);
                    }
                }
            }
        }
        // return res;
        return width * width;
    }
}
