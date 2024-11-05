class GFG {
    static void rotate(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        //solution 1
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         int temp = mat[i][j];
        //         mat[i][j] = mat[j][i];
        //         mat[j][i] = temp;
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         int temp = mat[i][j];
        //         mat[i][j] = mat[i][n-j-1];
        //         mat[i][n-j-1] = temp;
        //     }
        // }

        //solution 2
        int arr[][] = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[j][i] = mat[m-1-i][j]; // flip the matrix
            }
        }
        for(int i=0;i<m; i++){ 
            mat[i] = arr[i]; 
        }
    }
}
