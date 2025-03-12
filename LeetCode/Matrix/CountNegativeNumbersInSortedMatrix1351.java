//100.00%
class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0, row=0, rows=grid.length, col=grid[0].length-1;
        while(row<rows && col>=0){
            if(grid[row][col] < 0){ 
                cnt+=(rows-row);
                col--;
            }else{
                row++;
            }
        }
        return cnt;
    }
}
