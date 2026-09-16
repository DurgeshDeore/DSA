class Solution {
    public boolean isBipartite(int[][] graph) {
        // tric - if odd cycle then false else true
        // approach- BFS coloring 
        int n = graph.length;
        int[] colors = new int[n];
        Queue<Integer> q = new LinkedList<>();
        Arrays.fill(colors, -1);  // 1, 2
        for(int i=0; i<n; i++){
            if(colors[i] == -1){
                q.add(i);
                colors[i] = 1;
                while(!q.isEmpty()){
                    int u = q.poll();
                    for(int v: graph[u]){
                        if(colors[v] != -1){
                            if(colors[v] == colors[u]) return false;
                            continue;
                        }
                        int nextCol = colors[u] == 1? 2: 1;
                        colors[v] = nextCol;
                        q.add(v);
                    }
                }
            }
        }
        return true;
    }
}
