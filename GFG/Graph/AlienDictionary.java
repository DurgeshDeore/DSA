class Solution {
    public static void dfs(ArrayList<ArrayList<Integer>> adj, Stack<Integer> s, boolean[] vis, int cur){
        vis[cur] = true;
        for(int n: adj.get(cur)){
            if(!vis[n]){
                dfs(adj, s, vis, n);
            }
        }
        s.push(cur);
    }
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        boolean[] vis = new boolean[V];
        Stack<Integer> s = new Stack<>();
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++) adj.add(new ArrayList<>());
        for(int i=0; i<edges.length; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        
        for(int i=0; i<V; i++){
            if(!vis[i]) dfs(adj, s, vis, i);
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        while(!s.isEmpty()) res.add(s.pop());
        
        return res;
    }
}
