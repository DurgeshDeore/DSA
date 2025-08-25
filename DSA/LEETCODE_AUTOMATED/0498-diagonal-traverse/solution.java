class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length, m=mat[0].length;
        int[] res= new int[n*m];
        boolean flag = true;
        int i=0, j=0, k=0;
        while(k<res.length){
            res[k++]=mat[i][j];
            if(flag){
                if(j==m-1){
                    i++;
                    flag = false;
                }else if(i==0){
                    j++;
                    flag = false;
                }else{
                    i--;
                    j++;
                }
            }else{
                if(i==n-1){
                    j++;
                    flag = true;
                }else if(j==0){
                    i++;
                    flag = true;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return res;
    }
}
