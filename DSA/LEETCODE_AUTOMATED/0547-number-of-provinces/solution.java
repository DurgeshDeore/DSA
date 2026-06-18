class Solution {
    public void traverse(ArrayList<ArrayList<Integer>> graph, boolean[] isVisited, int indx){
        isVisited[indx] = true;
        for(int neg: graph.get(indx)){
            if(!isVisited[neg]) traverse(graph, isVisited, neg);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length, provinces=0;
        boolean[] isVisited = new boolean[n];
        
        // create graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++) graph.add(new ArrayList<>());
        
        for(int i=0; i<n; i++){
            int m = isConnected.length;
            for(int j=0; j<m; j++){
                if(isConnected[i][j] == 1) graph.get(i).add(j);
            }
        }

        // traavese the graph and make it visible
        for(int i=0; i<n; i++){
            if(!isVisited[i]){
                traverse(graph, isVisited, i);
                provinces += 1;
            }
        }

        return provinces;
    }
}
