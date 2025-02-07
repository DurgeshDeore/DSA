//method = hashing
//brute force
class Solution {
    public void setZeroes(int[][] matrix) {
        Map<Integer, Integer> map = new HashMap<>();
        int k=-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(map.containsKey(i)) map.put(k--,j);
                    else if(map.containsValue(j)) map.put(i,k--);
                    else map.put(i,j);
                } 
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(map.containsKey(i) || map.containsValue(j)){
                    matrix[i][j]=0;
                } 
            }
        }
    }
}
