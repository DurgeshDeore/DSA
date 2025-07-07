class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0; i<n; i++) adj.add(new ArrayList<>());
        for(int i=0; i<flights.length; i++){
            int u=flights[i][0], v=flights[i][1], w=flights[i][2];
            adj.get(u).add(new int[]{v, w});
        }

        int dist[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{src, 0, 0});
        while(!q.isEmpty()){
            int[] cur = q.remove();
            int u = cur[0];
            int cost = cur[1];
            int stops = cur[2];
            if(stops > k) continue;
            for(int i[]: adj.get(u)){
                int v = i[0], w = i[1];
                if(dist[v] > cost+w){
                    dist[v] = cost+w;
                    q.add(new int[]{v, dist[v], stops+1});
                }
            }
        }
        return dist[dst]==Integer.MAX_VALUE? -1: dist[dst];
    }
}
