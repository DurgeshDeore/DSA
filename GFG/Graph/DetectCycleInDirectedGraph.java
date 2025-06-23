class Solution {
    public boolean util(ArrayList<Integer>[] adj, boolean[] vis, boolean[] stack, int cur){
        vis[cur] = true;
        stack[cur] = true;
        for(int n: adj[cur]){
            if(!vis[n]){
                if(util(adj, vis, stack, n)){
                    return true;
                }
            }else if(stack[n]){
                return true;
            }
        }
        stack[cur] = false;
        return false;
    }
    public boolean isCyclic(int V, int[][] edges) {
        boolean[] vis = new boolean[V];
        boolean[] stack = new boolean[V];
        ArrayList<Integer>[] adj = new ArrayList[V];
        for(int i=0; i<V; i++) adj[i] = new ArrayList<>();
        for(int[] e: edges){
            adj[e[0]].add(e[1]);
        }
        for(int i=0; i<V; i++){
            if(!vis[i]){
                if(util(adj, vis, stack, i)){
                    return true;
                }
            }
        }
        return false;
    }
}
