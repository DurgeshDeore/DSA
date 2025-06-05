class Solution {
    public int util(ArrayList<ArrayList<Integer>> adj, boolean[] vis, Integer[] memo, int src, int dest){
        if(src == dest){
            return 1;
        }
        if(memo[src] != null){
            return memo[src];
        }
        vis[src] = true;
        int cnt = 0;
        for(int n: adj.get(src)){
            if(!vis[n]){
                cnt += util(adj, vis, memo, n, dest);
            }
        }
        vis[src] = false;
        memo[src] = cnt;
        return cnt;
     }
    public int countPaths(int[][] edges, int V, int src, int dest) {
        Integer[] memo = new Integer[V];
        boolean[] vis = new boolean[V];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++) adj.add(new ArrayList<>());
        for(int i=0; i<edges.length; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        
        return util(adj, vis, memo, src, dest);
    }
}
