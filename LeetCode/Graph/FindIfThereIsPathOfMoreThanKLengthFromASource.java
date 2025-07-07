// User function Template for Java

class Solution {
    boolean dfs(ArrayList<ArrayList<int[]>> adj, boolean[] vis, int k, int cur){
        if(k<=0) return true;
        for(int i[]: adj.get(cur)){
            int v=i[0], w=i[1];
            if(vis[v]) continue;
            vis[v] = true;
            if(dfs(adj, vis, k-w, v)){
                return true;
            }
            vis[v] = false;
        }
        return false;
    }
    boolean pathMoreThanK(int V, int E, int K, int[] A) {
        boolean[] vis = new boolean[V];
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0; i<V; i++) adj.add(new ArrayList<>());
        for(int i=0; i<E*3; i+=3){
            int u=A[i], v=A[i+1], w=A[i+2];
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }
        vis[0] = true;
        return dfs(adj, vis, K, 0);
    }
}
