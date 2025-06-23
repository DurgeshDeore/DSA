class Solution {
    public void topoSort(ArrayList<ArrayList<Integer>> adj, Stack<Integer> stack, boolean[] vis, int cur){
        vis[cur] =true;
        for(int n: adj.get(cur)){
            if(!vis[n]){
                topoSort(adj, stack, vis, n);
            }
        }
        stack.push(cur);
    }
    public void util(ArrayList<ArrayList<Integer>> clone, boolean[] vis, int cur){
        vis[cur] = true;
        for(int n: clone.get(cur)){
            if(!vis[n]){
                util(clone, vis, n);
            }
        }
    }
    public int kosaraju(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size(), res = 0;
        boolean[] vis = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<V; i++){
            if(!vis[i]){
                topoSort(adj, stack, vis, i);
            }
        }
        
        ArrayList<ArrayList<Integer>> clone = new ArrayList<>();
        for(int i=0; i<V; i++) clone.add(new ArrayList<>());
        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) {
                clone.get(v).add(u);
            }
        }
        
        Arrays.fill(vis, false);
        for(int i=0; i<V; i++){
            int cur = stack.pop();
            if(!vis[cur]){
                res++;
                util(clone, vis, cur);
            }
        }
        return res;
    }
}
