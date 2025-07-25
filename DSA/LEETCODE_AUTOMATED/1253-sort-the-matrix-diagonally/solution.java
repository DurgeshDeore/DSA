class Solution {
    public int[][] diagonalSort(int[][] mat) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                int key = i-j;
                map.computeIfAbsent(key, k -> new PriorityQueue<>()).add(mat[i][j]);
            }
        }
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                int key = i-j;
                mat[i][j] = map.get(key).poll();
            }
        }
        return mat;
    }
}
