class Solution {
    public static void topoSortUtil(ArrayList<ArrayList<Integer>> adj, boolean[] vis, Stack<Integer> stack, int cur){
        vis[cur] = true;
        for(int i: adj.get(cur)){
            if(!vis[i]){
                topoSortUtil(adj, vis, stack, i);
            }
        }
        stack.push(cur);
    }
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {

        boolean[] vis = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]); 
        }
        
        for(int i=0; i<V; i++){
            if(!vis[i]){
                topoSortUtil(adj, vis, stack, i);
            }
        }
        while(!stack.isEmpty()) res.add(stack.pop());
        return res;
    }
}
