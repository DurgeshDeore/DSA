class Solution {
    boolean isSafe(ArrayList<ArrayList<Integer>> adj, int[] col, int c, int cur){
        for(int n: adj.get(cur)){
            if(col[n] == c) return false;
        }
        return true;
    }
    boolean dfs(ArrayList<ArrayList<Integer>> adj, int[] col, int v, int m, int cur){
        if(cur == v) return true;
        for(int c=0; c<m; c++){
            if(isSafe(adj, col, c, cur)){
                col[cur] = c;
                if(dfs(adj,col, v, m, cur+1)) return true;
                col[cur] = -1;
            }
        }
        return false;
    }
    boolean graphColoring(int v, int[][] edges, int m) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<v; i++) adj.add(new ArrayList<>());
        for(int i=0; i<edges.length; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int[] col = new int[v];
        Arrays.fill(col, -1);
        return dfs(adj,col, v, m, 0);
    }
}
