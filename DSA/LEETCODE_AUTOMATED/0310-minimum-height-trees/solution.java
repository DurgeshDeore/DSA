class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        // treverse all node n^2
        // topological sort - cnt indegree and remove the leaf nodes there must be nodes < 2 as MHT
        int rem = n;
        if(n == 1) return new ArrayList<>(List.of(0));
        int[] inDegree = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // create graph 
        for(int i=0; i<n; i++) graph.add(new ArrayList<>());

        for(int[] edge: edges){
            inDegree[edge[0]] += 1;
            inDegree[edge[1]] += 1;
            graph.get(edge[1]).add(edge[0]);
            graph.get(edge[0]).add(edge[1]);
        }

        for(int i=0; i<n; i++){
            if(inDegree[i] == 1) queue.add(i);
        }

        while(rem > 2){
            int size = queue.size();
            rem -= size;
            for(int i=0; i<size; i++){
                int cur = queue.poll();
                for(int neg: graph.get(cur)){
                    inDegree[neg] -= 1;
                    if(inDegree[neg] == 1) queue.add(neg);
                }
            }
        }

        return new ArrayList<>(queue);
    }
}
