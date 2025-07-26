class Solution {
    public void setZero(int[][] mat, int r, int c){
        for(int i=0; i<mat.length; i++) mat[i][c]=0;
        for(int i=0; i<mat[0].length; i++) mat[r][i]=0;
    }
    public void setMatrixZeroes(int[][] mat) {
        ArrayList<int[]> pairs = new ArrayList<>();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==0) pairs.add(new int[]{i, j});
            }
        }
        for(int[] p: pairs){
            setZero(mat, p[0], p[1]);
        }
    }
}
