//better appraoach
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,n=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || j==(n-i-1)) sum+=mat[i][j];
            }
        }
        return sum;
    }
}
