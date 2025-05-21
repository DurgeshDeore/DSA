class Solution {
     public void dfsUtil(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res, boolean[] visited, int cur){
        res.add(cur);
        visited[cur] = true;
        for(int a: adj.get(cur)){
            if(!visited[a]){
                dfsUtil(adj,res,visited,a);
            }
        }
     }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean visited[] = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<V; i++){
            if(!visited[i]){
                dfsUtil(adj,res,visited,i);
            }
        }
        return res;
    }
}
