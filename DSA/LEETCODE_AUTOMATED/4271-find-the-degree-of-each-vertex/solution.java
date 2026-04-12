class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] res = new int[n];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++) graph.add(new ArrayList<>());
        for(int i=0; i<n; i++){
            for(int dest: matrix[i]){
                if(dest == 1)
                    graph.get(i).add(dest);
            }
        }
        for(int i=0; i<n; i++){
            res[i] = graph.get(i).size();
        }
        return res;
    }
}
