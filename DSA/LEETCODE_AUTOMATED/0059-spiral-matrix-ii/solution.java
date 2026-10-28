class Solution {
    public int[][] generateMatrix(int n) {
        int num = 1;
        int topLeft = 0, bottomLeft = 0, topRight = n-1, bottomRight = n-1;
        int[][] res = new int[n][n];
        while(num <= n*n){
            for(int j=topLeft; j<=topRight; j++) res[topLeft][j] = num++;
            topLeft += 1;
            for(int i=topLeft; i<bottomRight; i++) res[i][bottomRight] = num++;
            topRight -= 1;
            for(int j=bottomRight; j>bottomLeft; j--) res[bottomRight][j] = num++;
           
            for(int i=bottomRight; i>=topLeft; i--) res[i][bottomLeft] = num++;
            bottomLeft += 1;
            bottomRight -= 1;
        }
        return res;
    }
}
