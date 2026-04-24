class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length, res = Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
            for(int j=0; j<n; j++){
                int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE, up = matrix[i-1][j];
                if(j == 0){
                    right = matrix[i-1][j+1];
                }else if(j == n-1){
                    left = matrix[i-1][j-1];
                }else{
                    right = matrix[i-1][j+1];
                    left = matrix[i-1][j-1];
                }
                matrix[i][j] += Math.min(left, Math.min(up, right));
            }
        }
        for(int j=0; j<n; j++) res = Math.min(res, matrix[n-1][j]);
        return res;
    }
}
