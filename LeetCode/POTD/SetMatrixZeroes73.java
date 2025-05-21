class Solution {
    public void setZeroes(int[][] matrix) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = matrix[0].length, n = matrix.length, k=-1;
        //find the 0
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    if(map.containsKey(i)){
                        map.put(k--,j);
                    }else if(map.containsValue(j)){
                        map.put(i,k--);
                    }else{
                        map.put(i,j);
                    }
                }
            }
        }
        //reset the matrix;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map.containsKey(i) || map.containsValue(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
