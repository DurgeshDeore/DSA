class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0, r=matrix.length* matrix[0].length-1, m=matrix[0].length;
        while(l<=r){
            int mid=l+(r-l)/2;
            int val=matrix[mid/m][mid%m];
            if(val==target){
                return true;
            }else if(val<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return false;
    }
}
