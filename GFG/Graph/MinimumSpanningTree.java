class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        int res = 0;
        boolean[] vis = new boolean[V];
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        pq.add(new int[]{0,0});
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            if(!vis[cur[0]]){
                vis[cur[0]] = true;
                res += cur[1];
                for(int[] arr: adj.get(cur[0])){
                    if(!vis[arr[0]]){
                        pq.add(new int[]{arr[0], arr[1]});
                    }
                }
            }
        }
        return res;
    }
}
