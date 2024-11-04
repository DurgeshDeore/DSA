class Solution
{
    void interchange(int matrix[][], int r, int c)
    {
        for(int i=0; i<r; i++){
            int temp = matrix[i][0]; //store in temp
            matrix[i][0] = matrix[i][c-1]; //swap
            matrix[i][c-1] = temp; //swap
        }
        for(int i=0; i<r; i++){ //print matrix
            for(int j=0; j<c; j++){
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
