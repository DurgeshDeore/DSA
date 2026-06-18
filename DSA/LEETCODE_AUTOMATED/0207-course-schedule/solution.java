class Solution {
    public boolean isCycle(ArrayList<ArrayList<Integer>> graph, boolean[] isVisited, boolean[] pathVisited, int indx){
        isVisited[indx] = true;
        pathVisited[indx] = true;
        for(int neg: graph.get(indx)){
            if(!isVisited[neg]) {
                if(isCycle(graph, isVisited, pathVisited, neg)) return true; // imp
            }else if(pathVisited[neg]){
                return true;
            }
        }
        pathVisited[indx] = false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=prerequisites.length;
        if(n == 1) return true;
        boolean[] isVisited = new boolean[numCourses];
        boolean[] pathVisited = new boolean[numCourses];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // create graph 
        for(int i=0; i<numCourses; i++) graph.add(new ArrayList<>());
        for(int[] prerequisite: prerequisites){
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }

        //find the cycle
        for(int i=0; i<numCourses; i++){
            if(!isVisited[i]){
                if(isCycle(graph, isVisited, pathVisited, i)) return false;
            }
        }
        return true;
    }
}
