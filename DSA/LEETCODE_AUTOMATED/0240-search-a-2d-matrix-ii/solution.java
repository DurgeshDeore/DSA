class Solution {
    public boolean bs(int[] arr, int tar){
        int r = arr.length-1, l = 0;
        while(l<=r){
            int m = l+(r-l)/2;
            if(arr[m] == tar) return true;
            else if(arr[m] > tar) r = m-1;
            else l = m+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        for(int i=0; i<m; i++){
            if(matrix[i][0] <= target && target <= matrix[i][n-1]){
                if(bs(matrix[i], target)) return true;
            }
        }
        return false;
    }
}
