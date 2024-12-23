// Method = iteretion thorught row and col
// brute force approach
class Solution {   
    public boolean searchRowMatrix(int[][] mat, int x) {
        for(int i=0; i<mat.length; i++){
            for(int j=0;j<mat[0].length; j++){
                if(mat[i][j] == x){
                    return true;
                }
            }
        }
        //int r=0; j=0;
        return false;
    }
}
