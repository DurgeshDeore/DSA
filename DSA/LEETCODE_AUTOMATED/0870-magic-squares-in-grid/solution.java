class Solution {
    public boolean isValid(int[][] grid, int i, int j){
        int r1=0, r2=0, r3=0;
        HashSet<Integer> set = new HashSet<>();  //0-9
        for(int k=i; k<i+3; k++){
            for(int l=j; l<j+3; l++){

                if(set.contains(grid[k][l]) || grid[k][l] >= 10 || grid[k][l] <= 0) 
                    return false;
                set.add(grid[k][l]);
            }
        }
        for(int k=j; k<j+3; k++){ //row sum
            r1 += grid[i][k];
            r2 += grid[i+1][k];
            r3 += grid[i+2][k];
        }
        if((r1 != r2) || (r2 != r3) || (r1 != r3)) return false;
        int c1=0, c2=0, c3=0;
        for(int k=i; k<i+3; k++){
            c1 += grid[k][j];
            c2 += grid[k][j+1];
            c3 += grid[k][j+2];
        }
        if((c1 != c2) || (c2 != c3) || (c1 != c3)) return false;
        int d1=0, d2=0;
        for(int k=0; k<3; k++)
            d1 += grid[i+k][j+k];

        for(int k=0; k<3; k++)
            d2 += grid[i+k][j+2-k]; //imp

        if(d1 != d2) return false;

        return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        if(n < 3 || m <3) return 0;

        int res=0;
        for(int i=0; i<=n-3; i++){
            for(int j=0; j<=m-3; j++){
                if(isValid(grid, i, j)) res += 1;
            }
        }
        return res;
    }
}
