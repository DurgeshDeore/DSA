class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] inDegree = new int[n];
        boolean[] isSafe = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();      
        List<Integer> res = new ArrayList<>();   
        List<List<Integer>> adj = new ArrayList<>();   

        for(int i=0; i<n; i++) adj.add(new ArrayList<>());

        for(int i=0; i<n; i++){
            for(int neg: graph[i]){
                inDegree[i] += 1;
                adj.get(neg).add(i);
            }
        }

        for(int i=0; i<n; i++){
            if(inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            int cur = queue.poll();
            isSafe[cur] = true;
            for(int neg: adj.get(cur)){
                inDegree[neg] -= 1;
                if(inDegree[neg] == 0) {
                    queue.add(neg);
                }
            }
        }

        for(int i=0; i<n; i++){
            if(isSafe[i]) res.add(i);
        }

        return res;
    }
}
