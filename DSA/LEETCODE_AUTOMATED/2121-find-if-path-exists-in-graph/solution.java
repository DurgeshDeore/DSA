class Solution {
    public boolean util(ArrayList<ArrayList<Integer>> adj,boolean[] vis, int src, int dest) {
        if(src == dest) return true;
        vis[src] = true;
        for(int n: adj.get(src)){
            if(!vis[n]){
                if(util(adj, vis, n, dest)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] vis = new boolean[n];
        for(int i=0; i<n; i++) adj.add(new ArrayList<>()); 
        for(int i=0; i<edges.length; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        return util(adj, vis, source, destination);
    }
}
