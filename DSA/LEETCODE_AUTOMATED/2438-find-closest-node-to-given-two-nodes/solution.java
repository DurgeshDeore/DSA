class Solution {
    public void dfs(int[] edges, int cur, int[] dist){
        Arrays.fill(dist,Integer.MAX_VALUE);
        int d=0;
        while(cur != -1 && dist[cur] == Integer.MAX_VALUE){
            dist[cur] = d++;
            cur = edges[cur];
        }
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int v = edges.length, min=Integer.MAX_VALUE, res=-1;
        int[] dist1 = new int[v];
        int[] dist2 = new int[v];
        dfs(edges, node1, dist1);
        dfs(edges, node2, dist2);

        for(int i=0; i<v; i++){
            if(dist1[i] >= 0 && dist2[i] >=0){
                int max = Math.max(dist1[i], dist2[i]);
                if(max < min){
                    min = max;
                    res = i;
                }
            }
        }
        return res;
    }
}
