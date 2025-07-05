class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        int dist[] = new int[V];
        Arrays.fill(dist, (int)1e8);
        dist[src] = 0;
        for(int i=0; i<V; i++){
            for(int[] edge :edges){
                int u = edge[0], v = edge[1], wt = edge[2];
                if(dist[u] != 1e8 && dist[v] > dist[u] + wt){
                    if(i == V-1) return new int[]{-1};
                    dist[v] = dist[u] + wt;
                }
            }
        }
        return dist;
    }
}
