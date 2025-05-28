class Solution {
    
    public class Edge {
        int src, dest, wt;
        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    
    public class Pair implements Comparable<Pair> {
        int n, dis;
        Pair(int n, int dis){
            this.n =n;
            this.dis = dis;
        }
        @Override
        public int compareTo(Pair p){
            return this.dis - p.dis;
        }
    }
    //main function
    public int[] dijkstra(int V, int[][] edges, int src) {
        int[] res = new int[V];
        boolean[] vis = new boolean[V];
        //make +infinity
        for(int i=0; i<V; i++){
            if(i!=src) res[i] = Integer.MAX_VALUE;
        }
        //create the graph
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<edges.length; i++){
            int s=edges[i][0], d=edges[i][1], w=edges[i][2];
            graph[s].add(new Edge(s,d,w));
            
        }
        //main logic
        PriorityQueue<Pair> pq =new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()){
            Pair cur = pq.poll();
            if(!vis[cur.n]){
                vis[cur.n] = true;
                for(Edge e: graph[cur.n]){
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(res[u]+wt < res[v]){
                        res[v] = res[u]+wt;
                        pq.add(new Pair(v, res[v]));
                    }
                }
            }
        }
        return res;
    }
    
}
