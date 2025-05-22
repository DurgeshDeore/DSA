class Solution {
    public void allPaths(List<List<Integer>> adj, List<List<Integer>> res, List<Integer> cur, int src, int dest){
        cur.add(src);
        if(src == dest){
            res.add(new ArrayList<>(cur));
        }else{
            for(int e: adj.get(src)){
                allPaths(adj, res, cur, e, dest);
            }
        }
        cur.remove(cur.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int v = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        // List<Integer> cur = ;
        
        for(int i=0; i<v; i++) adj.add(new ArrayList<>());
        for(int i=0; i<v; i++){
            for(int e: graph[i]){
                adj.get(i).add(e);
            }
        }
        allPaths(adj, res, new ArrayList<>(), 0, v-1);
        return res;
    }
}
