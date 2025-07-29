class Solution {
    void booleanMatrix(int mat[][]) {
        Set<Integer> row= new HashSet<>();
        Set<Integer> col= new HashSet<>();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==1){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        //convert arr
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(row.contains(i)) mat[i][j]=1;
                if(col.contains(j)) mat[i][j]=1;
            }
        }
    }
}
