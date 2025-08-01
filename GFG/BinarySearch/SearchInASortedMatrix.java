class Solution {
    public boolean bs(int[] mat, int x) {
        int l=0, r=mat.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(mat[m]==x){
                return true;
            }else if(mat[m]>x){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int x) {
        int m=mat[0].length, n=mat.length;
        int l=0, r=n*m-1;
        // for(int i=0; i<mat.length; i++){
        //     if(mat[i][0]<=x && x<=mat[i][m-1]){
        //         return bs(mat[i], x);
        //     }
        // }
        while(l<=r){
            int mid=l+(r-l)/2;
            int val=mat[mid/m][mid%m];
            if(val==x){
                return true;
            }else if(val>x){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
    }
}
