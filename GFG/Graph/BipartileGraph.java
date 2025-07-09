class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] col, int v, int cur){
        for(int i: adj.get(cur)){
            if(col[i] == col[cur]){
                return false;
            }else if(col[i] == -1){
                int nxtCol = col[cur] == 0? 1: 0;
                col[i] = nxtCol;
                if(!dfs(adj, col, v, i)) return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++) adj.add(new ArrayList<>());
        for(int i=0; i<edges.length; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int[] col = new int[V];
        Arrays.fill(col, -1);

        for(int i=0; i<V; i++){
            if(col[i] == -1){
                col[i] = 0;
                if(!dfs(adj,col, V, 0)) return false;
            }
        }
        return true;
    }
}
