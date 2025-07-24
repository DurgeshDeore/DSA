class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < V; i++) graph.add(new ArrayList<>());
        int[] indeg = new int[V];
        for(int[] e : edges){
            graph.get(e[0]).add(e[1]);
            indeg[e[1]]++;
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i <V; i++){
            if(indeg[i] == 0) q.add(i);
        }
        int cnt=0;
        while(!q.isEmpty()){
            int cur = q.poll();
            cnt++;
            for(int i: graph.get(cur)){
                indeg[i]--;
                if(indeg[i]==0) q.add(i);
            }
        }
        return cnt != V;
    }
}
