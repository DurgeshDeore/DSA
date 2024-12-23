//method = binary search
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0, rows=matrix.length, cols=matrix[0].length, col=matrix[0].length-1 ;
        while(row<rows && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target ){
                col--;
            }else if(col >= 0){
                row++;
            }
        }
        return false;
    }
}
