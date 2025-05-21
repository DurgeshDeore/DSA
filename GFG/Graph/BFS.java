class Solution {
    public void bfsUtil(ArrayList<ArrayList<Integer>> adj, boolean[] vis, Queue<Integer> q, ArrayList<Integer> res, int cur) {
        while(!q.isEmpty()){
            int i=q.remove();
            if(!vis[i]){
                res.add(i);
                vis[i] = true;
                for(int n: adj.get(i)){
                    q.add(n);
                }
            }
        }
    }
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        ArrayList<Integer> res= new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[V];
        q.add(0);
        for(int i=0; i<V; i++){
            if(!vis[i]){
                bfsUtil(adj,vis,q,res,i);
            }
        }
        return res;
    }
}
