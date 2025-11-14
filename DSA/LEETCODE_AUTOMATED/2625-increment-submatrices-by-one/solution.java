class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] res = new int[n][n];
        for(int[] querie: queries){
            for(int i=querie[0]; i<=querie[2]; i++){
                for(int j=querie[1]; j<=querie[3]; j++){
                    res[i][j]+=1;
                }
            }
        }
        return res;
    }
}
