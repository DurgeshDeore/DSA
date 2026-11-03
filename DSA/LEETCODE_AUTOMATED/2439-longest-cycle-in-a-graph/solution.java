class Solution {
    public ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public int getCycleLen(boolean[] vis, int start, int cur, int len){
        if(vis[cur]) return len;
        vis[cur] = true;
        int curLen = 0;
        for(int neg: graph.get(cur)){
            if(neg == start) return len+1;
            curLen = getCycleLen(vis, start, neg, len+1);
        }
        return curLen;
    }
    public int longestCycle(int[] edges) {
        boolean flag = false;
        int n = edges.length, maxDist = -1;
        boolean[] cycleVis = new boolean[n];
        boolean[] vis = new boolean[n];
        int[] inDeg = new int[n];
        Queue<Integer> queue = new LinkedList<>();

        // create the graph
        for(int i=0; i<n; i++) graph.add(new ArrayList<>());
        for(int i=0; i<n; i++) {
            if(edges[i] != -1) {
                inDeg[edges[i]] += 1;
                graph.get(i).add(edges[i]);
            }
        }
        for(int i=0; i<n; i++) {
            if(inDeg[i] == 0) queue.add(i);
        }
        while(!queue.isEmpty()){
            int cur = queue.poll();
            vis[cur] = true;
            for(int neg: graph.get(cur)){
                inDeg[neg] -= 1;
                if(inDeg[neg] == 0) queue.add(neg);
            }
        }

        for(int i=0; i<n; i++){
            if(!vis[i] && !cycleVis[i]){
                int len = getCycleLen(cycleVis, i, i, 0);
                maxDist = Math.max(maxDist, len);
            }
        }
        return maxDist;
    }
}
